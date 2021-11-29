package dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.DonMuaDao;
import entity.HoaDon;
import entity.KhachHang;
import entity.SanPham;
import util.HibernateUtil;

public class DonMuaImpl extends UnicastRemoteObject implements DonMuaDao{
	SessionFactory sessionFactory;
	public DonMuaImpl() throws RemoteException {
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2447924881012371664L;

	public boolean themDonMua(String maSanPham, int soLuong, float donGia) throws RemoteException {
		int stt = loadStt();
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
				HoaDon hoaDon = new HoaDon();
				hoaDon.setMaHoaDon("HD"+stt);
					Timestamp ts = new Timestamp(System.currentTimeMillis());
				hoaDon.setNgayLapHoaDon(ts);
				hoaDon.setStt(stt);
					float tt = (float) soLuong * donGia;
				hoaDon.setTongTien(tt);
				hoaDon.setTrangThai("Chưa thanh toán");
				hoaDon.setKhachHang(null);
				hoaDon.setNhanVien(null);
					List<SanPham> ls = new ArrayList<SanPham>();
					ls = session.createNativeQuery("SELECT * FROM SanPham WHERE maSanPham = '"+maSanPham+"'",SanPham.class).list();
				for (Iterator iterator = ls.iterator(); iterator.hasNext();) {
					SanPham sanPham = (SanPham) iterator.next();
					hoaDon.setSanPham(sanPham);
				}
				session.save(hoaDon);
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		} finally {
			session.close();
		}
		return false;
	}
	
	public int loadStt() {
		int stt = 0;
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			HoaDon hd = new HoaDon();
			tr.begin();
				hd = session.createNativeQuery("select top 1 * from HoaDon order by stt desc", HoaDon.class).getSingleResult();
			tr.commit();
			stt = hd.getStt();
			stt++;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		} finally {
			session.close();
		}
		return stt;
	}
}

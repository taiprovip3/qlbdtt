package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.NhaCungCap;
import entity.PhanLoai;
import entity.SanPham;
import net.bytebuddy.asm.Advice.Return;
import net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager;
import util.HibernateUtil;

public class SanPhamDao {
	SessionFactory sessionFactory;
	private static int stt;
	public SanPhamDao() {
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	}
	public boolean themSanPham(String maSanPham, float donGia, String moTa, int soLuongTon, String tenSanPham, String maNhaCungCap, String tenPhanLoai) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
				SanPham sanPham = new SanPham();
				NhaCungCap nhaCungCap = new NhaCungCap();
				PhanLoai phanLoai = new PhanLoai();
				nhaCungCap = session.createNativeQuery("SELECT * FROM NhaCungCap WHERE maNhaCungCap = '"+maNhaCungCap+"'",NhaCungCap.class).getSingleResult();
				phanLoai = session.createNativeQuery("select * from PhanLoai where tenPhanLoai = N'"+tenPhanLoai+"'", PhanLoai.class).getSingleResult();
				
				sanPham.setMaSanPham(maSanPham);
				sanPham.setDonGia(donGia);
				sanPham.setMoTa(moTa);
				sanPham.setSoLuongTon(soLuongTon);
				sanPham.setStt(stt);
				sanPham.setTenSanPham(tenSanPham);
				sanPham.setNhaCungCap(nhaCungCap);
				sanPham.setPhanLoai(phanLoai);
				
				session.save(sanPham);
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
	public boolean suaSanPham(String ma,String ten,int sl,float dg,String mota,String maNCC,String maPL) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
//				SanPham sanPham = new SanPham();
//				NhaCungCap nhaCungCap = new NhaCungCap();
//				PhanLoai phanLoai = new PhanLoai();
//				nhaCungCap = session.createNativeQuery("SELECT * FROM NhaCungCap WHERE maNhaCungCap = '"+maNCC+"'",NhaCungCap.class).getSingleResult();
//				phanLoai = session.createNativeQuery("select * from PhanLoai where maPhanLoai = '"+maPL+"'", PhanLoai.class).getSingleResult();
//				sanPham.setMaSanPham(ma);
//				sanPham.setDonGia(dg);
//				sanPham.setMoTa(mota);
//				sanPham.setSoLuongTon(sl);
//				sanPham.setStt(stt);
//				sanPham.setTenSanPham(ten);
//				sanPham.setNhaCungCap(nhaCungCap);
//				sanPham.setPhanLoai(phanLoai);

				String hql = "update SanPham set tenSanPham = :ten, soLuongTon = :sl, donGia = :dg, moTa = :mota, maNhaCungCap = :maNCC, maPhanLoai = :maPL where maSanPham = :ma";
				Query query = session.createQuery(hql);
				query.setParameter("ten", ten);
				query.setParameter("sl", sl);
				query.setParameter("dg", dg);
				query.setParameter("mota", mota);
				query.setParameter("maNCC", maNCC);
				query.setParameter("maPL", maPL);
				query.setParameter("ma", ma);
				System.out.println(ma);
				int result = query.executeUpdate();
				System.out.println("Rows affected: " + result);
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
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			SanPham sp = new SanPham();
			tr.begin();
				sp = session.createNativeQuery("select top 1 * from SanPham order by stt desc", SanPham.class).getSingleResult();
			tr.commit();
			stt = sp.getStt();
			stt++;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		} finally {
			session.close();
		}
		return stt;
	}
	public boolean xoaSanPham(String ma) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
				SanPham sp = new SanPham();
				sp.setMaSanPham(ma);
				session.delete(sp);
				session.flush();
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
}

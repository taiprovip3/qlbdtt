package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import entity.NhanVien;
import entity.SanPham;
import util.HibernateUtil;

public class NhanVienDao {
	SessionFactory sessionFactory;
	public NhanVienDao() {
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	}
	public String getNhanVien(String username) {
		String pw = null;
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		NhanVien nhanVien = new NhanVien();
		try {
			tr.begin();
			List<NhanVien> ls = new ArrayList<NhanVien>();
			ls = session.createNativeQuery("select * from NhanVien where tenDangNhap = '"+username+"'", NhanVien.class).list();
			for (Iterator iterator = ls.iterator(); iterator.hasNext();) {
				NhanVien nv = (NhanVien) iterator.next();
				pw= nv.getMatKhau();
			}
//			String hql = "from NhanVien where tenDangNhap = '"+username+"'";
//			Query query = session.createQuery(hql);
//			List<NhanVien> ls = query.list();
//			System.out.println(ls);
//			
////			nhanVien = session.createNativeQuery("select * from NhanVien where tenDangNhap = '"+username+"'", NhanVien.class).getSingleResult();
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
		} finally {
			session.close();
		}
		return pw;
	}
}

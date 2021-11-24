package util;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import entity.HoaDon;
import entity.KhachHang;
import entity.NhaCungCap;
import entity.NhanVien;
import entity.PhanLoai;
import entity.SanPham;

public class HibernateUtil {
	private static HibernateUtil instance;
	private SessionFactory sessionFactory;
	public HibernateUtil() {

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure()//hibernate.cfg.xml
				.build();
		
		Metadata metadata = new MetadataSources(serviceRegistry)
				.addAnnotatedClass(HoaDon.class)
				.addAnnotatedClass(KhachHang.class)
				.addAnnotatedClass(NhaCungCap.class)
				.addAnnotatedClass(NhanVien.class)
				.addAnnotatedClass(PhanLoai.class)
				.addAnnotatedClass(SanPham.class)
				.getMetadataBuilder()
				.build();
		
		sessionFactory = metadata
				.getSessionFactoryBuilder()
				.unwrap(SessionFactoryBuilder.class)
				.build();
	}
	public static HibernateUtil getInstance() {
		if(instance == null)
			instance = new HibernateUtil();
		return instance;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}

package app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		Transaction tr = session.getTransaction(); 
		try {
			tr.begin();
	
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

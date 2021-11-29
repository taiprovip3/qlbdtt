package app;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import chatServer.ChatImpl;
import chatServer.ChatInterface;
import dao.DonMuaDao;
import dao.impl.DonMuaImpl;
import util.HibernateUtil;

public class App {
	public static void main(String[] args) throws RemoteException, NamingException {
		SecurityManager securityManager = System.getSecurityManager();
		if(securityManager == null) {
			System.setProperty("java.security.policy", "rmi/policy.policy");
			securityManager = new SecurityManager();
			System.setSecurityManager(securityManager);
		}
		
		DonMuaDao donMuaDao = new DonMuaImpl();
		ChatInterface chatInterface = new ChatImpl();
		LocateRegistry.createRegistry(1090);
		Context context = new InitialContext();
		context.bind("rmi://192.168.1.8:1090/donMuaDao", donMuaDao);
		context.bind("rmi://192.168.1.8:1090/chatInterface", chatInterface);
		System.out.println("Server bound to rmi!");
	}
	
}

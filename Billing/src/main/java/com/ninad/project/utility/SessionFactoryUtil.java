package com.ninad.project.utility;

import java.util.HashMap;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;







public class SessionFactoryUtil {
	
	private static SessionFactory SF =null ;
	public static String user;
	
	HashMap <String, SessionFactory> hm = null;
	
	public static SessionFactory getSessionFacory (){
		
		if (SF == null) {			
			SF = new Configuration().configure().buildSessionFactory();
		    }
		
		return SF;				
	}
		

	private static SessionFactory sf=null;
	public static SessionFactory sessionFactory()
	{
		if(sf==null)
		{
			sf=new Configuration().configure().buildSessionFactory();
		}
		return sf;
	}
	
	
	public static String getloggedUser (){
		
		return user;
	}
	
   
	
	
	
	
	
	
	

}

package com.ninad.project.utility;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.QueryTimeoutException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ninad.project.models.User;

public class GenricDao {

	public static SessionFactory SF = SessionFactoryUtil.getSessionFacory();
	
	public static <T> List<T>   getList (Class T){
		
		Session s = SF.openSession();
		Transaction tr = s.beginTransaction();
		
		Criteria cr = s.createCriteria(T);	
		List<T> list = cr.list();
		s.close();
		return list;
	
	}
	
	
	public static <T> T getObject (Class T , int id)  {
		
		Session s = SF.openSession();
		Transaction tr = s.beginTransaction();
		T myob =(T) s.get(T,id);
		
		return myob;
	}
	
	public static <T> int saveOrUpdate (T o) {
		
		int id = 00;
		Session s = SF.openSession();
		Transaction tr = s.beginTransaction();
		
		s.saveOrUpdate(o);
		s.flush();
		tr.commit();
		s.close();
		return 1;
		
	}
	
	
	
	
	
}

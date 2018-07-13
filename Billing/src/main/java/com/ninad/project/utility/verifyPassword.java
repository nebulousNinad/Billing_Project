package com.ninad.project.utility;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ninad.project.models.User;

public class verifyPassword {

	
	
	
	
	
	public static boolean  verify (String uname , String pwd) {
		boolean flag = false;
		SessionFactory SF=SessionFactoryUtil.getSessionFacory();
		
		Session s =SF.openSession();
		Transaction Tr = s.beginTransaction();
		
		List ulist = GenricDao.getList(User.class);
		
		for (Object o : ulist){
			User u = (User)o;
			
			
			if (u.getUserName().equals(uname))
			{    
				System.out.println("username exists...");
				if (u.getPassword().equals(pwd)){
					System.out.println("Valid Username and Password");
					SessionFactoryUtil.user = uname;                    
					flag = true;
				}
			}
			else{
				//System.err.println("USER DOSENT EXIST");				
			}
			
			
		}
		
		if (flag ==  false) {
			System.err.println("Username Dosent Exist");
		}
		else {
			   String loggduser = SessionFactoryUtil.getloggedUser();
			   System.out.println("user  "+loggduser);
		}
		
		
	
	   return flag;

	}
}

package com.ninad.project.serviceImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ninad.project.models.User;
import com.ninad.project.services.UserService;
import com.ninad.project.utility.GenricDao;
import com.ninad.project.utility.SessionFactoryUtil;

public class userServiceImpl implements UserService {

	public int addUser(User user) {

		GenricDao.saveOrUpdate(user);
		
		return 1;
	}

	public int removeUser(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User updateUser(User user) {
		
		
		// TODO Auto-generated method stub
		return null;
	}

	public User getuser(int userId) {

		SessionFactory SF = SessionFactoryUtil.getSessionFacory();
		
		Session s =SF.openSession();
		User u =s.get(User.class, userId);
		
//         User u = GenricDao.getObject(User.class, 1);
		
		return u;
	}

	public List<User> getUserList() {
		List <User> userlist = null ;
		
		return userlist;
	}

}

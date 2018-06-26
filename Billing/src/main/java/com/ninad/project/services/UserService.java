package com.ninad.project.services;

import java.util.List;

import com.ninad.project.models.User;

public interface UserService {
	
	public int addUser (User user);
	public int removeUser(int userId);
	public User updateUser(User user );
	public User getuser (int userId); 
	public List <User> getUserList ();
	
	

}

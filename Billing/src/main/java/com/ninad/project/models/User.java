package com.ninad.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
     
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int userId;
	private String userName;
	private String password;
	private String roll;
	private int salary;
	private String city;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String userName, String password, String roll, int salary, String city) {
		super();
		this.userName = userName;
		this.password = password;
		this.roll = roll;
		this.salary = salary;
		this.city = city;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRoll() {
		return roll;
	}


	public void setRoll(String roll) {
		this.roll = roll;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", roll=" + roll
				+ ", salary=" + salary + ", city=" + city + "]";
	}
	
	
	
	
}

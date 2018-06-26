package com.ninad.project.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Embeddable
public class Customer implements Serializable {
	
	
	
	private int custId;
	private String custName;
	private String city;
	private String mobileNo;
	private double balance;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(String custName, String city, String mobileNo, double balance) {
		super();
		this.custName = custName;
		this.city = city;
		this.mobileNo = mobileNo;
		this.balance = balance;
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	

}

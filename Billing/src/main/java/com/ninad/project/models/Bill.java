package com.ninad.project.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="my_seq_gen")
	@SequenceGenerator(name="my_seq_gen", sequenceName="bill_seq",allocationSize=1)
	private int bill_Id;
	private Date date;
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="cust")
	private Customer custommer;
	
	/*
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	  @JoinTable(
	            name = "Bill_PRODUCTS",
	            		 @Column
	            		@Id
	            		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="my_seq_gen")
	            		@SequenceGenerator(name="my_seq_gen", sequenceName="bp_seq",allocationSize=1)
	            private int bpid;
	            joinColumns = {@JoinColumn(name = "BILL_info" , referencedColumnName= "bill_Id" ), @JoinColumn(name = "qty",referencedColumnName= "quantity" )},
	            inverseJoinColumns = @JoinColumn(name = "PRODUCTS_ID")
	            
	            
	    )
	private List<Product>  productlist;

	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER   ,targetEntity=Double.class)
	@ElementCollection(targetClass=Double.class)
	private List <Double> qtylist ;
	*/
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name ="Transaction_Id")
	private Transaction transaction;
	
	private double ammount;
	private String poc;
	
	
	
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	

	public Bill(Date date, Customer custommer, Transaction transaction, double ammount, String poc) {
		super();
		this.date = date;
		this.custommer = custommer;
		this.transaction = transaction;
		this.ammount = ammount;
		this.poc = poc;
	}






	public Transaction getTransaction() {
		return transaction;
	}






	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}






	public int getBill_Id() {
		return bill_Id;
	}

	public void setBill_Id(int bill_Id) {
		this.bill_Id = bill_Id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public Customer getCustommer() {
		return custommer;
	}

	public void setCustommer(Customer custommer) {
		this.custommer = custommer;
	}

	
	
	
	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public String getPoc() {
		return poc;
	}

	public void setPoc(String poc) {
		this.poc = poc;
	}
	
	
	
	
}

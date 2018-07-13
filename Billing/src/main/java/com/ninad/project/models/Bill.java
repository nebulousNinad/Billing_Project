package com.ninad.project.models;

import java.sql.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class Bill {

	
	private int bill_Id;
	private Date date;
	private Customer custommer;
	private Product product;
	private double quantity;
	private double ammount;
	private String poc;
	
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(Date date, Customer custommer, Product product, double quantity, double ammount, String poc) {
		super();
		this.date = date;
		this.custommer = custommer;
		this.product = product;
		this.quantity = quantity;
		this.ammount = ammount;
		this.poc = poc;
	}

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="my_seq_gen")
	@SequenceGenerator(name="my_seq_gen", sequenceName="bill_seq",allocationSize=1)
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

	@Access(AccessType.PROPERTY)
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn
	public Customer getCustommer() {
		return custommer;
	}

	public void setCustommer(Customer custommer) {
		this.custommer = custommer;
	}

	@Access(AccessType.PROPERTY)
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
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

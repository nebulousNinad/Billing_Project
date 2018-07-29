package com.ninad.project.models;

import java.util.HashMap;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Transaction {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="my_seq_gen")
	@SequenceGenerator(name="my_seq_gen", sequenceName="tx_seq",allocationSize=1)
	private int transaction_Id;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	
	private Bill bill;
	
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)	
	private List<Product> productlist;
	
	//@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@ElementCollection(targetClass=Double.class)
	private List<Double> quantity;
	
	private HashMap<Product, Double> prodqty;

	public Transaction(Bill bill, List<Product> productlist, List<Double> quantity, HashMap<Product, Double> prodqty) {
		super();
		this.bill = bill;
		this.productlist = productlist;
		this.quantity = quantity;
		this.prodqty = prodqty;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill getBill() {
		return bill;
	}

	public List<Product> getProductlist() {
		return productlist;
	}

	public List<Double> getQuantity() {
		return quantity;
	}

	public HashMap<Product, Double> getProdqty() {
		return prodqty;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}

	public void setQuantity(List<Double> quantity) {
		this.quantity = quantity;
	}

	public void setProdqty(HashMap<Product, Double> prodqty) {
		this.prodqty = prodqty;
	}

	@Override
	public String toString() {
		return "Transaction [transaction_Id=" + transaction_Id + ", bill=" + bill + ", productlist=" + productlist
				+ ", quantity=" + quantity + ", prodqty=" + prodqty + "]";
	}
	
	
	
}

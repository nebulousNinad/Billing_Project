package com.ninad.project.services;

import java.util.List;

import com.ninad.project.models.Customer;
import com.ninad.project.models.User;

public interface CutomerService {

	public int addCustomer (Customer cust);
	public int removeCustomer(int custd);
	public Customer updateCustomerr(User user );
	public Customer getCustomer (int userId); 
	public List<Customer> getAllCustomers ();
	
	
	
	
}

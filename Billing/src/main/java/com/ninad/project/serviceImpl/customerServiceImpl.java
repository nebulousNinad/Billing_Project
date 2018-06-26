package com.ninad.project.serviceImpl;

import java.util.List;

import com.ninad.project.models.Customer;
import com.ninad.project.models.User;
import com.ninad.project.services.CutomerService;
import com.ninad.project.utility.GenricDao;

public class customerServiceImpl implements CutomerService {

	public int addCustomer( Customer cust) {
		
		GenricDao.saveOrUpdate(cust);
		
		return 0;
	}

	public int removeCustomer(int custd) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Customer updateCustomerr(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCustomer(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return GenricDao.getList(Customer.class);
	}

}

package com.ninad.project.serviceImpl;

import java.util.List;

import com.ninad.project.models.Product;
import com.ninad.project.services.ProductService;
import com.ninad.project.utility.GenricDao;

public class productServiceImpl implements ProductService {

	public int addProduct(Product p) {
		
		GenricDao.saveOrUpdate(p);
		
		return 0;
	}

	public int removeProduct(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Product updateProduct(Product Product) {

           GenricDao.saveOrUpdate(Product);
		return null;
	}

	public Product getProduct(int productId) {
		
		Product p =GenricDao.getObject(Product.class, productId);
		
		
		return p;
	}

	public double getAvailableqty(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Product> getAllProducts() {
		
		List<Product> list  = GenricDao.getList(Product.class);
		return list;
	}

}

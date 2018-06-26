package com.ninad.project.services;

import java.util.List;

import com.ninad.project.models.Customer;
import com.ninad.project.models.Product;
import com.ninad.project.models.User;

public interface ProductService {


	public int addProduct (Product p);
	public List <Product> getAllProducts();
	public int removeProduct(int productId);
	public Product updateProduct(Product Product );
	public Product getProduct (int productId); 
	public double getAvailableqty (int productId);
	
}

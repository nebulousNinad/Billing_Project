package com.ninad.project.services;

import com.ninad.project.models.Bill;
import com.ninad.project.models.Product;

public interface BillService {

	
	public int saveBill (Bill bill);
	public int removeBill(int billId);
	public Bill updateBill(Bill bill );
	public Bill getBill (int billId); 
	
	
	
}

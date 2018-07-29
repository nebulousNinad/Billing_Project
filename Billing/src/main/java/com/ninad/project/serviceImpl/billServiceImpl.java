package com.ninad.project.serviceImpl;

import com.ninad.project.models.Bill;
import com.ninad.project.services.BillService;
import com.ninad.project.utility.GenricDao;

public class billServiceImpl implements BillService {

	public int saveBill(Bill bill) {
		
		GenricDao.saveOrUpdate(bill);
		return 0;
	}

	public int removeBill(int billId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Bill updateBill(Bill bill) {
		// TODO Auto-generated method stub
		return null;
	}

	public Bill getBill(int billId) {
		
		return GenricDao.getObject(Bill.class, billId);
	}

}

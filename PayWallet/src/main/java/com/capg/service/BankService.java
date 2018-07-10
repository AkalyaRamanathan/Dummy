package com.capg.service;

import com.capg.bean.Bank;
import com.capg.dao.BankDao;
import com.capg.dao.IBankDao;

public class BankService implements IBankService {

	BankDao dao =new BankDao();
	public boolean create(Bank bank ) {
		// TODO Auto-generated method stub
		
		return dao.create(bank);
	}


	
	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(amount);
	}



	public boolean deposit(int amount) {
		// TODO Auto-generated method stub
		
		return dao.deposit(amount);
	}


	

	
	
}

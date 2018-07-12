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
		return dao.withdrawAmount(amount);
	}


	public boolean deposit(int amount) {
		// TODO Auto-generated method stub
		
		return dao.depositAmount(amount);
	}


	


	public boolean fundTransfer (int customerId,int amount) {
		// TODO Auto-generated method stub
		return dao.fundTransfer(customerId, amount);
	}


	public boolean printTransaction(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}


	

	
	



	

	public boolean loginAccount(String name, String password) {
		// TODO Auto-generated method stub
		return dao.loginAccount(name, password);
	}


	public int showBalance() {
		// TODO Auto-generated method stub
		return dao.showBalance();
	}}


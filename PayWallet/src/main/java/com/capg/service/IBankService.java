package com.capg.service;

import com.capg.bean.Bank;

public interface IBankService {
	boolean create(Bank bank );
	boolean deposit(int amount);
	boolean withdraw(int amount);
	public int showBalance(); 
	public boolean fundTransfer (int customerId,int amount);
	boolean printTransaction(int customerId);
	public boolean loginAccount(String name, String password);
 
}

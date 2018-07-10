package com.capg.service;

import com.capg.bean.Bank;

public interface IBankService {
	boolean create(Bank bank );
	
	boolean deposit(int amount);
	boolean withdraw(int amount);
	

}


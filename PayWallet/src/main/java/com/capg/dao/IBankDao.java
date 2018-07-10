package com.capg.dao;

import com.capg.bean.Bank;

public interface IBankDao {
	boolean create(Bank bank);
  
	boolean deposit(int amount);
    boolean withdraw(int amount);
    int showbalance(int amount);
   boolean fundtransfer(int AccId,int amount);
}
	
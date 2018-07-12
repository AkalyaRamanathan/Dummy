package com.capg.dao;
import com.capg.bean.Bank;

public interface IBankDao {
	boolean create(Bank bank);
	public int showBalance(); 
	boolean depositAmount(int amount);
    boolean withdrawAmount(int amount);
    public boolean fundTransfer (int customerId,int amount);
   
	boolean printTransaction(int customerId);
	public boolean loginAccount(String name, String password);
   
}
	


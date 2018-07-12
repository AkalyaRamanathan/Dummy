package com.capg.dao;


import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.HashMap;

import com.capg.bean.Bank;

import com.capg.service.BankValidation;


public  class BankDao implements IBankDao {
	Bank bank = new Bank();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static HashMap<String,Bank> map = new HashMap<String,Bank>();
	static Bank bc;
	
	boolean flag;
	int balance;
	public boolean create(Bank bank ) {
		
		map.put(bank.getName(), bank);
		System.out.println(map);
		return true;
	}
	
	public boolean depositAmount(int amount) {
		
		bc.setBalance(bc.getBalance()+amount);
		return true;
	}
		
	public boolean withdrawAmount(int amount) {
		
		BankValidation validate = new BankValidation();
	    boolean isvalid = validate.ValidateWithdraw(amount,bc.getBalance());
		if(isvalid) {
       bc.setBalance(bc.getBalance()-amount);
       System.out.println(bc.getBalance());
       return true;
	}
		else{
		System.out.println("not sufficient balance");
	
		return false;
	}}
	
	public boolean fundTransfer (int customerId,int amount) {
		
		for(String key:map.keySet())
		{
			Bank obj=map.get(key);
			if(obj.getCustomerId()==customerId)
			{
				obj.setBalance(obj.getBalance()+amount);
				bc.setBalance(bc.getBalance()-amount);
				return true;
			}
		}
		return true;
		
	}
	public boolean printTransaction(int customerId) {
	
		return false;
	}

	public boolean loginAccount(String name, String password) {
	
		System.out.println(map);
		for(String key: map.keySet())
		{
			bc=map.get(key);
			if(bc.getName().equals(name)&& bc.getPassword().equals(password))
{
				System.out.println(map);
	return true;
}
			
		}
		return false;
	}

	
	public int showBalance() {
	
		return bc.getBalance();
	}

	

}


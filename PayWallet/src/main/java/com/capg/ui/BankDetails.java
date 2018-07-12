package com.capg.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;




import com.capg.bean.Bank;

import com.capg.exception.InvalidDataException;
import com.capg.service.BankService;

import com.capg.service.BankValidation;

public class BankDetails {
static int Option;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		int choice = 0;
		do {
			int choice1=0;
			
			System.out.println(" \t\t\t   PAYMENT WALLET APPLICATION \t\t\t\t\t\t\n");
			System.out.println("1. CREATE ACCOUNT ");
			System.out.println("2. if already have an account then LOGIN");
			System.out.println("\nHello User......\nEnter Your Choice");
			
			try {
				choice= Integer.parseInt(br.readLine());
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			switch(choice)
			{
			case 1:
				createAccount();
				break;
				
			case 2:
				
				boolean b= loginAccount();
				if(b)
				{
					do {
						
						System.out.println("============================================");
						System.out.println("..........WELCOME..........\n");
						System.out.println("1. SHOW BALANCE");
						System.out.println("2. DEPOSIT AMOUNT");
						System.out.println("3. WITHDRAW AMOUNT ");
						System.out.println("4. FUND TRANSFER");
						System.out.println("5. PRINT TRANSACTION");
						System.out.println("6. SIGN OUT");
						System.out.println("=============================================");
						System.out.println("\nHello User......\nEnter Your Choice");
						
						try {
							choice1 =Integer.parseInt(br.readLine());
						
						
						switch(choice1)
						{
						
						case 1 : 
							showBalance();
							break;
							
						case 2:
							depositAmount();
							break;
							
						case 3 : 
							withdrawAmount();
							break;
							
						case 4:
							fundTransfer();
							break;
							
						case 5:
							printTransaction();
							break;
							
						default :
							break;
						
						
						}
						
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
					}while(choice1!=6);
					
					
				}

				
				
				
				else
				{
					System.out.println("Invalid Login Details..Try Again..");
				}
			break;
			
			
			}
		}while(choice!=3);
		
		
		
	}
	

		public static void createAccount(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Bank bank = new Bank();
			BankValidation validate = new BankValidation();
			
			BankService service = new BankService();
			Random ran=new Random();
			System.out.println("Create an Account");
			
			boolean a=false;
			int customerId=0;
			
			
			
			
			customerId=ran.nextInt(9000000)+1000000;
			try {
				
			
				System.out.println("Enter UserName");
				String name = br.readLine();
				System.out.println("enter Password that should contain minimum 6 letters");
				String password = br.readLine();
				System.out.println("Enter PhoneNumber");
				String phoneNumber= br.readLine();
				System.out.println("Enter Age");
				int age=Integer.parseInt(br.readLine());
				System.out.println("Enter Email");
				String email=br.readLine();
				boolean validname=validate.Validatename(name);
				boolean validepassword=validate.ValidatePassword(password);
				boolean validnum=validate.ValidateNumber(phoneNumber);
				boolean validage=validate.Validateage(age);
				boolean validemail=validate.Validateemail(email);
				bank.setName(name);
				bank.setPassword(password);
				bank.setPhoneNumber(phoneNumber);
				bank.setAge(age);
				bank.setEmail(email);
				
				if(validname && validepassword && validnum && validage && validemail) {
					a=service.create(bank);
					
				}
				else
				{
					System.out.println("Invalid");
				}
				if(a)
				{
					System.out.println("Created Successfully");
					System.out.println("Your id is"+customerId);
					System.out.println("Your UserName is: "+name);
					System.out.println("Your Password is :"+password);
				}
				else {
					System.err.println("account not created");
			}
		
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
		
		public static boolean loginAccount()
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			BankService service = new BankService();
			System.out.println("Enter Your Username");
			String name;
			try {
				name = br.readLine();
			
			System.out.println("Enter Your Password");
			String password = br.readLine();
			
			boolean b= service.loginAccount(name,password);
			if(b)
			{
				return true;
			}
			try {
				throw new InvalidDataException();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return false;
		}
		public static void depositAmount() {
			BankService service = new BankService();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("enter amount to Deposit");
			   int amount;
			try {
				amount = Integer.parseInt(br.readLine());
			
				boolean a=service.deposit(amount);
				if(a) {
				System.out.println("Amount deposited");
				}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
			public static void withdrawAmount() {
				
				BankService service = new BankService();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("enter amount to Withdraw");
			
				try {
					int amount = Integer.parseInt(br.readLine());
				
					
					boolean a=service.withdraw(amount);
					
				
			
				
                //System.out.println(balance);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
         
			}
			public static void showBalance() {
				
				BankService service = new BankService();
				int balance=service.showBalance();
				System.out.println("Your current balance is "+balance);
			}
			public static void fundTransfer() {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BankService service = new BankService();
				System.out.println("enter the accno u need to transfer");
				try {
					int customerId=Integer.parseInt(br.readLine());
					
					System.out.println("Enter Amount to transfer ");
					int amount=Integer.parseInt(br.readLine());
					boolean b=service.fundTransfer(customerId, amount);
					if(b)
					{
						System.out.println("Fund Successfully Transfer");
					}
					else
					{
						System.out.println("Enter Correct input");
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

			private static void printTransaction() {
			// TODO Auto-generated method stub
				Bank bank = new Bank();
				int customerId=bank.getCustomerId();
				BankService service = new BankService();
				System.out.println("your Transaction Details");
				boolean b =service.printTransaction(customerId);
			
		}
			
			
			
			
		

}
	
		
		
		
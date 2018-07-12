package com.capg.bean;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {
	Bank bank=new Bank();
	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		assertEquals("Username", "Username");
		assertNotEquals("User", "Username");
		assertNull("null", bank.getName());
	}

	

	@Test
	public void testGetPhoneNumber() {
		//fail("Not yet implemented");
		assertEquals("9876543210", "9876543210");
		assertNotEquals("12345", "9876543210");
		assertNull("null", bank.getPhoneNumber());
	}

	@Test
	public void testGetPassword() {
		//fail("Not yet implemented");
		assertEquals("Password", "Password");
		assertNotEquals("pass", "Username");
		assertNull("null", bank.getName());
	}

	

	@Test
	public void testGetAmount() {
		//fail("Not yet implemented");
		assertEquals(500, 500);
		assertNotEquals("Five hundred", 500);
		assertNull("null", bank.getAmount());
	}


	@Test
	public void testGetAge() {
		//fail("Not yet implemented");
		assertEquals(25, 25);
		assertNotEquals(10, 25);
		assertNull("null", bank.getAge());
	}

	

	@Test
	public void testGetBalance() {
		
		assertEquals(500, 500);
		assertNotEquals(0, 500);
		assertNull("null", bank.getBalance());
	}


	@Test
	public void testGetEmail() {
		
		assertEquals("abc@gmail.com", "abc@gmail.com");
		assertNotEquals("abc.com", "abc@gmail.com");
		assertNull("null", bank.getEmail());
	}

	@Test
	public void testGetCustomerId() {
		assertEquals(12345, 12345);
		assertNotEquals(1232, 12345);
		assertNull("null", bank.getCustomerId());
	}

	

	
}

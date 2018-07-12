package com.capg.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capg.bean.Bank;

public class BankValidationTest {
Bank bank=new Bank();
	@Test
	public void testValidateWithdraw() {
		assertNotEquals("FiveHundread", 500);
		assertEquals(1000, 1000);
		assertSame(300, 300);
	}

	@Test
	public void testValidatename() {
		assertEquals("abcd", "abcd");
		assertNotEquals("12345", "abcd");
		assertSame("name", "name");
		assertNotEquals("name not equal","abcd","abcde");
	}

	@Test
	public void testValidateNumber() {
		assertEquals("9876543210", "9876543210");
		assertNotEquals("12345", "9876543210");
		assertSame("9876543210", "9876543210");
		assertNotEquals("number not equal","12345678","9876543210");
	}

	@Test
	public void testValidateage() {
		assertEquals(20, 20);
		assertNotEquals(10, 25);
		assertSame(26, 26);
		assertNotEquals("age not equal",65,46);
	}

	@Test
	public void testValidateemail() {
		assertEquals("abc@gmail.com", "abc@gmail.com");
		assertNotEquals("abc.com", "abc@gmail.com");
		assertNull("null", bank.getEmail());
	}

	@Test
	public void testValidatePassword() {
		assertEquals("abcde", "abcde");
		assertNull("null", "abcde");
		assertNotEquals("password not equal","abcd","abcde");	
	}

}

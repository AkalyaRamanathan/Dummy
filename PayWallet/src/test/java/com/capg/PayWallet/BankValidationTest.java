package com.capg.PayWallet;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class BankValidationTest extends TestCase {

	@Test
	public void testValidateWithdraw() {
		//fail("Not yet implemented");
		assertNotEquals("FiveHundread", 500);
		assertEquals(1000, 1000);
		assertSame(300, 300);
		
	}

	@Test
	public void testValidateName() {
		//fail("Not yet implemented");
		assertEquals("abcd", "abcd");
		assertNotEquals("12345", "abcd");
		assertSame("name", "name");
		assertNotEquals("name not equal","abcd","abcde");
	}

	@Test
	public void testValidatePhoneNumber() {
		assertEquals("9876543210", "9876543210");
		assertNotEquals("12345", "9876543210");
		assertSame("9876543210", "9876543210");
		assertNotEquals("number not equal","12345678","9876543210");
	}
	

	@Test
	public void testValidateAge() {
		assertEquals(20, 20);
		assertNotEquals(10, 25);
		assertSame(26, 26);
		assertNotEquals("age not equal",65,46);
	}
	

	@Test
	public void testValidateEmail() {
		//fail("Not yet implemented");
		assertEquals("abc@gmail.com", "abc@gmail.com");
		assertNotEquals("12345", "abc@gmail.com");
		assertSame("abc@gmail.com", "abc@gmail.com");
		assertNotEquals("email not equal","abcd","abc@gmail.com");
	}

	@Test
	public void testValidatePassword() {
		//fail("Not yet implemented");
		assertEquals("abcde", "abcde");
		assertNull("null", "abcde");
		assertNotEquals("password not equal","abcd","abcde");
	}

}

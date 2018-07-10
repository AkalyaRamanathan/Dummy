package com.capg.PayWallet;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;
import com.capg.bean.Bank;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.*;
public class BankTest extends TestCase{

	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		assertEquals("akal", "akal");
		assertEquals("lakshmi", "akal");
		assertNull("null", getName());
	}

	@Test
	public void testGetPhoneNumber() {
		//fail("Not yet implemented");
		assertNotEquals(987654, 45457);
		assertEquals(45457, 45457);
		assertSame(278907, 278907);
		
	}

	@Test
	public void testGetAmount() {
		//fail("Not yet implemented");
		assertNotEquals("hundred", 100);
		assertEquals(100, 100);
		
	}

	@Test
	public void testGetAge() {
		//fail("Not yet implemented");
		assertNotEquals("twenty", 20);
		assertEquals(25, 25);
		assertNotEquals(10,50);
		
	}


	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
		assertSame(500, 500);
		assertNotSame(0, 1000);
		
	}

	@Test
	public void testGetEmail() {
		//fail("Not yet implemented");
		assertEquals("abc@gmail.com", "abc@gmail.com");
		assertNotEquals("avc", "abc@gmail.com");
	}

	@Test
	public void testGetAadhar() {
		//fail("Not yet implemented");
		assertNotEquals("1234567890", "4567898904225");
		assertEquals("12345678901", "12345678901");
		assertNotEquals(null, "12345678901");
		
	}

	@Test
	public void testGetAccountId() {
		//fail("Not yet implemented");
	assertEquals(56789, 56789);
	assertNotEquals(34, 45678);
	assertNotSame(null, 45678);
	}

}

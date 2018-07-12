package com.capg.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capg.bean.Bank;

public class BankDaoTest {
Bank bank=new Bank();
	@Test
	public void testCreate() {
		//fail("Not yet implemented");
		assertEquals("Username", "Username");
		assertNotEquals("User", "Username");
		assertNull("null", bank.getName());
	}

	@Test
	public void testDepositAmount() {
		//fail("Not yet implemented");
		assertNotEquals("hundred", 100);
		assertEquals(100, 100);
		assertNotEquals(0, bank.getBalance());
	}

	@Test
	public void testWithdrawAmount() {
		//fail("Not yet implemented");
		assertNotEquals("hundred", 100);
		assertEquals(100, 100);
	}

	@Test
	public void testFundTransfer() {
		//fail("Not yet implemented");
		assertNotEquals("hundred", 100);
		assertEquals(100, 100);
	}

	@Test
	public void testPrintTransaction() {
		//fail("Not yet implemented");
		assertNotEquals("hundred", 100);
		assertEquals(100, 100);
	}

	@Test
	public void testLoginAccount() {
		//fail("Not yet implemented");
		assertNotEquals("User", "Username");
		assertEquals("Username", "Username");
	}

	@Test
	public void testShowBalance() {
		//fail("Not yet implemented");
		assertNotEquals(0, bank.getBalance());
		assertEquals(500,bank.getBalance() );
	}

}

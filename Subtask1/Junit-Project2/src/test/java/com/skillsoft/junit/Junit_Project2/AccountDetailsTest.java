package com.skillsoft.junit.Junit_Project2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AccountDetailsTest {
	
	AccountDetails accountDetails;
	
	@Before
	public void init() {
		
		accountDetails = new AccountDetails("Anita", 011401533, 114532, 5000, "Savings");
		
		System.out.println("@BeforeEach block has been executed");
		System.out.println("Account balance: " + accountDetails.getBalance());
		
	}
	
	@Test
	public void depositTest() {
		accountDetails.deposit(500.00);
		System.out.println("@Test block for deposit has been executed");
	}
	
	@Test
	public void withdrawTest() {
		accountDetails.withdraw(1000.00);
		System.out.println("@Test block for withdraw has been executed");
	}
	
	@After
	public void balance() {
		System.out.println("@AfterEach has been executed");
		System.out.println("Account balance : " +accountDetails.getBalance());
	}
	
	

}

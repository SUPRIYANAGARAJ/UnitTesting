package com.skillsoft.junit.Junit_Project3;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountDetailsTest {

AccountDetails accountDetails;

    @BeforeAll
    public static void initAll() {
    	System.out.println("@BeforeAll block has been executed");
    	System.out.println("Initialize all");
    }
	
	@BeforeEach
	public void init() {
		
		accountDetails = new AccountDetails("Anita", 011401533, 114532, 5000, "Savings");
		
		System.out.println("@BeforeEach block has been executed");
		System.out.println("Account balance: " + accountDetails.getBalance());
		
	}
	
	@Test
	public void depositTest() {
		accountDetails.deposit(500);
		System.out.println("@Test block for deposit has been executed");
	}
	
	@Test
	public void withdrawTest() {
		accountDetails.withdraw(1000);
		System.out.println("@Test block for withdraw has been executed");
	}
	
	@AfterEach
	public void balance() {
		System.out.println("@AfterEach has been executed");
		System.out.println("Account balance : " +accountDetails.getBalance());
	}
	
	@AfterAll
	public static void teardownAll() {
		System.out.println("@AfterAll block has been executed");
		System.out.println("Clean All");
	}
	
	

}

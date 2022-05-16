package com.skillsoft.junit.Junit_Project1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountDetailsTest {
	
	AccountDetails accountDetails = new AccountDetails("Anita4", 011401533, 114532, 5000, "Savings");
	
	@Test
	public void validateName() {
		
		assertTrue(accountDetails.getName().matches("^[a-zA-Z]*$"));
	}
	
	@Test
	public void validateBalance() {
		
		assertTrue(accountDetails.getBalance() >= 0);
	}
	

}


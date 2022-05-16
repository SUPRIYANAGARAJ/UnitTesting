package com.skillsoft.junit.Junit_Projecct;

public class AccountDetailsTest {
	
	AccountDetails accountDetails = new AccountDetails("Anita", 011401533, 114532, 5000, "Savings");
	
	public void validateName() {
		
		if(accountDetails.getName().matches("^[a-zA-Z]*$")) {
			System.out.println("Test passed : Name is valid");
		} else {
			System.out.println("Test failed : Name is invalid");
		}
	}
	
	public static void main(String[] args) {
		
		AccountDetailsTest accountDetailsTest = new AccountDetailsTest();
		accountDetailsTest.validateName();
	}

}

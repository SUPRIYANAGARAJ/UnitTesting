package com.skillsoft.Junit_Project12;

import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.naming.InvalidNameException;
import javax.naming.NamingException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class EmployeeTest {

static Employee firstEmployee;
	
	@BeforeAll
	public static void initEmployee() {
		
		firstEmployee = new Employee("Susan", "4ester", 1005, 'F', "Tech Lead", 80000, "Permanent");//pass
		//firstEmployee = new Employee("Susan", "Forrester", 1005, 'F', "Tech Lead", 80000, "Permanent");//fail
	}
	
	@Test
	public void assertTest() {
		assertThrows(InvalidNameException.class, 
				() -> {firstEmployee.validateLastName();}, "Throws Exception test");
		
	}
	
	@Test
	public void assertTest1() {
		assertThrows(NamingException.class, 
				() -> {firstEmployee.validateLastName();}, "Throws Exception test");
		
	}
	
	@Test
	public void assertTest2() {
		assertThrows(NullPointerException.class, 
				() -> {firstEmployee.validateLastName();}, "Throws Exception test");
		
	}
	
	
}

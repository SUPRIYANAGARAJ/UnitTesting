package com.skillsoft.Junit_Project11;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
	
	static Employee firstEmployee;
	
	@BeforeAll
	public static void initEmployee() {
		
		//firstEmployee = new Employee("Susan", "4ester", 1005, 'F', "Tech Lead", 80000, "Permanent");//pass
		firstEmployee = new Employee("Susan", "Forrester", 1005, 'F', "Tech Lead", 80000, "Permanent");//fail
	}
	
	@Test
	public void assertTest() {
		assertThrows(RuntimeException.class, 
				() -> {firstEmployee.validateLastName();}, "Throws Exception test");
		
	}
	

}

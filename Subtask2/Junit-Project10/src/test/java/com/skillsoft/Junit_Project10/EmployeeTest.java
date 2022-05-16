package com.skillsoft.Junit_Project10;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeTest {
	
static Employee firstEmployee;
static Employee secondEmployee;
	
	@BeforeAll
	static void initEmployee() {
		firstEmployee = new Employee("Bindu", "Priya", 1001, 'F', "Developer", 50000, "Permanent");
		secondEmployee = null;
	}
	
	@Test
	public void assertTest() {
		//assertNull(secondEmployee);//will pass
		assertNull(firstEmployee);//fail
	}
	
	@Test
	public void assertTest1() {
		//assertNotNull(firstEmployee);//pass
		assertNotNull(secondEmployee);//fail
	}
		

}

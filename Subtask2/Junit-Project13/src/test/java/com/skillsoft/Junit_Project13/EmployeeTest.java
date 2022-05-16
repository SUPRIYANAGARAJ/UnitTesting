package com.skillsoft.Junit_Project13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import javax.naming.NamingException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class EmployeeTest {
	
static Employee firstEmployee;
	
	@BeforeAll
	public static void initEmployee() {
		
		firstEmployee = new Employee("Susan", "4ester", 1005, 'F', "Tech Lead", 80000, "Permanent");
		
	}
	
	@Test
	public void assertTest() {
		
		firstEmployee.adjustSalary(4000);
		assertAll("Test Employee",
				() -> assertEquals(84000, firstEmployee.getSalary()),
				() -> assertNotNull(firstEmployee.getFirstName()),
				() -> assertThrows(NamingException.class,//pass
				          () -> {firstEmployee.validateLastName();},
				          "Throws Exception test"));
	
	}
	
	@Test
	public void assertTest1() {
		
		firstEmployee.adjustSalary(4000);
		assertAll("Test Employee",
				() -> assertEquals(84000, firstEmployee.getSalary()),
				() -> assertNotNull(firstEmployee.getFirstName()),
				() -> assertThrows(NullPointerException.class,//fail
				          () -> {firstEmployee.validateLastName();},
				          "Throws Exception test"));
	
	}

}

package com.skillsoft.Junit_Project6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class EmployeeTest {
	
	static Employee firstEmployee;
	static Employee secondEmployee;
	
	@BeforeAll
	public static void initEmployee() {
		
		firstEmployee = new Employee("Sneha","Priya", 1001, 'F', "Developer",50000, "Permanent");
		secondEmployee = new Employee("Santosh","Raj", 1011, 'F', "Developer",45000, "Contract");
		//secondEmployee = new Employee("Santosh","Raj", 1011, 'F', "Tester",45000, "Contract");
	}
	
	@Test
	public void assertTest() {
		assertTrue(firstEmployee.getRole().equals(secondEmployee.getRole()),"Test that both employees have the same role");
	}
	
	@Test
	public void assertTest1() {
		assertFalse(firstEmployee.getRole().equals(secondEmployee.getRole()),"Test that both employees have the same role");
	}
	
	@Test
	public void assertTest2() {
		
		Employee firstShallowCopy = firstEmployee;
		Employee firstSeparateCopy = new Employee(firstEmployee.getFirstName(), firstEmployee.getLastName(),
				firstEmployee.getId(), firstEmployee.getGender(),firstEmployee.getRole(), firstEmployee.getSalary(), firstEmployee.getType());
		
		//assertSame(firstEmployee, firstShallowCopy, "Test an object and a copy for sameness");
		assertSame(firstEmployee, firstSeparateCopy, "Test an object and a copy for sameness");
	}
	
	@Test
	public void assertTest3() {
		
		Employee firstShallowCopy = firstEmployee;
		Employee firstSeparateCopy = new Employee(firstEmployee.getFirstName(), firstEmployee.getLastName(),
				firstEmployee.getId(), firstEmployee.getGender(),firstEmployee.getRole(), firstEmployee.getSalary(), firstEmployee.getType());
		
		assertSame(firstEmployee.getRole(), firstSeparateCopy.getRole(), "Test two strings for sameness");
	}
	
	@Test
	public void assertTest4() {
		
		Employee firstShallowCopy = firstEmployee;
		Employee firstSeparateCopy = new Employee(firstEmployee.getFirstName(), firstEmployee.getLastName(),
				firstEmployee.getId(), firstEmployee.getGender(),firstEmployee.getRole(), firstEmployee.getSalary(), firstEmployee.getType());
		
		assertNotSame(firstEmployee, firstShallowCopy, "Test two strings for sameness");
	}
	
	
	
	
	
	

}

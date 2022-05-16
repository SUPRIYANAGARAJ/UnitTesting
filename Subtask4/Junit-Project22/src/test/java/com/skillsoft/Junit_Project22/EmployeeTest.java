package com.skillsoft.Junit_Project22;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;



public class EmployeeTest {
	
	static Employee employee;
	static double salary;
	
	@BeforeAll
	public static void initEmployee() {
		
		salary = 45000;
		employee = new Employee("Brian", "Alford", 1011, 'M', "Tester",salary, "Contract");
	}

	@RepeatedTest(5)//it is said to run 5 times
	@DisplayName("Salary Update")
	public void salaryUpdateTest() {
		
		double salaryIncrement = 2000;
		employee.adjustSalary(salaryIncrement);
		salary += salaryIncrement;
		
		assertEquals(salary, employee.getSalary(), "Test salary updates");
		
		
	}
}

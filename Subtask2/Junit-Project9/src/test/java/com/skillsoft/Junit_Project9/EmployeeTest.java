package com.skillsoft.Junit_Project9;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class EmployeeTest {

static Employee firstEmployee;
	
	@BeforeAll
	static void initEmployee() {
		firstEmployee = new Employee("Bindu", "Priya", 1001, 'F', "Developer", 50000, "Permanent");
	}
	
	@Test
	public void assertTest() {
		assertTimeout(Duration.ofSeconds(5),
				() -> {firstEmployee.adjustSalary(2000);
		Employee secondEmployee = new Employee("Santosh", "Raj", 1011, 'M', "Developer", 45000, "Contract");
		secondEmployee.adjustSalary(3000);});
	}
}

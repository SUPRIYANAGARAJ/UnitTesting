package com.skillsoft.Junit_Project21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class ProductTest {
	
 Product tv;
	
	@BeforeEach
	public void init() {
		tv = new Product("Diallonic","Delta",13423,800,"Electronics");
	}
		

	@Test
	@DisplayName("Brand Name Check")
	@Timeout(4)
	public void brandNameTest() throws InterruptedException {
		
		Thread.sleep(4000);
		assertEquals("Diallonic", tv.getBrandName(), "Brand NameTest");
	}

	@Test
	@DisplayName("Price Check")
	@Timeout(4)
	public void priceTest() throws InterruptedException {
		
		Thread.sleep(3000);
		assertEquals(800, tv.getPrice(), "Price Test");
	}

	@Test
	@DisplayName("Category Check")
	@Timeout(4)
	public void categoryTest1() throws InterruptedException {
		
		Thread.sleep(3000);
		assertEquals("Electronics", tv.getCategory(), "Category Test");
	}

	@Test
	@DisplayName("Model Check")
	@Timeout(4)
	public void modelTest1() throws InterruptedException {
		
		Thread.sleep(5000);
		assertEquals("Delta", tv.getModel(), "Model Test");
	}


}

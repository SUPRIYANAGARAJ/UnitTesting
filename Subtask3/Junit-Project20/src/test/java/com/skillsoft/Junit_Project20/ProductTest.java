package com.skillsoft.Junit_Project20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.DisplayName.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.Random.class)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductTest {
	
	static Product tv;
	
	@BeforeAll
	public static void init() {
		tv = new Product("Diallonic","Delta",13423,800,"Electronics");
	}
		

	@Test
	@DisplayName("Brand Name Check")
	//@Order(2)
	public void brandNameTest() {
		assertEquals("Diallonic", tv.getBrandName(), "Brand NameTest");
	}

	@Test
	@DisplayName("Price Check")
	//@Order(1)
	public void priceTest() {
		assertEquals(800, tv.getPrice(), "Price Test");
	}

	@Test
	@DisplayName("Category Check")
	//@Order(3)
	public void categoryTest1() {
		assertEquals("Electronics", tv.getCategory(), "Category Test");
	}

	@Test
	@DisplayName("Model Check")
	//@Order(3)
	public void modelTest1() {
		assertEquals("Delta", tv.getModel(), "Model Test");
	}


}

package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo2.Product;
import com.lti.demo2.ProductService;

class TestCases {
	
////	@BeforeAll
////	static void setup() {
////		System.out.println("@BeforeAll executed");
////	}
////	
//	@BeforeEach
//	void setupMethod() {
//		System.out.println("@BeforeEach executed");
//	}

	@Test
	void test() {
		Assertions.assertEquals("LTI","LTI");
	}

	@Test
	void testCalculator() {
		Calculator c = new Calculator();
		int r = c.sum(100, 200);
		Assertions.assertEquals(300,r);
	}
	
	@Test
	@Disabled
	public void testAry() {
		ArrayList<String> myList = new ArrayList<>();
		//myList.add("Hello");
		Assertions.assertTrue(myList.isEmpty());
	}
	
	
	@Test
	public void testAddProduct()
	{
		Product p = new Product(101, "Mobile", 3000);
		ProductService ps = new ProductService();
		
		Assertions.assertEquals("Product Added",ps.addProduct(p) );
	}
	
	@Test
	public void testIdCard()
	{
		Product p = new Product(101, "Mobile", 30000);
		ProductService ps = new ProductService();
		
		Assertions.assertEquals("Lnt Infotech",p.getcompanyName() );
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	@AfterEach
//	void tearMethods() {
//		System.out.println("@AfterEach method");
//	}
//	
//	@AfterAll
//	static void tearAll() {
//		System.out.println("\n @AfterAll method");
//	}
	
}
/*
import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


class TestCasesDemo{
	
	@BeforeAll
	static void setUp1() {
		System.out.println("@BeforeAll Executed");
		
	}
	@BeforeEach
	static void setUp2() {
		System.out.println("@BeforeEach Executed");
	}

	@Test
	void test() {
		Assertions.assertEquals("LTI","LTI");
	}
	@Test
	void testCalculator() {
		Calculator c = new Calculator();
		int r = c.sum(100, -200);
		
		Assertions.assertEquals(-100, r);
	}
	@Test
	void testCalculatorDemo() {
		Calculator c = new Calculator();
		int r = c.sum(100, 200);
		
		Assertions.assertEquals(300, r);
	}
	@Test
	
	public void testArr(){
		ArrayList<String> myList = new ArrayList<>();
		myList.add("hello");
		Assertions.assertFalse(myList.isEmpty());
		//Assertions.assertTrue(myList.isEmpty());
		
		
	}
	@AfterEach
	static void setUp3() {
		System.out.println("@AfterEach Executed");
	}

	@AfterAll
	static void setUp4() {
		System.out.println("@BeforeAll Executed");
		
	}
	

}
*/
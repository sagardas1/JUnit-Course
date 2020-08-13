package com.Junit.mathUtill;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtillTest {

	MathUtill mathUtill;

	@BeforeEach
	void init() {
		System.out.println("@BeforeEach");
		mathUtill = new MathUtill();
	}

//	@BeforeAll
//	void initimp() {
//		System.out.println("mathUtill");
//	}
//
//	@AfterEach
//	void cleanUp() {
//		System.out.println("@AfterEach");
//		
//	}
//	
//	@AfterAll
//	void cleanUpAll() {
//		System.out.println("@AfterAll");
//		
//	}
	
	
	@Test
	@DisplayName("Testing add method")
	void addTest() {
		
		assertEquals(2,mathUtill.add(1, 1));
	}
	
	@Test
	void subTest() {
		
		assertEquals(0,mathUtill.sub(1, 1));
	}
	
	@Test
	void mulTest() {
		
		assertEquals(1,mathUtill.mul(1, 1));
	}
	
	
	@Test
	void divTest() {
		assertThrows(Exception.class, ()->mathUtill.div(1, 0));
		//assertEquals(2,mathUtill.add(1, 1));
	}

}

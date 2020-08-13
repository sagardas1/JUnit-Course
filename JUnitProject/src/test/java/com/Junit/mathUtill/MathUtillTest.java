package com.Junit.mathUtill;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtillTest {

	MathUtill mathUtill;

	@BeforeEach
	void init() {
		System.out.println("@BeforeEach");
		mathUtill = new MathUtill();
	}

	@BeforeAll
	void initimp() {
		System.out.println("mathUtill");
	}

	@AfterEach
	void cleanUp() {
		System.out.println("@AfterEach");
		
	}
	
	@AfterAll
	void cleanUpAll() {
		System.out.println("@AfterAll");
		
	}
	
	
	@Test
	@DisplayName("Testing add method")
	void addTest() {
		boolean isServerUp=false;
		
		assumeTrue(isServerUp);
		
		assertEquals(2,mathUtill.add(1, 1));
	}
	
	@Test
	void subTest() {
		
		assertEquals(0,mathUtill.sub(1, 1));
	}
	@EnabledOnOs(OS.WINDOWS)
	@Test
	void mulTest() {
		
		assertEquals(1,mathUtill.mul(1, 1));
	}
	
	
	@Test
	void divTest() {
		assertThrows(Exception.class, ()->mathUtill.div(1, 0));
		//assertEquals(2,mathUtill.add(1, 1));
	}
	
	@Test
	@DisplayName("this method always fail")
	@Disabled
	void failTest() {
fail("this method should failed");
		//assertEquals(2,mathUtill.add(1, 1));
	}

	
	@Test
	@DisplayName("multiply methods wising assert all")
	void mulTestForAssertAll() {
		assertAll(
				
				()->assertEquals(100, mathUtill.mul(10, 10)),
				()->assertEquals(200, mathUtill.mul(20, 10)),
				()->assertEquals(-4, mathUtill.mul(2, -2))
				);
		
	}
	
	
	
}

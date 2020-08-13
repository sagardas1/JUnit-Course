package com.Junit.mathUtill;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtillTest {

	MathUtill mathUtill;

	@BeforeEach
	void init() {
		mathUtill = new MathUtill();
	}



	
	
	@Test
	void addTest() {
		
		assertEquals(2,mathUtill.add(1, 1));
	}

}

package com.Junit.mathUtill;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtillTest {



	
	
	@Test
	void addTest() {
		MathUtill mathUtill=new MathUtill();
		//mathUtill.add(1, 1);
		assertEquals(2,mathUtill.add(1, 1));
	}

}

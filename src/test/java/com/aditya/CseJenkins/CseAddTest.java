package com.aditya.CseJenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CseAddTest {
	
	CseAdd c = new CseAdd();
	
	@Test
	void csetest() {
		int result = c.add(2, 3);
		assertEquals(5, result);
	}

//	@Test
//	void csetest1() {
//		int result = c.mul(2, 3);
//		assertEquals(6, result);
//	}

}

package com.bwj.example;

import static org.junit.Assert.*;

import org.junit.*;

public class TestLab1 {
	public CanTakeOut lab1;
	
	@Before
	public void init() {
		lab1 = new CanTakeOut();
	}
	
	@Test
	public void testLab1_1() {
		assertTrue(lab1.getResult(13));
		
	}
	
	@Test
	public void testLab1_2() {
		assertTrue(lab1.getResult(23));
		
	}
	
	@Test
	public void testLab1_3() {
		assertFalse(lab1.getResult(39));
		
	}
	
	@Test
	public void testLab1_4() {
		assertFalse(lab1.getResult(200));
		
	}
}

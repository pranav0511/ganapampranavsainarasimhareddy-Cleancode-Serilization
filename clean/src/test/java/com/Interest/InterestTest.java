package com.Interest;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterestTest {
Interest interest = new Interest();
	//@SuppressWarnings("deprecation")
	@Test
	public void testSimple() {
		assertEquals(200,interest.Simple(1000, 10, 2));
	
	}
	@Test
	public void testSimple1() {
		assertEquals(420,interest.Simple(1000, 6, 7));
	}

	@Test
	public void testComp() {
		assertEquals(8235,interest.comp(5000, 5, 12, 10));
	}
	@Test
	public void testComp1() {
		assertEquals(6655,interest.comp(5000, 10, 1, 3));
	}

}

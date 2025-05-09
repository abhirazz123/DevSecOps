package com.nt.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;

public class AppTest {

	@Test
	public void testSumWithPositives() {
		int x = 10;
		int y = 20;
		int expected = 30;
		Arithmetic ar = new Arithmetic();
		int actual = ar.sum(x, y);
		assertEquals(expected, actual);
	}

	@Test
	public void testSumWithNegatives() {
		int x = 10;
		int y = -30;
		int expected = -20;
		Arithmetic ar = new Arithmetic();
		int actual = ar.sum(x, y);
		assertEquals(expected, actual);
	}

	@Test
	public void testSumWithMixedValues() {
		int x = -10;
		int y = 20;
		int expected = 10;
		Arithmetic ar = new Arithmetic();
		int actual = ar.sum(x, y);
		assertEquals(expected, actual);
	}

	@Test
	public void testSumWithZeros() {
		int x = 0;
		int y = 0;
		int expected = 0;
		Arithmetic ar = new Arithmetic();
		int actual = ar.sum(x, y);
		assertEquals(expected, actual);
	}
}

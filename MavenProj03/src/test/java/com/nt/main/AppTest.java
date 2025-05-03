package com.nt.main;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.nt.service.Arthmetic;

public class AppTest {
		@Test
    	public void testSumWithPositives() {
    		int x = 10;
    		int y = 20;
    		int expected = 30;
    		//find result
    		Arthmetic ar = new Arthmetic();
    		int actual = ar.sum(x, y);
    		assertEquals(expected, actual);
    		
    	}
		@Test
    	public void testSumWithNegetives() {
    		int x = -10;
    		int y = -20;
    		int expected = 10;
    		//find result
    		Arthmetic ar = new Arthmetic();
    		int actual = ar.sum(x, y);
    		assertEquals(expected, actual);
    		
    	}
		@Test
		public void testSumWithMixedValues() {
			int x = -10;
			int y = 20;
			int expected = 10;
			//find result
			Arthmetic ar = new Arthmetic();
			int actual = ar.sum(x, y);
			assertEquals(expected, actual);
		}
		@Test
		public void testSumWithZero() {
			int x = 0;
			int y = 0;
			int expected = 0;
			//find result
			Arthmetic ar = new Arthmetic();
			int actual = ar.sum(0, 0);
			assertEquals(expected, actual);
		}
}

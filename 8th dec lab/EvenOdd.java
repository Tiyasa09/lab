package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.JUnit_EvenOdd;

public class EvenOdd{
	@Test
	public void testing() {
		//testing
		assertEquals(true,JUnit_EvenOdd.evenOdd(30));
		assertEquals(true,JUnit_EvenOdd.evenOdd(38));
	}
}

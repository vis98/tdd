package com.test.tddcalc;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.tddcalc.*;
public class CalculatorTest {
	@Test
	public void returnZeroOnEmpty() {
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void returnSingle() {
		assertEquals(2, Calculator.add("2"));
	}
}

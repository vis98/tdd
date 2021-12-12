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
	public void returnOneOnSingle() {
		assertEquals(1, Calculator.add("1"));
	}
}

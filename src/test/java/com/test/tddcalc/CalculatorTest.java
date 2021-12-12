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
		assertEquals(1, Calculator.add("1"));
	} 
	
	@Test
	public void sumOfTwoNumbers() {
		assertEquals(3,Calculator.add("1,2"));
	}
	@Test
	public void sumOfAllNumbers() {
		assertEquals(10,Calculator.add("1,2,3,4"));
	}
	@Test
	public void allDelimiter() {
		assertEquals(3,Calculator.add("//;\n1;2"));
	}
	@Test
	public void negativeNosException() {
		try{
			Calculator.add("1,-3,-4");
		}catch(RuntimeException e) {
			assertEquals("negatives not allowed: -3,-4",e.getMessage());
		}
	}
}

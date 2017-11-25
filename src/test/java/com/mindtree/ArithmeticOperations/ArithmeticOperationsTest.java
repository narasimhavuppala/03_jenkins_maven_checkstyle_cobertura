package com.mindtree.ArithmeticOperations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ArithmeticOperationsTest {

	private ArithmeticOperations arithmeticOperations;
	
	@Before
	public void initialize() {
		arithmeticOperations = new ArithmeticOperations();
	}
	 
	@Test
	public void testPerformAddition() {
		int sum = arithmeticOperations.performAddition(2, 4);
		Assert.assertNotNull(sum);
		Assert.assertEquals(6, sum);
	}
	@Test
	public void testPerformSubtraction() {
		int diff = arithmeticOperations.performSubtraction(4, 2);
		Assert.assertNotNull(diff);
		Assert.assertEquals(2, diff);
	}
	@Test
	public void testPerformMultiplication() {
		int product = arithmeticOperations.performMultiplication(2, 3);
		Assert.assertNotNull(product);
		Assert.assertEquals(6, product);
	}
	@Test
	public void testGetDivision() {
		int quotient = arithmeticOperations.getQuotient(4, 2);
		Assert.assertNotNull(quotient);
		Assert.assertEquals(2, quotient);
	}
	@Test
	public void testGetRemainder() {
		int remainder = arithmeticOperations.getRemainder(3, 2);
		Assert.assertNotNull(remainder);
		Assert.assertEquals(1, remainder);
	}
}

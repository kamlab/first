package com.com.pkg;

import org.testng.annotations.Test;
import org.testng.Assert;


public class CalculatorTest
{
	 Calculator calc = new Calculator();
		@Test (dependsOnMethods="testMul1")
		public void add1Test()
		{
			//fail("Not yet implemented");
			Assert.assertEquals(10,calc.add1(5, 5));
		}

		@Test
		public void mul1Test() 
		{
			//fail("Not yet implemented");
			Assert.assertEquals(25,calc.mul1(5, 5));
		}

}

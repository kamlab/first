package com.com.pkg;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.testng.annotations.DataProvider;

public class Cdataprovider 
{
 
	  Calculator calc = new Calculator();
		 
		 
		@Test(dataProvider="dpaddition")
		
		public void add1Test(int exp_value, int a , int b)
		{
			//fail("Not yet implemented");
			Assert.assertEquals(calc.add1(a, b), exp_value);
			System.out.println("Addition");
		}
		
		@DataProvider(name="dpaddition")
		
		public Object[][] getdata()
		{
		return new Object[][] 
		{
			{10,5,5},
			{20,10,5},
			{50,25,25},
			{50,25,6}
			}; //import dataprovider 
		}		
  }


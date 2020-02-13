package com.test;

import org.testng.annotations.Test;

public class TestNGInvocationCount
{
	@Test
	public void Display()
	{
		System.out.println("Print this method 10 times");
	}
	
	@Test(invocationCount=10)
	public void DisplayMultipleTimes()
	{
		System.out.println("Printing the method 10 times");
	}
	
	
	
	

}

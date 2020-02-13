package com.test;

import org.testng.annotations.Test;

public class TestNGDependency
{
	
	@Test
	public void test1()
	{
		System.out.println("1st testcase");
	}
	
	@Test
	public void test2()
	{
		System.out.println("2nd testcase");
		int i = 0/1;
		System.out.println(i);
	}
	
	@Test(dependsOnMethods="test2")
	public void test3()
	{
		System.out.println("3rd testcase");
	}
	
	
	
	
	
	
	

}

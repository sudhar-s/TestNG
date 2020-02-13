package testNGRetryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNGRetryLogicTest 
{
	
	
	@Test
	public void Test1()
	{
		System.out.println("test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("test2");
	}
	@Test
	public void Test3()
	{
		System.out.println("test3");
	}
	//@Test(retryAnalyzer = testNGRetryLogic.TestNGRetryAnalyzer.class) //to do retry logic for specific test(Test Level)
	@Test
	public void Test4()
	{
		Assert.assertEquals(false, true);
	}
	@Test
	public void Test5()
	{
		System.out.println("test5");
	}
	@Test
	public void Test6()
	{
		Assert.assertEquals(false, true);
	}

	
}

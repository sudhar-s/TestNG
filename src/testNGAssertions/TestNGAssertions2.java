package testNGAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions2
{
	
	//SoftAssert sa = new SoftAssert();
	
	
	@Test(priority=1)
	public void SoftAssert1()
	{
		SoftAssert sa = new SoftAssert();
		System.out.println("Step 1");
		System.out.println("Step 2");
		sa.assertEquals(true, false, "Soft Assertion 1 -->"); //Soft Assertion
		System.out.println("Step 3");
		System.out.println("Step 4");
		sa.assertEquals(true, false, "Soft Assertion 2 -->"); //Soft Assertion
		System.out.println("Step 5");
		System.out.println("Step 6");	
		sa.assertEquals(true, false, "Soft Assertion 3 -->"); //Soft Assertion 
		System.out.println("Step 7");
		System.out.println("Step 8");
		System.out.println("Step 9");
		System.out.println("Step 10");
		sa.assertAll();
		
	}

	@Test(priority=2)
	public void SoftAssert2()
	{
		SoftAssert sa = new SoftAssert();
		System.out.println("Step 1");
		System.out.println("Step 2");
		sa.assertEquals(true, false, "Soft Assertion 1 -->"); //Soft Assertion
		System.out.println("Step 3");
		System.out.println("Step 4");
		sa.assertEquals(true, false, "Soft Assertion 2 -->"); //Soft Assertion
		System.out.println("Step 5");
		System.out.println("Step 6");	
		sa.assertAll();
		
	}
	
	@Test(priority=3)
	public void SoftAssert3()
	{
		SoftAssert sa = new SoftAssert();
		System.out.println("Step 1");
		System.out.println("Step 2");
		sa.assertEquals(true, false, "Soft Assertion 1 -->"); //Soft Assertion
		System.out.println("Step 3");
		System.out.println("Step 4");
		sa.assertEquals(true, false, "Soft Assertion 2 -->"); //Soft Assertion
		System.out.println("Step 5");
		System.out.println("Step 6");
		sa.assertEquals(true, false, "Soft Assertion 3 -->"); //Soft Assertion 
		System.out.println("Step 7");
		sa.assertAll();
		
	}
	

	
	
	
	

}

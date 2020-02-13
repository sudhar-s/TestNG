package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExceptionTimeout
{
	
	//@Test(timeOut=2000)
	public void ExceptionTimeoutTest1()
	{
		int i = 1;
		while(i==1)
			System.out.println("Value of i is "+i);
	}
	
	//@Test(invocationTimeOut=2000)
	public void ExceptionTimeoutTest2()
	{
		int i = 2;
		while(i==2)
			System.out.println("Value of i is "+i);
	}
	
	@Test(expectedExceptions=org.openqa.selenium.NoSuchElementException.class)
	public void ExpectExceptionTest()
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean b = driver.findElement(By.xpath("//a[text()='mail']")).isDisplayed();
		if(b==true)
			System.out.println("Gmail Link is shown");
		else
			System.out.println("Gmail Link not shown");
		driver.close();
	}

}

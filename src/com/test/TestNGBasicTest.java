package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasicTest
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1,groups="Functionality")
	public void TitleTest()
	{
		System.out.println("Title = "+driver.getTitle());
	}
	
	@Test(priority=3,groups="Links")
	public void GmailLinkTest()
	{
		boolean b = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		if(b==true)
			System.out.println("Gmail Link is shown");
		else
			System.out.println("Gmail Link not shown");
	}
	
	@Test(priority=2,groups="Images")
	public void LogoTest()
	{
		boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		if(b==true)
			System.out.println("Logo is shown");
		else
			System.out.println("Logo not shown");
	}
	
	@Test(priority=4,groups="Links")
	public void ImagesLinkTest()
	{
		boolean b = driver.findElement(By.xpath("//a[text()='Images']")).isDisplayed();
		if(b==true)
			System.out.println("Images Link is shown");
		else
			System.out.println("Images Link not shown");
	}
	
	@Test(priority=5,groups="Buttons")
	public void SignInBtnTest()
	{
		boolean b = driver.findElement(By.xpath("//a[text()='Sign in']")).isDisplayed();
		if(b==true)
			System.out.println("Sign in Button is shown");
		else
			System.out.println("Sign in Button not shown");
	}
	
	@Test(priority=6,groups="Buttons")
	public void IFLBtnTest()
	{
		boolean b = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnI']")).isDisplayed();
				
		if(b==true)
			System.out.println("IFL Button is shown");
		else
			System.out.println("IFL Button not shown");
	}
	
	@Test(priority=7,groups="Buttons")
	public void SearchBtnTest()
	{
		boolean b = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).isDisplayed();
				
		if(b==true)
			System.out.println("Google Search Button is shown");
		else
			System.out.println("Google Search Button not shown");
	}
	
	@Test(priority=8,groups="Links")
	public void GetStartLinkTest()
	{
		boolean b = driver.findElement(By.xpath("//a[@title='Google apps']")).isDisplayed();
		if(b==true)
			System.out.println("Google Apps Icon is shown");
		else
			System.out.println("Google Apps Icon is not shown");
	}
	
	@Test(priority=9,groups="Images")
	public void VoiceAssistLogoTest()
	{
		boolean b = driver.findElement(By.xpath("//div[@aria-label='Search by voice']")).isDisplayed();
		if(b==true)
			System.out.println("Google Assistant Logo is shown");
		else
			System.out.println("Google Assistant Logo not shown");
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}

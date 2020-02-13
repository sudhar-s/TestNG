package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics
{
		
	@BeforeSuite
	public void InstallBrowser()
	{
		System.out.println("Installing Browser	--	BeforeSuite");
	}
	
	@BeforeClass
	public void LaunchBrowser()
	{
		System.out.println("Launching Browser	--	BeforeClass");
	}
	
	@BeforeMethod
	public void EnterURL()
	{
		System.out.println("Entering URL		--	BeforeMethod");
	}
	
	@BeforeTest
	public void Login()
	{
		System.out.println("Logging in		--	BeforeTest");
	}
	
	@Test(priority=2)
	public void TitleTest()
	{
		System.out.println("Testing the Title	--	Test");
	}
	
	@Test(priority=1)
	public void LogoTest()
	{
		System.out.println("Testing the Logo	--	Test");
	}
	
	@Test(priority=3)
	public void ImageTest()
	{
		System.out.println("Testing the Image	--	Test");
	}
	
	@AfterMethod
	public void LogOut()
	{
		System.out.println("Logging out		--	AfterMethod");
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("Closing the Browser	--	AfterClass");
	}
	
	@AfterTest
	public void DeleteCookies()
	{
		System.out.println("Deleting the Cookies	--	AfterTest");
	}
	
	@AfterSuite
	public void UninstallBrowser()
	{
		System.out.println("Uninstalling Browser	--	AfterSuite");
	}
	

}

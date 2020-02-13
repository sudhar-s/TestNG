package ztest2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne
{
	WebDriver driver;
	
	
	@BeforeMethod
	@Parameters({"userid","password"})
	public void setUp(String userid, String password)
	{
		System.setProperty("webdriver.chrome.driver", "E:/Sel/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.20.180.7/northwell/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys(userid);
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
		driver.findElement(By.id("MainContent_btnLogIn")).click();
	}
	
	
	
	@Test
	public void logoutCancelTest()
	{
		driver.findElement(By.id("lnkbtnlogout")).click();
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		System.out.println("Alert msg is: "+s);
		a.dismiss();
		Assert.assertEquals(s, "Are you sure you want to Logout?");
		
	}
	
	@Test
	public void logoutTest()
	{
		driver.findElement(By.id("lnkbtnlogout")).click();
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		System.out.println("Alert msg is: "+s);
		a.accept();
		Boolean flag = driver.findElement(By.id("MainContent_btnLogIn")).isDisplayed();
		Assert.assertTrue(flag);
		//return flag;
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

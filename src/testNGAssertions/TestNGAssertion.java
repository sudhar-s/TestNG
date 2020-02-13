package testNGAssertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertion
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
	
	@Test(priority=2,groups="Functionality")
	public void TitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google1", "--XX Title mismatched XX--");
	}
	
	@Test(priority=1,groups="Design")
	public void LogoTest()
	{
		boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(b,"--X Logo is not shown X--");
	}
	
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}

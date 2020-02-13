package testNGDataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNGDataDriven.testUtil;

public class TestNGDataProvider
{
	WebDriver driver;
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.phptravels.org/register.php");
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		Object mydata[][] = testUtil.getDataFromExcel("TestData");
		return mydata;
	}
	
	
	@Test(dataProvider="getData")
	public void RegPageTest(String firstname,String lastname,String email,String phno,String city,String state,String pincode)
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='phonenumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys(pincode);
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.close();
	}
	

}

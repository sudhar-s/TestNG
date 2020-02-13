package ztest2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo
{
	WebDriver driver;
	Boolean flag;
	
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
	
	@Test(groups={"Existance test"})
	public void searchButtonExist()
	{
		flag = driver.findElement(By.id("MainContent_btnSearch")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(groups={"Existance test"})
	public void exportButtonExist()
	{
		flag = driver.findElement(By.id("MainContent_btnExport")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(groups={"Existance test"})
	public void clearButtonExist()
	{
		flag = driver.findElement(By.id("MainContent_btnClear")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(groups={"Input field type test"})
	public void poNoType() throws InterruptedException
	{
		WebElement e = driver.findElement(By.id("MainContent_txtPo"));
		e.sendKeys("test");
		Thread.sleep(2000);
		/*WebDriverWait w = new WebDriverWait(driver, 2);
		w.until(ExpectedConditions.textToBePresentInElement(e, "test"));
		String s = e.getText();
		Assert.assertEquals(s, "test");*/
	}
	
	@Test(groups={"Input field type test"})
	public void pNameType()
	{
		WebElement e = driver.findElement(By.id("MainContent_txtPractName"));
		e.sendKeys("test");
		/*String s = e.getText();
		Assert.assertEquals(s, "test");*/
	}
	
	@Test(groups={"Input field type test"})
	public void invNoType()
	{
		WebElement e = driver.findElement(By.id("MainContent_txtinvoice"));
		e.sendKeys("test");
		/*String s = e.getText();
		Assert.assertEquals(s, "test");*/
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	

}

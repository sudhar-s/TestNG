package zhashMap;

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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HashMapTest
{
	WebDriver driver;
	String credential;
	String credinfo[];
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:/Sel/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{	
		credential = HashmapData.getData().get("admin");
		credinfo = credential.split("_");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(credinfo[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credinfo[1]);
		 
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit'][@class='btn btn-small']"));
		Thread.sleep(3000);
		/*WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(btn));*/
		btn.click();
		//WebElement e1 = driver.findElement(By.xpath("//td[contains(text(),'admin admin')][@class='headertext']"));
		WebDriverWait w = new WebDriverWait(driver, 10);
		WebElement e1 = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'admin admin')][@class='headertext']")));
		//w.until(ExpectedConditions.visibilityOf(e1));
		String s1 = e1.getText();
		//SoftAssert sa = new SoftAssert();
		Assert.assertEquals("s1", "User: admin admin");
		
		WebElement e2 = driver.findElement(By.xpath("//td[contains(text(),'CRMPRO')]"));
		String s2 = e2.getText();
		Assert.assertEquals(s2, "CRMPRO");
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

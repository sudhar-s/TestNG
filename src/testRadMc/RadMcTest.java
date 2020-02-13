package testRadMc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RadMcTest
{
	
		WebDriver driver;
		
		@Test
		public void Test1() throws InterruptedException
		{
			System.out.println("Test:"+Thread.currentThread().getId());
			System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://10.20.180.7/isat_test/Login.aspx");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@name='txtEmployeeId']")).sendKeys("00007");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("12345678");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.switchTo().frame("Menu");
			driver.findElement(By.xpath("//a[@id='xproduction']")).click();
			driver.findElement(By.xpath("//a[@id='xdiv_Production_Dallas_Radiology']//img[@width='16']")).click();
			driver.findElement(By.xpath("(//a[@id='A2']/font/img)[6]")).click();
			driver.findElement(By.xpath("(//div[@id='Dallas_Production_Radiology']/table/tbody/tr/td[2]/a/font)[1]")).click();
			//WebDriverWait w = new WebDriverWait(driver, 3);
			//WebElement e = driver.findElement(By.cssSelector("#btnTime"));
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#btnTime")));
			//w.until(ExpectedConditions.elementToBeClickable(By.id("btnTime")));
			Thread.sleep(3000);
			driver.findElement(By.id("btnTime")).click();
			Select s1 = new Select(driver.findElement(By.xpath("//select[@id='ddlProjectName']")));
			s1.selectByValue("Zotec");
			Select s2 = new Select(driver.findElement(By.xpath("//select[@id='ddlTaskName']")));
			s2.selectByValue("Coding");
			Select s3 = new Select(driver.findElement(By.xpath("//select[@id='ddlProductName']")));
			s3.selectByValue("AMIR");
			Select s4 = new Select(driver.findElement(By.xpath("//select[@id='ddlShift']")));
			s4.selectByValue("General");
			Select s5 = new Select(driver.findElement(By.xpath("//select[@id='ddlShift']")));
			s5.selectByValue("General");
			Select s6 = new Select(driver.findElement(By.xpath("//select[@id='ddlQueueType']")));
			s6.selectByValue("DC Coding");
			driver.findElement(By.xpath("//input[@id='txtCaseId']")).sendKeys("101202303");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		}
		
		/*@Test
		public void Test2()
		{
			System.out.println("Test:"+Thread.currentThread().getId());
			System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://10.20.180.7/isat_test/Login.aspx");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@name='txtEmployeeId']")).sendKeys("00007");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("12345678");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[@id='xproduction']")).click();
			driver.findElement(By.xpath("//a[@id='xdiv_Production_Dallas_Radiology']//img[@width='16']")).click();
			driver.findElement(By.xpath("(//a[@id='A2']/font/img)[6]")).click();
			driver.findElement(By.xpath("(//div[@id='Dallas_Production_Radiology']/table/tbody/tr/td[2]/a/font)[1]")).click();
			driver.findElement(By.xpath("//select[@id='ddlProjectName']")).click();
			Select s1 = new Select(driver.findElement(By.xpath("//select[@id='ddlProjectName']")));
			s1.selectByValue("Zotec");
			Select s2 = new Select(driver.findElement(By.xpath("//select[@id='ddlTaskName']")));
			s2.selectByValue("Coding");
			Select s3 = new Select(driver.findElement(By.xpath("//select[@id='ddlProductName']")));
			s3.selectByValue("AMIR");
			Select s4 = new Select(driver.findElement(By.xpath("//select[@id='ddlShift']")));
			s4.selectByValue("General");
			Select s5 = new Select(driver.findElement(By.xpath("//select[@id='ddlShift']")));
			s5.selectByValue("General");
			Select s6 = new Select(driver.findElement(By.xpath("//select[@id='ddlQueueType']")));
			s6.selectByValue("DC Coding");
			driver.findElement(By.xpath("//input[@id='txtCaseId']")).sendKeys("101202303");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		}
		
		@Test
		public void Test3()
		{
			System.out.println("Test:"+Thread.currentThread().getId());
			System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://10.20.180.7/isat_test/Login.aspx");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@name='txtEmployeeId']")).sendKeys("00007");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("12345678");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[@id='xproduction']")).click();
			driver.findElement(By.xpath("//a[@id='xdiv_Production_Dallas_Radiology']//img[@width='16']")).click();
			driver.findElement(By.xpath("(//a[@id='A2']/font/img)[6]")).click();
			driver.findElement(By.xpath("(//div[@id='Dallas_Production_Radiology']/table/tbody/tr/td[2]/a/font)[1]")).click();
			driver.findElement(By.xpath("//select[@id='ddlProjectName']")).click();
			Select s1 = new Select(driver.findElement(By.xpath("//select[@id='ddlProjectName']")));
			s1.selectByValue("Zotec");
			Select s2 = new Select(driver.findElement(By.xpath("//select[@id='ddlTaskName']")));
			s2.selectByValue("Coding");
			Select s3 = new Select(driver.findElement(By.xpath("//select[@id='ddlProductName']")));
			s3.selectByValue("AMIR");
			Select s4 = new Select(driver.findElement(By.xpath("//select[@id='ddlShift']")));
			s4.selectByValue("General");
			Select s5 = new Select(driver.findElement(By.xpath("//select[@id='ddlShift']")));
			s5.selectByValue("General");
			Select s6 = new Select(driver.findElement(By.xpath("//select[@id='ddlQueueType']")));
			s6.selectByValue("DC Coding");
			driver.findElement(By.xpath("//input[@id='txtCaseId']")).sendKeys("101202303");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		}
		
		@Test
		public void Test4()
		{
			System.out.println("Test:"+Thread.currentThread().getId());
			System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://10.20.180.7/isat_test/Login.aspx");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@name='txtEmployeeId']")).sendKeys("00007");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("12345678");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[@id='xproduction']")).click();
			driver.findElement(By.xpath("//a[@id='xdiv_Production_Dallas_Radiology']//img[@width='16']")).click();
			driver.findElement(By.xpath("(//a[@id='A2']/font/img)[6]")).click();
			driver.findElement(By.xpath("(//div[@id='Dallas_Production_Radiology']/table/tbody/tr/td[2]/a/font)[1]")).click();
			driver.findElement(By.xpath("//select[@id='ddlProjectName']")).click();
			Select s1 = new Select(driver.findElement(By.xpath("//select[@id='ddlProjectName']")));
			s1.selectByValue("Zotec");
			Select s2 = new Select(driver.findElement(By.xpath("//select[@id='ddlTaskName']")));
			s2.selectByValue("Coding");
			Select s3 = new Select(driver.findElement(By.xpath("//select[@id='ddlProductName']")));
			s3.selectByValue("AMIR");
			Select s4 = new Select(driver.findElement(By.xpath("//select[@id='ddlShift']")));
			s4.selectByValue("General");
			Select s5 = new Select(driver.findElement(By.xpath("//select[@id='ddlShift']")));
			s5.selectByValue("General");
			Select s6 = new Select(driver.findElement(By.xpath("//select[@id='ddlQueueType']")));
			s6.selectByValue("DC Coding");
			driver.findElement(By.xpath("//input[@id='txtCaseId']")).sendKeys("101202303");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		}
*/
	

}

package testNGScreenshotFailedTC;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUtil
{
	static WebDriver driver;
	
	
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "E://Sel//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void takeScreenShot(String testMethod) throws IOException
	{
		
		/*WebElement el = driver.findElement(By.id("username")); //Taking screenshot of an element in the webpage
		el.getScreenshotAs(OutputType.FILE);*/
		
		//File srce = ((TakesScreenshot)el).getScreenshotAs(OutputType.FILE);  //Taking screenshot of an element in the webpage
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst = new File("E://Sel//Workspace//TestNG//src//testNGScreenshotFailedTC//screenshots//"
					+"testFailedin_"+testMethod+".jpeg");
		try {
			FileUtils.copyFile(src,dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}

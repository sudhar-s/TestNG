package ztest2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RightClick
{
	WebDriver driver;
	@Test
	public void rightClickTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:/Sel/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement e1 = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions a = new Actions(driver);
		a.contextClick(e1).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Quit')]")).click();
		Alert al1 = driver.switchTo().alert();
		String msg1 = al1.getText();
		System.out.println("Alert msg text: "+msg1);
		Thread.sleep(2000);
		al1.accept();
		WebElement e2 = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		a.doubleClick(e2).build().perform();
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.alertIsPresent());
		Alert al2 = driver.switchTo().alert();
		String msg2 = al2.getText();
		System.out.println("Alert msg text: "+msg2);
		Thread.sleep(2000);
		al2.accept();
		}

}

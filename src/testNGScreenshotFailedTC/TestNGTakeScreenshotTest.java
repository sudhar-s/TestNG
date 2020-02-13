package testNGScreenshotFailedTC;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TestNGTakeScreenshotTest extends TestUtil
{
	
	@BeforeMethod
	public void setUp()
	{
		launch();
	}
	
	@Test
	public void screenshotTest()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "Googlee");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	

}

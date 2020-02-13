package testNGRetryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestNGRetryAnalyzer implements IRetryAnalyzer
{
	int counter = 0;
	int retrylimit	= 10;
	
	public boolean retry(ITestResult result)
	{
		if(counter < retrylimit)
		{
			counter++;
			return true;
		}
		return false;
	}

}

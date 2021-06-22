package testcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerr implements IRetryAnalyzer {
int	Retry =3;
int RetryCount=0;

	public boolean retry(ITestResult result) 
	{
		if(!result.isSuccess()&&RetryCount<Retry)
		{
			RetryCount++;
			return true;
			
			
		}
		return false;
	
	}

}

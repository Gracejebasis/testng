package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTest_logic implements IRetryAnalyzer{
 int min=1,max=5;
	@Override
	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}

}

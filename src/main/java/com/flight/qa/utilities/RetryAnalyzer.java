package com.flight.qa.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int counter = 0, attempt = 2;


	@Override
	public boolean retry(ITestResult result) {

		if (counter < attempt) {
			counter++;
			return true;
		} else
			return false;
	}

}

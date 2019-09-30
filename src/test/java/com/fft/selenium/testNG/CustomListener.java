package com.fft.selenium.testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("<font color=\"green\"><b> PASSED </b></font>");
		
	}

	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<font size=\"2\" face=\"verdana\" color=\"red\"> <b> Test Case failed </b></font>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"D:/Screenshots/screenshot.jpg\"target=\"_blank\"> <b>Screenshot Attached </b></a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"D:/Screenshots/screenshot.jpg\" target=\"_blank\"> <img src=\"D:/Screenshots/screenshot.jpg\" height=100 width=300</a>");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}

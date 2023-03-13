package com.Genraic.classes;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerners_class extends Basic_class  implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("testcase is sucess :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("testcase is got failure :"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("testcase is sucess percentage :"+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("testcase is timeout :"+result.getName());
		TakeScreenShot.ss(this.driver,result);
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("testcase is start :"+context.getName());
		
	}

}
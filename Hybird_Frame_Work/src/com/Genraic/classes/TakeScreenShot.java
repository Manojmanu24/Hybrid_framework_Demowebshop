package com.Genraic.classes;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TakeScreenShot implements Frame_Hidden 

{
	public  static void ss(WebDriver driver,ITestResult result)
	{
		java.util.Date day=new java.util.Date();
		String date = day.toString().replaceAll(":","-");
		
		TakesScreenshot take=(TakesScreenshot)driver;
		File screenshot = take.getScreenshotAs(OutputType.FILE);
		File drt=new File(SS_PATH+date);
		
		
		try {
			FileHandler.copy(screenshot, drt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

}

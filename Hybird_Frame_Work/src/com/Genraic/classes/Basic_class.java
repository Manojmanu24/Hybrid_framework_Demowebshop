package com.Genraic.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pom.classes.Pom_class;

public class Basic_class implements Frame_Hidden
{
	public static WebDriver driver;
    public  ExtentHtmlReporter report;
    public  static  ExtentTest tests ;
    public    ExtentReports ext;
 
	@BeforeTest
	public void report()
	{	
		report=new ExtentHtmlReporter(EXTENT_PATH);
		ext=new ExtentReports();
		ext.attachReporter(report);
		tests = ext.createTest("TITLE_REORTS");	
	}
	@AfterTest
	public void endreport()
	{
	    ext.flush();  
	}
	
	@BeforeClass
	public void login()
	{
		System.setProperty(KEY,VALUE);
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	
		
	}

	@BeforeMethod
	public void openapp() throws InterruptedException 
	{
		
		Pom_class pom=new Pom_class(driver);
		pom.login_link().click();
		tests.log(Status.INFO, "loginpage displayed");
		Thread.sleep(1000);
		pom.email_textfield().sendKeys("cooffee24@gmail.com");
		pom.password_textfiled().sendKeys("nmakjhla");
		pom.login_but().click();
		
	}
	@AfterMethod
	public void closeapp()
	{
		Pom_class pom=new Pom_class(driver);
		   pom.logout_but().click();
	}
	@AfterClass
	public void logout()
	{
		driver.quit();
	}
	
	

}

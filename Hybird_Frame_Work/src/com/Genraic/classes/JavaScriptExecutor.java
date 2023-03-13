package com.Genraic.classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends Basic_class
{
	public static JavascriptExecutor scroll()
	{
		JavascriptExecutor scroll_by=(JavascriptExecutor)driver;
		return scroll_by;
		
	}
     public static  void  scroll_down_using_address(WebElement ele)
     {
    	 scroll().executeScript("arguments[0].scrollIntoView();",ele);
     }
     
     
     

}

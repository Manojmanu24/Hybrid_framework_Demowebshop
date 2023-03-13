package com.Genraic.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_class 
{
	public static  Select select_option(WebElement ele)
	{
	Select sc=new Select(ele);
	return sc;
	}
	 
//	public static void select_by_index(WebElement ele,int index) 
//	{
//		select_option(ele).
//	}
//	
	
	
	
	

}

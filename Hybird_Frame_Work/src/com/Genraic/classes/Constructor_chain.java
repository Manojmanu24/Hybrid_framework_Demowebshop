package com.Genraic.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Constructor_chain 
{
	public Constructor_chain(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}

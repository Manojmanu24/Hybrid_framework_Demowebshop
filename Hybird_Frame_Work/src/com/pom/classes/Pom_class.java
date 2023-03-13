package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Genraic.classes.Basic_class;
import com.Genraic.classes.Constructor_chain;

public   class Pom_class extends Constructor_chain

{
	@FindBy(xpath = "//a[contains(text(),' in')]")
	private  WebElement  login;

	@FindBy(xpath = "//input[@id='Email']")
	private  WebElement  email;

	@FindBy(xpath = "//input[@id='Password']")
	private  WebElement  password;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement login_button;
	
	@FindBy(xpath = "//a[.='Log out']")
	private WebElement logout;

    public Pom_class(WebDriver driver)
    {
    	super(driver);
    }
    
    public WebElement login_link()
    {
       return login;
    }
    public WebElement email_textfield()
    {
    	return email;
    }
    public WebElement password_textfiled() 
    {
    	 return password;
    }
    public WebElement login_but()
    {
    	return login_button;
    }
    public WebElement logout_but()
    {
    	return logout;
    }
    
    


    
    
}

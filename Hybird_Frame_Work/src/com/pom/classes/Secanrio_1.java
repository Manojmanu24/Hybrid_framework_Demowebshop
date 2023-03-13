package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Genraic.classes.Constructor_chain;

public class Secanrio_1 extends Constructor_chain
{
	@FindBy(xpath = "//ul[@class='top-menu']/../ul[1]/li[4]")
	private WebElement Apparel_Shoes;
	
	@FindBy(xpath = "//select[@id='products-orderby']")
	private WebElement sortby_drop;
	
	@FindBy(xpath = "//select[@id='products-pagesize']")
	private WebElement dispaly_drop;
	
	@FindBy(xpath = "//select[@id='products-viewmode']")
	private WebElement view_drop;
	
	@FindBy(xpath = "//a[text()='Blue Jeans']/../following-sibling::div[3]/div[2]/input[1]")
	private WebElement jeans_cart;
	
	@FindBy(xpath = "//a[text()='Casual Golf Belt']/../following-sibling::div[3]/div[2]/input[1]")
	private WebElement belt_cart;
	
	@FindBy(xpath = "//span[.='Shopping cart']")
	private WebElement shop_cart;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../../tbody/tr[1]/td[1]/input[1]")
	private WebElement jeans_cb;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../../tbody/tr[2]/td[1]/input[1]")
	private WebElement belt_cb;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[1]/td[6]/span[2]")
	private WebElement jeans_price;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[2]/td[6]/span[2]")
	private WebElement belt_price;
	
	@FindBy(xpath = "//input[@value='Update shopping cart']")
	private WebElement update_shop_cart;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement agree_cb;
	
	@FindBy(xpath = "//button[@value='checkout']")
	private WebElement check_out;
	
	public Secanrio_1(WebDriver driver)
	{
		super(driver);
	}
	public WebElement apparel_Shoes_btn() 
	{
		return Apparel_Shoes;
	}
	public WebElement sort_drop()
	{
		return	sortby_drop;
	}
	public WebElement display_drops()
	{
	  return	dispaly_drop;
	}
	public WebElement view_drops()
	{
	  return	view_drop;
	}
	public WebElement jeanspant_cart() 
	{
	  return	jeans_cart;
	}
	public WebElement beltpant_cart() 
	{
		return belt_cart;
	}
	public WebElement shopping_cart()
	{
	  return shop_cart;
	}
	public WebElement jeanspant_cb()
	{
	  return	jeans_cb;
	}
	public WebElement beltpant_cb() 
	{
	 return	belt_cb;
	}
	  public WebElement belt_amount()
	    {
	    	 return belt_price;
	    }
	  public WebElement jeans_amount()
	    {
	    	return jeans_price;
	    }
	
    public WebElement update_cb() {
    	return update_shop_cart;
    }
    public WebElement agree()
    {
    	return agree_cb;
    }
    public WebElement checkout_button()
    {
    	 return check_out;
    }
  
    

}

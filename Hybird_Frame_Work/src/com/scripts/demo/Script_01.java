package com.scripts.demo;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Genraic.classes.Basic_class;
import com.Genraic.classes.Conversion;
import com.Genraic.classes.JavaScriptExecutor;
import com.Genraic.classes.Select_class;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.pom.classes.Secanrio_1;

@Listeners(com.Genraic.classes.Listerners_class.class)
public class Script_01 extends Basic_class
{
	@Test
	public static  void script() throws InterruptedException
	{
		Secanrio_1 scr=new Secanrio_1(driver);
		scr.apparel_Shoes_btn().click();
		Thread.sleep(2000);
		tests.log(Status.INFO, "shoes has been clicked");
		Select drop = Select_class.select_option(scr.sort_drop());
		drop.selectByIndex(1);
		Thread.sleep(2000);
		Select drop2 = Select_class.select_option(scr.display_drops());
		drop2.selectByIndex(2);
		Thread.sleep(2000);
		Select drop3 = Select_class.select_option(scr.view_drops());
		drop3.selectByIndex(1);
		Thread.sleep(2000);
		JavaScriptExecutor.scroll_down_using_address(scr.jeanspant_cart());
		Thread.sleep(2000);
		scr.jeanspant_cart().click();
		Thread.sleep(2000);
		scr.beltpant_cart().click();
		//Thread.sleep(5000);
		scr.shopping_cart().click();
		//Thread.sleep(2000);
		tests.log(Status.INFO, "shoping cart is displayed");
		scr.jeanspant_cb().click();
		Thread.sleep(2000);
		scr.beltpant_cb().click();
		Thread.sleep(2000);
		String rate = scr.jeans_amount().getText();
		String beltrate = scr.belt_amount().getText();
		Thread.sleep(2000);
		double belt_conversion = Conversion.convert(beltrate);
	    double jeans_rate = Conversion.convert(rate);
		if(belt_conversion > jeans_rate)
		{
			scr.beltpant_cb().click();
			Thread.sleep(2000);
			scr.update_cb().click();
			
		}
		else if(jeans_rate > belt_conversion)
		{
			scr.jeanspant_cb().click();
			Thread.sleep(2000);
			scr.update_cb().click();
		}
		else
		{
			scr.agree().click();
			Thread.sleep(2000);
			scr.checkout_button().click();
			
		}	
		tests.log(Status.PASS, "testcase is passed");
	}
}

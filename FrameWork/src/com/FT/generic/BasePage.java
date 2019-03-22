package com.FT.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
private static WebDriver d;
	
	public BasePage(WebDriver d) 
	{
		this.d=d;
	}
	
	public static void pageVerify(String title)
	{
		WebDriverWait wait = new WebDriverWait(d, 20);
		try 
		{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title is matching" , true);
		} 
		catch (Exception e) 
		{
			Reporter.log("Title is not matching" , false);
		}
		
	}
	
	public static void eleVerify(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(d, 20);
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Title is matching" , true);
		} 
		catch (Exception e) 
		{
			Reporter.log("Title is not matching" , false);
		}
	}

}

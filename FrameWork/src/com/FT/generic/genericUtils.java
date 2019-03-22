package com.FT.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class genericUtils 
{
	public static void selectByvalue(WebElement element , String text)
	{
		Select s = new Select(element);
		s.selectByValue(text);
	}
	
	public static void mouseAction(WebElement target)
	{
		Actions a = new Actions(BaseTest.d);
		a.moveToElement(target).perform();
	}
	
	public static void scrollby(int x , int y)
	{
		JavascriptExecutor j = (JavascriptExecutor) BaseTest.d;
		j.executeScript("window.scrollBy("+x+","+y+")", "");
	}

}

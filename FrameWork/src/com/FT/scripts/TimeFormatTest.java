package com.FT.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.FT.POM.TimeFormat;
import com.FT.generic.BaseTest;
import com.FT.generic.Excel;
import com.FT.generic.genericUtils;

public class TimeFormatTest extends BaseTest {
	
	@Test
	void Change() throws Exception
	{
		
			row = 38;
			TimeFormat t = new TimeFormat(d);
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(5000);

			t.login("testyantra03@gmail.com");
			Thread.sleep(5000);
			
			t.getAccountProperties().click();
			t.getMyAccountLink().click();
			Thread.sleep(5000);
			Actions  action = new Actions(d);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
			genericUtils.selectByvalue(t.getDateFormatControl(), "2");
			Thread.sleep(2000);
			t.getSaveChanges().click();   
			Thread.sleep(2000);
			Excel.WriteResult("Sheet1",Excel.readData("Sheet1", 38, 0) , "Pass");
		
		
	}
	
}

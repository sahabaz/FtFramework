package com.FT.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.FT.POM.TimeFormat;
import com.FT.POM.TimeZone;
import com.FT.generic.BaseTest;
import com.FT.generic.Excel;

public class TimeZoneTest extends BaseTest
{
	
	@Test
	void Check() throws Exception
	{
		
			row=39;
			TimeZone t= new TimeZone(d);
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			TimeFormat t1 = new TimeFormat(d);
			Thread.sleep(3000);
			t1.login("testyantra13@gmail.com");
			Thread.sleep(5000);
			
			t.getAccountProperties().click();
			t.getMyAccountLink().click();
			Thread.sleep(5000);
			Actions  action = new Actions(d);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Select S = new Select(t.getTimeZoneBox());
			S.selectByValue("45");
			Thread.sleep(2000);
			t.getSaveChanges().click();
			Thread.sleep(2000);
			Excel.WriteResult("Sheet1",Excel.readData("Sheet1", 39, 0) , "Pass");
		}

}

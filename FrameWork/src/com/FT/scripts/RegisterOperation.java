package com.FT.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.FT.POM.Register;
import com.FT.generic.BaseTest;
import com.FT.generic.Excel;

public class RegisterOperation  extends BaseTest
{
	@Test 
	public void login() throws Exception
	{
		row = 3;
			Register R = new Register(d);
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			R.getNewUserLink().click();
			Thread.sleep(3000);
			R.getFirstName().sendKeys("Vinit");
			Thread.sleep(2000);
			R.getLastName().sendKeys("Kulkarni");
			Thread.sleep(2000);
			WebElement date = R.getDatePicker();
			Thread.sleep(2000);
			date.click();
			date.sendKeys("1990");
			Thread.sleep(2000);
			date.sendKeys(Keys.ARROW_LEFT);
			date.sendKeys("23");
			Thread.sleep(2000);
			date.sendKeys(Keys.ARROW_LEFT);
			date.sendKeys(Keys.ARROW_LEFT);
			date.sendKeys("09");
			Thread.sleep(2000);
			R.getMobileNumber().sendKeys("8087703118");
			Thread.sleep(2000);
			R.getEmail().sendKeys("vinitkulkarni91@gmail.com");
			Thread.sleep(2000);
			Select S = new Select(R.getState());
			S.selectByIndex(1);
			Thread.sleep(2000);
			S = new Select(R.getCity());
			S.selectByIndex(1);
			Thread.sleep(2000);
			R.getPincode().sendKeys("422011");
			Thread.sleep(2000);
			R.getMPIN().sendKeys("1234");
			Thread.sleep(2000);
			R.getConfirmMPiN().sendKeys("1234");
			Thread.sleep(2000);
			R.getConfirmation_Check().click();
			Thread.sleep(2000);
			R.getSendOTP().click();
			Thread.sleep(2000);
			R.getEnterOTP().sendKeys("4567");
			
			Thread.sleep(2000);
			
			R.getRegisterBtn().click();
			Excel.WriteResult("Sheet1", Excel.readData("Sheet1", 3, 0), "Pass");
		
	}
	
}

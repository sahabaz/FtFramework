package com.FT.scripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.FT.POM.NewCOurse;
import com.FT.POM.TimeFormat;
import com.FT.generic.BaseTest;
import com.FT.generic.Excel;
import com.FT.generic.genericUtils;

public class AddCourse extends BaseTest 
{
	
	@Test
	void addcourse() throws InvalidFormatException, IOException, Exception
	{
			row = 68;
			TimeFormat t =new TimeFormat(d);
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);
			t.login("nishasinghslathia@gmail.com");
			NewCOurse n = new NewCOurse(d);
			Thread.sleep(5000);
			n.getBtnMyProfile().click();
			n.getLnkAdministrator().click();
			Thread.sleep(3000);
			ArrayList<String> tab = new ArrayList<String>(d.getWindowHandles());
			d.switchTo().window(tab.get(1));
			d.switchTo().frame("leftFrame");
			n.getBtnCOurseMgt().click();
			Thread.sleep(3000);
			d.switchTo().defaultContent();
			Thread.sleep(1000);
			d.switchTo().frame("rightFrame");
			Thread.sleep(2000);
			n.getBtnCourseManage().click();
			Thread.sleep(2000);
			n.getBtnAddCourse().click();
			Thread.sleep(1000);
			genericUtils.selectByvalue(n.getDropcourseType(), "4" );
			Thread.sleep(1000);
			genericUtils.selectByvalue(n.getDropcourseCategory(), "8620759");
			Thread.sleep(1000);
			n.getTxtcourseId().sendKeys("New12356");
			Thread.sleep(2000);
			n.getTxtcourseName().sendKeys("CompScience");
			Thread.sleep(2000);
			n.getTxtcourseName().sendKeys("Science");
			Thread.sleep(1000);
			n.getChkbxarithmatic().click();
			Thread.sleep(1000);
			/*n.getChkbxarithmatic().click();
			Thread.sleep(1000);
			*/genericUtils.selectByvalue(n.getDropcourseLevel(), "3");
			Thread.sleep(1000);
			genericUtils.selectByvalue(n.getDropcourseLanguage(), "20016");
			Thread.sleep(1000);
			n.getTxtuploadFile().sendKeys("C:\\Users\\Vinit\\Desktop\\mypic.png");
			Thread.sleep(1000);
			n.getTxtManDays().sendKeys("20");
			Thread.sleep(1000);
			n.getTxtCourseTime().sendKeys("30");
			Thread.sleep(1000);
			n.getTxtStartDate().click();
			Thread.sleep(1000);
			d.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[4]")).click();
			Thread.sleep(3000);

			n.getTxtEndDate().click();
			d.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[4]")).click();
			Thread.sleep(1000);
			n.getRadioVisibilityYes().click();
			Thread.sleep(1000);
			
			n.getRadioCertificateOn().click();
			Thread.sleep(1000);
			n.getRadioRatingOn().click();
			Thread.sleep(1000);

			Thread.sleep(5000);
			n.getBtnAdd().click();
			Thread.sleep(5000);
			
			ArrayList<String> tab1 = new ArrayList<String>(d.getWindowHandles());
			d.switchTo().window(tab1.get(1));
			n.getConfirmsave().click();
			Thread.sleep(3000);
			
			d.switchTo().defaultContent();
			
			
			d.switchTo().frame("topFrame");
			Thread.sleep(1000);
			n.getLogout().click();
			
			
			
			Excel.WriteResult("Sheet1", Excel.readData("Sheet1", 68, 0), "Pass");
			
		
		
		
	}
	
}

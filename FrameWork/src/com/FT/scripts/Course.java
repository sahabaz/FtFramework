package com.FT.scripts;

import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.testng.annotations.Test;

import com.FT.POM.CourseCheck;
import com.FT.POM.TimeFormat;
import com.FT.generic.BaseTest;
import com.FT.generic.Excel;

public class Course extends BaseTest
{
	@Test
	public void courseCheck() throws InvalidFormatException, IOException, Exception
	{
			row = 26;
			TimeFormat t = new TimeFormat(d);
			CourseCheck c = new CourseCheck(d);
			Thread.sleep(3000);
			t.login("testyantra13@gmail.com");
			Thread.sleep(3000);
			c.searchBar().sendKeys("communication skill");
			Thread.sleep(1000);
			c.search().click();
			Thread.sleep(7000);
			c.course().click();
			Excel.WriteResult("Sheet1", Excel.readData("Sheet1", 26, 0), "Pass");
		
		
	}
}

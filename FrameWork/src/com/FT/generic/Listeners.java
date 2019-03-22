package com.FT.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener
 
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		BaseTest.logger.log(Status.PASS, "pass");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		TakesScreenshot t = (TakesScreenshot) BaseTest.d;
		File src = t.getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(src, new File("D:\\Vinit\\FrameWork\\ScreenShots\\"+result.getName()+".png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try {
			Excel.WriteResult("Sheet1",Excel.readData("Sheet1",BaseTest.row, 0) , "Fail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		BaseTest.logger.log(Status.FAIL, "Fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}

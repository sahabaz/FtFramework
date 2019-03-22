package com.FT.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest implements AutoConst
{
	public static int row ;
	public static WebDriver d;
	public static ExtentHtmlReporter extent;
	public static ExtentTest test;
	public static ExtentTest logger;
	public static ExtentReports ex;
	
	@BeforeSuite
	public void extentReport()
	{
		extent = new ExtentHtmlReporter("D:\\Vinit\\FrameWork\\Report\\report.html");
		 ex = new ExtentReports();
		ex.attachReporter(extent);
		logger = ex.createTest("Test");
	}
	
	
	@BeforeMethod
	public void preCondition()
	{
		
		
		System.setProperty(Chrome_Key, CHrome_Value);
		d = new ChromeDriver();
		d.get("https://uatft-1.violetlms.com/b2chome ");
	}
	
	@AfterMethod
	public void postCondition() throws Exception
	{
		logger = ex.createTest(Excel.readData("Sheet1", BaseTest.row, 0));
		d.close();
		
	}
	
	@org.testng.annotations.AfterClass
	public void generateReport()
	{
		ex.flush();
	}
	
	

}

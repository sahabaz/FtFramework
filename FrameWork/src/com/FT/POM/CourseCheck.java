package com.FT.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseCheck 
{
	@FindBy(id="txt_Search")
	private WebElement txtsearchBar;
	
	@FindBy(xpath="(//div[.='Course'])[1]")
	private WebElement txtcourse;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	private WebElement btnsearch;
	
	public CourseCheck(WebDriver d) 
	{
		PageFactory.initElements(d, this);
	}
	
	public WebElement searchBar() 
	{
		return txtsearchBar;
	}
	
	public WebElement course() 
	{
		return txtcourse;
	}
	
	public WebElement search() 
	{
		return btnsearch;
	}

}

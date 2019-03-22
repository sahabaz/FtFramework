package com.FT.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeFormat 
{
	@FindBy(id="loginemail")
	private WebElement LoginMail;
	@FindBy(id="btnlogini")
	private WebElement Validate;
	@FindBy(id="MPIN1")
	private WebElement MPIN;
	@FindBy(id="btnvalidatei")
	private WebElement LoginButton;
	@FindBy(id="myHeadericon")
	private WebElement AccountProperties;
	@FindBy(className = "m-nav__link-text")
	private WebElement MyAccountLink;
	@FindBy(name="deteformate")
	private WebElement DateFormatControl;
	@FindBy(xpath="//span[.='Save changes']")
	private WebElement SaveChanges;
	

	public TimeFormat(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}


	public WebElement getLoginMail() {
		return LoginMail;
	}


	public WebElement getValidate() {
		return Validate;
	}


	public WebElement getMPIN() {
		return MPIN;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}


	public WebElement getAccountProperties() {
		return AccountProperties;
	}


	public WebElement getMyAccountLink() {
		return MyAccountLink;
	}


	public WebElement getDateFormatControl() {
		return DateFormatControl;
	}


	public WebElement getSaveChanges() {
		return SaveChanges;
	}
	
	public void login(String Email) throws InterruptedException
	{
		
		getLoginMail().sendKeys(Email);
		getValidate().click();
		Thread.sleep(2000);
		getMPIN().sendKeys("1234");
		getLoginButton().click();
	}
	
}

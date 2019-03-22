package com.FT.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register 
{
	@FindBy(xpath = "//h3[.='Investor']/../../..//p[@class='new_user']")
	private WebElement NewUserLink;
	@FindBy(id = "fullname")
	private WebElement FirstName;
	@FindBy(id= "lastname")
	private WebElement lastName;
	@FindBy(className = "k-input")
	private WebElement DatePicker;
	@FindBy(id = "mobileNumber")
	private WebElement MobileNumber;
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "ddlState")
	private WebElement State;
	@FindBy(id = "ddlCity")
	private WebElement City;
	@FindBy(id = "PinCode")
	private WebElement Pincode;
	@FindBy(id = "newPWD")
	private WebElement MPIN;
	@FindBy(id = "ConfirmNewPWD")
	private WebElement ConfirmMPiN;
	@FindBy(xpath = "//label[contains(.,' I/We have')]")
	private WebElement Confirmation_Check;
	@FindBy(xpath = "//span[.='Send OTP']/../..")
	private WebElement SendOTP;
	@FindBy(id = "otp")
	private WebElement EnterOTP;
	@FindBy(xpath = "//span[.='Register']/../..")
	private WebElement RegisterBtn;
	
	public Register(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}

	public WebElement getNewUserLink() {
		return NewUserLink;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getDatePicker() {
		return DatePicker;
	}

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getPincode() {
		return Pincode;
	}

	public WebElement getMPIN() {
		return MPIN;
	}

	public WebElement getConfirmMPiN() {
		return ConfirmMPiN;
	}

	public WebElement getConfirmation_Check() {
		return Confirmation_Check;
	}

	public WebElement getSendOTP() {
		return SendOTP;
	}

	public WebElement getEnterOTP() {
		return EnterOTP;
	}

	public WebElement getRegisterBtn() {
		return RegisterBtn;
	}
	
	
	

}

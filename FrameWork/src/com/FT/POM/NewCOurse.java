package com.FT.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCOurse
{
	@FindBy(id ="myHeadericon")
	private WebElement btnMyProfile;
	
	@FindBy(xpath = "(//span[@class='m-nav__link-text'])[1]")
	private WebElement lnkAdministrator;
	
	@FindBy(xpath = "//span[.='Course Management']")
	private WebElement btnCOurseMgt;
	
	@FindBy(xpath = "//p[.='Manage Courses']")
	private WebElement btnCourseManage;
	
	@FindBy(xpath = "//p[.='Add Non-SCORM Course']")
	private WebElement btnAddCourse;
	
	@FindBy(id="cmbCoursetype")
	private WebElement dropcourseType;
	
	@FindBy(id="ddlCourseCategory")
	private WebElement dropcourseCategory;
	
	@FindBy(id="txtCourseid")
	private WebElement txtcourseId;
	
	@FindBy(id="txtCoursename")
	private WebElement txtcourseName;
	
	@FindBy(id="TreeView1n0CheckBox")
	private WebElement Chkbxarithmatic;
	
	@FindBy(id="ddlcourselevel")
	private WebElement DropcourseLevel;
	
	@FindBy(id="ddlLanguage")
	private WebElement DropcourseLanguage;
	
	@FindBy(id="CourseFilepath")
	private WebElement txtuploadFile;
	
	@FindBy(id = "txtManDay")
	private WebElement txtManDays;
	
	@FindBy(id="txtCoursetime")
	private WebElement txtCourseTime;
	
	@FindBy(id = "txtStartDate")
	private WebElement txtStartDate;
	
	@FindBy(id ="txtEndDate")
	private WebElement txtEndDate;
	
	@FindBy(id="rbVisibleOn")
	private WebElement radioVisibilityYes;
	
	@FindBy(id="rbVisibleOff")
	private WebElement radioVisibilityNo;
	
	
	@FindBy(id = "rdbCertificateOn")
	private WebElement radioCertificateOn;
	
	@FindBy(id = "rdbCertificateOff")
	private WebElement radioCertificateOff;
	
	@FindBy(id = "rdbRatingOn")
	private WebElement radioRatingOn;
	
	@FindBy(id = "rdbRatingOff")
	private WebElement radioRatingOff;
	
	@FindBy(name ="chkAppearinPopUp")
	private WebElement chkbxGroup;
	
	@FindBy(id = "lstUserMaster")
	private WebElement dropGroupSelector;
	
	@FindBy(id = "btnAdd")
	private WebElement btnAdd;
	
	@FindBy(id = "ALogout")
	private WebElement Logout;
	
	@FindBy(name = "btnsave")
	private WebElement Confirmsave;
	
	public WebElement getConfirmsave() {
		return Confirmsave;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public NewCOurse(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}

	public WebElement getBtnMyProfile() {
		return btnMyProfile;
	}

	public WebElement getLnkAdministrator() {
		return lnkAdministrator;
	}

	public WebElement getBtnCOurseMgt() {
		return btnCOurseMgt;
	}

	public WebElement getBtnCourseManage() {
		return btnCourseManage;
	}

	public WebElement getBtnAddCourse() {
		return btnAddCourse;
	}

	public WebElement getDropcourseType() {
		return dropcourseType;
	}

	public WebElement getDropcourseCategory() {
		return dropcourseCategory;
	}

	public WebElement getTxtcourseId() {
		return txtcourseId;
	}

	public WebElement getTxtcourseName() {
		return txtcourseName;
	}

	public WebElement getChkbxarithmatic() {
		return Chkbxarithmatic;
	}

	public WebElement getDropcourseLevel() {
		return DropcourseLevel;
	}

	public WebElement getDropcourseLanguage() {
		return DropcourseLanguage;
	}

	public WebElement getTxtuploadFile() {
		return txtuploadFile;
	}

	public WebElement getTxtManDays() {
		return txtManDays;
	}

	public WebElement getTxtCourseTime() {
		return txtCourseTime;
	}

	public WebElement getTxtStartDate() {
		return txtStartDate;
	}

	public WebElement getTxtEndDate() {
		return txtEndDate;
	}

	public WebElement getRadioVisibilityYes() {
		return radioVisibilityYes;
	}

	public WebElement getRadioVisibilityNo() {
		return radioVisibilityNo;
	}

	public WebElement getRadioCertificateOn() {
		return radioCertificateOn;
	}

	public WebElement getRadioCertificateOff() {
		return radioCertificateOff;
	}

	public WebElement getRadioRatingOn() {
		return radioRatingOn;
	}

	public WebElement getRadioRatingOff() {
		return radioRatingOff;
	}

	public WebElement getChkbxGroup() {
		return chkbxGroup;
	}

	public WebElement getDropGroupSelector() {
		return dropGroupSelector;
	}

	public WebElement getBtnAdd() {
		return btnAdd;
	}

	
	


}

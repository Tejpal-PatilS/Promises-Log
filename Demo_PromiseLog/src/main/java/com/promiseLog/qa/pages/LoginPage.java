package com.promiseLog.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.promiseLog.qa.TestBase.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath="//input[@name='txtUsername']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='submit1']")
	WebElement login_btn;
	
	@FindBy(xpath="//font[text()='Invalid Username/password']")
	WebElement errorMsg;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginbtn()
	{
		login_btn.click();
	}
	
	public String error_msg()
	{
		return errorMsg.getText();
	}
	
	public void loginToApplication(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		this.clickOnLoginbtn();
	}
	
	public String getTitlefromsite()
	{
		return driver.getTitle();
	}
}

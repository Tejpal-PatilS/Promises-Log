package com.promiseLog.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.promiseLog.qa.TestBase.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//b[text()='LOGOUT']")
	WebElement logout;
	
	@FindBy(xpath="//a[text()='Log Promise']")
	WebElement log_promise;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogout()
	{
		logout.click();
	}
	
	public void clickOnLogPromiselink()
	{
		log_promise.click();
	}
}

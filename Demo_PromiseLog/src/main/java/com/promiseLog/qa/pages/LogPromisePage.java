package com.promiseLog.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.promiseLog.qa.TestBase.TestBase;
import com.promiseLog.qa.Utils.TestUtils;

public class LogPromisePage extends TestBase{

	@FindBy(xpath="//select[@name='cboEmp']")
	WebElement promise_from;
	
	@FindBy(id="txtPromise")
	WebElement promise_txt;
	
	@FindBy(id="btnSubmit")
	WebElement log_promise;
	
	public LogPromisePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectPromiseFromList(String value)
	{
		TestUtils.selectitemfromlist(promise_from, value);
	}
	
	public void enterPromise(String promise)
	{
		promise_txt.sendKeys(promise);
	}
	
	public void clickOnLogPromise()
	{
		log_promise.click();
	}
	
}

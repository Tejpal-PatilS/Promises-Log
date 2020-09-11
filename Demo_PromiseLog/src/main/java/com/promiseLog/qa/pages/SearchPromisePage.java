package com.promiseLog.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.promiseLog.qa.TestBase.TestBase;
import com.promiseLog.qa.Utils.TestUtils;

public class SearchPromisePage extends TestBase{

	@FindBy(id="cboEmp")
	WebElement promisor;
	
	@FindBy(xpath="//input[@name='btnSearch']")
	WebElement search_btn;
	
	public SearchPromisePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectPromisorFromList(String value)
	{
		TestUtils.selectitemfromlist(promisor, value);
	}
	
	public void clickOnSearchButton()
	{
		search_btn.click();
	}
	
}

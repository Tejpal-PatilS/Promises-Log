package com.promiseLog.qa.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.promiseLog.qa.TestBase.TestBase;
import com.promiseLog.qa.pages.HomePage;
import com.promiseLog.qa.pages.LogPromisePage;
import com.promiseLog.qa.pages.LoginPage;
import com.promiseLog.qa.pages.SearchPromisePage;

public class Promise_Log_TestCases extends TestBase {

	LoginPage login;
	HomePage home;
	LogPromisePage log;
	SearchPromisePage search;
	
	@BeforeClass
	public void setup()
	{
		initialization();
		login=new LoginPage();
		home=new HomePage();
		log=new LogPromisePage();
		search=new SearchPromisePage();
	}
	
	@Test(priority=1)
	public void clickonLoginbtnTest()
	{
		login.clickOnLoginbtn();
		String err=login.error_msg();
		Assert.assertEquals(err, "Invalid Username/password");
	}
	
	@Test(priority=2)
	public void loginToSite()
	{
		login.loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
		String title=login.getTitlefromsite();
		Assert.assertEquals(title, "Promises Log");
	}
	
	@Test(priority=3)
	public void addPromiseTest()
	{
		home.clickOnLogPromiselink();
		log.selectPromiseFromList("Sonali test");
		log.enterPromise("Enter Promise");
		log.clickOnLogPromise();
	}
	
	@Test(priority=4)
	public void searchPromiseAddTest()
	{
		search.selectPromisorFromList("Sonali test");
		search.clickOnSearchButton();
	}
	
	@Test(priority=5)
	public void clickOnLogoutTest()
	{
		home.clickOnLogout();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}

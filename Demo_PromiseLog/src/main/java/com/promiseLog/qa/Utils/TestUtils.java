package com.promiseLog.qa.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestUtils {

	public static void selectitemfromlist(WebElement element, String value)
	{
		Select s=new Select(element);
		s.selectByVisibleText(value);
	}
}

package com.hrm.generickeyword;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Keywords {

	public static WebDriver driver;
	
	public void clickonWebelement(WebElement element) {
		try {
			element.click();
		}catch (WebDriverException e) {
			
			JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
			jsExecutor.executeScript("arguments[0].click();", element);
			
		}
	}
	
	
	
	
}

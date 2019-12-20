/**
 * 
 */
package com.hrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.generickeyword.Keywords;

public class dashboard {

	public WebDriver driver;
	Keywords objkeywords=new Keywords();
	public dashboard(WebDriver driver) {
		driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"usersLink\"]")
	WebElement manageusers;
	
	
	public void click_manageusers() {
		
		objkeywords.clickonWebelement(manageusers);
		
	}
	
}

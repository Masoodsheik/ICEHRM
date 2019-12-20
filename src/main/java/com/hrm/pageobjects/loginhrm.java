package com.hrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrm.generickeyword.Keywords;

public class loginhrm {
	Keywords objkeywords = new Keywords();
	WebDriverWait waiter;
	public WebDriver driver;

	public loginhrm(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"username\"]")
	WebElement username;
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement Password;
	@FindBy(xpath = "//*[@id=\"loginForm\"]/fieldset/button")
	WebElement btsign;

	@FindBy(xpath = "//*[@id=\"delegationDiv\"]/nav/div[2]/ul/li[5]/a")
	WebElement uservalidation;

	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	WebElement signout;
	
	public void fn_enterusername(String uname) {
		// objkeywords.Enterdata(username, uname);
		try {
			if (username.isDisplayed()) {
				username.sendKeys(uname);
			} else {
				System.out.println("Element is not found/Displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.fillInStackTrace());
		}
	}

	public void fn_enterpasswrod(String pass) {
		Password.sendKeys(pass);

	}

	public void clickonsignbt() {
		
		// objkeywords.clickWebelement(btsign);
		// btsign.click();
		objkeywords.clickonWebelement(btsign);

	}

	public String getUserValidation() {
		return uservalidation.getText();
	}

	
	public void clickonsignout() throws InterruptedException {
		
		uservalidation.click();
		Thread.sleep(1000);
		objkeywords.clickonWebelement(signout);
		
	}
}

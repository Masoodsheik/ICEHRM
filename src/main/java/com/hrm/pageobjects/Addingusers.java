package com.hrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Addingusers {

	public WebDriver driver;

	public Addingusers(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);
	}
}

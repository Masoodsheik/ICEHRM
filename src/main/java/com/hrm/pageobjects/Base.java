package com.hrm.pageobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import bsh.Capabilities;

public class Base {

	public WebDriver driver;

//	public String brpath="E:\\POMHRM\\drivers\\geckodriver.exe";
//	public String url="https://opensource-demo.orangehrmlive.com/";
	String br = "firefox";
	DesiredCapabilities capabilities;

	@BeforeClass
	public void init() throws IOException {

		FileInputStream fis = new FileInputStream("E:\\POMHRM\\config\\config.Properties");
		Properties prop = new Properties();
		prop.load(fis);

		if (br.equalsIgnoreCase(prop.getProperty("browser"))) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("brpath"));
			capabilities = DesiredCapabilities.firefox();
			FirefoxOptions options = new FirefoxOptions();
			 options.setHeadless(false);
		//	 options.setAcceptInsecureCerts(true);
		//	 options.setUnhandledPromptBehaviour(SETA)
			driver = new FirefoxDriver(options);
			
			capabilities.merge(options);

		} else {

			System.out.println("Select the Browser");

		
		}
		driver.get(prop.getProperty("url"));

	}

}

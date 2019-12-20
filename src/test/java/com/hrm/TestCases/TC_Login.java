package com.hrm.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrm.pageobjects.Base;
import com.hrm.pageobjects.dashboard;
import com.hrm.pageobjects.loginhrm;

public class TC_Login extends Base {

	@Test(priority = 1)
	public void LoginTest() throws InterruptedException {
		String userinput="IceHrm";
		String usern="AdMiN";
		loginhrm objlogin = new loginhrm(driver);
		objlogin.fn_enterusername(usern.toLowerCase());
		objlogin.fn_enterpasswrod("admin");
		objlogin.clickonsignbt();
		Thread.sleep(1000);
		//Welcome Admin
		String getValues=objlogin.getUserValidation().trim();
	//	String [] getval=getValues.split("\\s");
	//	System.out.println(getval[0] + "\t"+getval[1]);
		if(userinput.equalsIgnoreCase(getValues)) {
			Assert.assertEquals(getValues, userinput);
			System.out.println("Passed");
		}else {
			System.out.println("Fail");
		}
	
		//objlogin.clickonsignout();
		
	}
	
	
	@Test(priority = 2)
	public void TC_Dashboard() {
		
		dashboard objdashboard=new dashboard(driver);
		
		objdashboard.click_manageusers();
	}
	

	
}

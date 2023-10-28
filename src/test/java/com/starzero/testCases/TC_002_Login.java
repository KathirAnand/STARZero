package com.starzero.testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.starzero.helperClass.*;
import com.starzero.helperClass.LoginPage;
import com.starzero.testBase.BaseClass;
import com.starzero.testDatas.*;

public class TC_002_Login extends BaseClass{
	
	LoginPage loginPage;
	IndividualPage ip;
	HomePage home;
	
	
	@Test(priority = 1)
	public void successLogin() {
		String country = "UK";
		selectCountry(country);
		 new HomePage(driver)
		.clickLoginBtn()
		.setEmail(rb.getString("UKEMAILID"))
		.setPassword(rb.getString("ALLPASSWORD"))
		.clickCheckBox()
		.clickSignInBtn();
	}
	
	
	@Test(priority = 2,dataProvider = "ukLoginDatas", dataProviderClass = LoginTestDatas.class ,groups = {"TDD"})
	public void LoginTDD(String country, String emailID,String password,String expected) throws InterruptedException {
		selectCountry(country);
		home = new HomePage(driver);
		loginPage = home.clickLoginBtn()
		.setEmail(emailID)
		.setPassword(password)
		.clickCheckBox();
		ip = loginPage.clickSignInBtn();
		if(expected.equalsIgnoreCase("invalid")) {
			if(loginPage.notValidUserMessage()) {
				logger.info("Invalid user and notValid user message is displayed");
			}
			else {
				logger.info("Invalid user is getting logged into the application and notValid user message is not displayed");
				Assert.fail();
			}
		}
		else if(expected.equalsIgnoreCase("valid")) {
			if(home.profileIcon()) {
				logger.info("Valid user is getting logged into the applications");
				home.signOut();
				logger.info("SignOut is clicked");
			}
			else {
				logger.info("Valid user is not getting logged into the applications");
				Assert.fail();
			}
			
		}
		
		
	}
}

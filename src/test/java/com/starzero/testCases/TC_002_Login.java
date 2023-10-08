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
	
	@Ignore
	@Test
	public void successLogin() {
		
		HomePage home = new HomePage(driver);
		loginPage = home.clickLoginBtn();
		loginPage.setEmail(rb.getString("UKEMAILID"));
		loginPage.setPassword(rb.getString("ALLPASSWORD"));
		loginPage.clickCheckBox();
		ip =loginPage.clickSignInBtn();
	}
	
	
	@Test(dataProvider = "ukLoginDatas", dataProviderClass = LoginTestDatas.class ,groups = {"TDD"})
	public void LoginTDD(String country, String emailID,String password,String expected) throws InterruptedException {
		selectCountry(country);
		HomePage home = new HomePage(driver);
		loginPage = home.clickLoginBtn();
		loginPage.setEmail(emailID);
		loginPage.setPassword(password);
		loginPage.clickCheckBox();
		ip =loginPage.clickSignInBtn();
		if(expected.equalsIgnoreCase("invalid")) {
			if(loginPage.notValidUserMessage()) {
				
			}
			else {
				Assert.fail();
			}
		}
		else if(expected.equalsIgnoreCase("valid")) {
			if(home.profileIcon()) {
				home.signOut();
			}
			else {
				Assert.fail();
			}
			
		}
		
		
	}
}

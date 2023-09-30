package com.starzero.testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.starzero.helperClass.*;
import com.starzero.helperClass.LoginPage;
import com.starzero.testBase.BaseClass;

public class TC_002_Login extends BaseClass{
	
	LoginPage loginPage;
	IndividualPage ip;
	
	
	@Test
	public void successLogin() {
		
		HomePage home = new HomePage(driver);
		loginPage = home.clickLoginBtn();
		loginPage.setEmail(rb.getString("UKEMAILID"));
		loginPage.setPassword(rb.getString("ALLPASSWORD"));
		loginPage.clickCheckBox();
		ip =loginPage.clickSignInBtn();
	}
	
	@Ignore
	@Test(groups = {"TDD"})
	public void LoginTDD() {
		
	}
}

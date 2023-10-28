package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.starzero.pageObjects.LoginPageObjects;

public class LoginPage extends LoginPageObjects{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage setEmail(String emailId) {
		if(isDisplayedInUI(emailInputField)) {
			clearAndType(emailInputField, emailId);
			logger.info(emailId +" is entered");
		}
		else {
			logger.info(emailInputField +" is not displayed in UI");
			Assert.fail();
		}
		return this;
	}
	
	public LoginPage setPassword(String password) {
		if(isDisplayedInUI(passwordInputField)) {
			clearAndType(passwordInputField, password);
			logger.info(password +" is entered");
		}
		else {
			logger.info(passwordInputField +" is not displayed in UI");
			Assert.fail();
		}
		return this;
	}
	
	public LoginPage clickCheckBox() {
		clickElement(privacyPolicyCheckBox);
		Assert.assertTrue(isSelected(privacyPolicyCheckBox));
		logger.info("Privacy policy checkbox is clicked");
		return this;
	}
	
	public IndividualPage clickSignInBtn() {
		clickElement(signInBtn);
		logger.info("Sign In button is clicked");
		
		return new IndividualPage(driver);
	}
	
	public boolean notValidUserMessage() {
		return isDisplayedInUI(notValidUser);
	}
	
	public HomePage login() {
		 new HomePage(driver)
			.clickLoginBtn()
			.setEmail(rb.getString("UKEMAILID"))
			.setPassword(rb.getString("ALLPASSWORD"))
			.clickCheckBox()
			.clickSignInBtn();
		 return new HomePage(driver);
	}
	
	
	
}

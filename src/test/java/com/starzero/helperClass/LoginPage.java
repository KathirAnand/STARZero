package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.starzero.pageObjects.LoginPageObjects;

public class LoginPage extends LoginPageObjects{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void setEmail(String emailId) {
		if(isDisplayedInUI(emailInputField)) {
			clearAndType(emailInputField, emailId);
		}
		else {
			logger.info(emailInputField +" is not displayed in UI");
			Assert.fail();
		}
		
	}
	
	public void setPassword(String password) {
		if(isDisplayedInUI(passwordInputField)) {
			clearAndType(passwordInputField, password);
		}
		else {
			logger.info(passwordInputField +" is not displayed in UI");
			Assert.fail();
		}
	}
	
	public void clickCheckBox() {
		clickElement(privacyPolicyCheckBox);
		Assert.assertTrue(isSelected(privacyPolicyCheckBox));
	}
	
	public IndividualPage clickSignInBtn() {
		clickElement(signInBtn);
		return new IndividualPage(driver);
	}
	
	
}

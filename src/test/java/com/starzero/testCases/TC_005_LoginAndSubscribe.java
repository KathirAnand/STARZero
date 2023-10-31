package com.starzero.testCases;

import org.testng.annotations.Test;

import com.starzero.helperClass.HomePage;
import com.starzero.testBase.BaseClass;

public class TC_005_LoginAndSubscribe extends BaseClass{
	
	@Test
	public void loginAndSubscribe() throws InterruptedException {
		String country = "UK";
		selectCountry(country);
		 new HomePage(driver)
		.clickLoginBtn()
		.setEmail(rb.getString("UKEMAILID"))
		.setPassword(rb.getString("ALLPASSWORD"))
		.clickCheckBox()
		.clickSignIn()
		.clickSubscribeNowBtn()
		.setCardNumber(rb.getString("CARDNUMBER"))
		.setCardExpiryMonth(rb.getString("EXPIRYMONTH"))
		.setCardCVC(rb.getString("CVC"))
		.clickPayBtn();
	}
}

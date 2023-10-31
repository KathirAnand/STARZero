package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;

import com.starzero.pageObjects.PaymentSuccessfulPageObjects;

public class PaymentSuccessfulPage extends PaymentSuccessfulPageObjects {

	public PaymentSuccessfulPage(WebDriver driver) {
		super(driver);
	}
	
	public PaymentSuccessfulPage getTransactioId() {
		
		return this;
	}
	public LoginPage waitAndRedirect() {
		return new LoginPage(driver);
	}
}

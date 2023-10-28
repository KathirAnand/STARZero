package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;

import com.starzero.pageObjects.OrderSummaryPageObjects;

public class OrderSummaryPage extends OrderSummaryPageObjects{

	public OrderSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	public OrderSummaryPage clickSubscribeNowBtn() {
		try {
			clickElement(subscribeNowBtn);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return this;
	}
	
	public OrderSummaryPage clickPayBtn() {
		try {
			clickElement(payBtn);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return this;
	}
	
	public OrderSummaryPage setCardNumber(String cardNumber) {
		try {
			clearAndType(cardNumberInputField, cardNumber);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return this;
	}
	
	public OrderSummaryPage setCardExpiryMonth(String expiryMonthAndYear) {
		try {
			clearAndType(monthInputField, expiryMonthAndYear);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return this;
	}
	
	public OrderSummaryPage setCardCVC(String CVCNumber) {
		try {
			clearAndType(monthInputField, CVCNumber);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return this;
	}

}

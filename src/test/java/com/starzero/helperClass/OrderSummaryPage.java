package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.starzero.pageObjects.OrderSummaryPageObjects;
import com.starzero.testDatas.SignUp_GeneratedData;

public class OrderSummaryPage extends OrderSummaryPageObjects{

	public OrderSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	public OrderSummaryPage setRegisterDataIntoExcel(String[] data,String country) throws Exception {
		SignUp_GeneratedData.setGeneratedDataIntoExcel(data, country);
		return this;
	}
	public OrderSummaryPage clickSubscribeNowBtn() {
		try {
			waitAndClick(subscribeNowBtn);
		}catch(Exception ex) {
			Assert.fail();
			ex.printStackTrace();
		}
		return this;
	}
	
	public PaymentSuccessfulPage clickPayBtn() {
		try {
			clickElement(payBtn);
		}catch(Exception ex) {
			Assert.fail();
			ex.printStackTrace();
		}
		return new PaymentSuccessfulPage(driver);
	}
	
	public OrderSummaryPage setCardNumber(String cardNumber) {
		try {
			jsSendkey(cardNumberInputField, cardNumber);
		}catch(Exception ex) {
			Assert.fail();
			ex.printStackTrace();
			
		}
		return this;
	}
	
	public OrderSummaryPage setCardExpiryMonth(String expiryMonthAndYear) {
		try {
			clearAndType(monthInputField, expiryMonthAndYear);
		}catch(Exception ex) {
			Assert.fail();
			ex.printStackTrace();
		}
		return this;
	}
	
	public OrderSummaryPage setCardCVC(String CVCNumber) {
		try {
			clearAndType(monthInputField, CVCNumber);
		}catch(Exception ex) {
			Assert.fail();
			ex.printStackTrace();
		}
		return this;
	}

}

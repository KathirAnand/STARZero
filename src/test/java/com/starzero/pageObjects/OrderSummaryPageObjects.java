package com.starzero.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryPageObjects extends BasePage{
	
	public OrderSummaryPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//button[text()='Subscribe Now']")
	protected WebElement subscribeNowBtn;
	

	//img[@class='OrderSummary_edit_side__Ylr4l']
	//img[@class='OrderSummary_edit_side1__LfdMH']
	//h2[@class='col-xl-12 col-lg-12 col-md-12 col-sm-12 col-xs-12 text-uppercase OrderSummary_os_subname__fgmWc OrderSummary_price_head_align__hx8Pc']
	//div[@class='col-xl-4 col-lg-4 col-md-12 OrderSummary_os_side_card__6y9fO p-5']//div[4]//div[2]//p[1]
	//p[normalize-space()='Registration Number']
	//p[normalize-space()='VO22SSU']
	//p[normalize-space()='Petrol']
	//p[normalize-space()='281']
	//p[normalize-space()='CO2']
	//p[normalize-space()='Fuel Type']
	//button[@type='submit']
	

	//input[@placeholder='Card number']
	//input[@placeholder='MM / YY']
	//input[@placeholder='CVC']
	//button[@id='submit']

}

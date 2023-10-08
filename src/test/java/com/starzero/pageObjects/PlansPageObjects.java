package com.starzero.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class PlansPageObjects extends BasePage {

	public PlansPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "((//label[text()='Select your country']))[1]")
	public WebElement dropDownLabel;

	@FindBy(xpath = "//div[@role='button']")
	public WebElement dropdown;

	@FindBy(xpath = "//li[normalize-space()='IN']")
	public WebElement countrtIndia;

	@FindBy(xpath = "//li[contains(text(),'UK')]")
	protected WebElement countrtUK;

	@FindAll(@FindBy(xpath = "//ul[@role = 'listbox']/child::li"))
	protected List<WebElement> countries;

	@FindBy(xpath = "//button[normalize-space()='Plan for Car']")
	protected WebElement planForCar;

	@FindBy(xpath = "//button[normalize-space()='Plan for Bike']")
	protected WebElement planForBike;

	@FindBy(xpath = "//button[normalize-space()='Most Popular Plan']")
	protected WebElement mostPopularPlan;

	@FindBy(xpath = "//h2[text()='Breeze Basic']")
	protected WebElement textBreezeBasic;

	@FindBy(xpath = "//h2[text()='Windy Essential']")
	protected WebElement textWindyEssential;

	@FindBy(xpath = "//h2[text()='Aero Supreme']")
	protected WebElement textAeroSupreme;

	@FindBy(id = "outlined-basic")
	protected WebElement vehicleRegNoInputField;

	@FindBy(xpath = "//button[text()='Find My Car']")
	protected WebElement txtFindMyCarBtn;

	@FindBy(xpath = "//button[@type='submit']")
	protected WebElement regNoSubmitBtn;

	@FindBy(xpath = "//button[text()='Re-enter reg.']")
	protected WebElement reEnterRegNoBtn;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	protected WebElement yesBtn;

	@FindBy(xpath = "//button[normalize-space()='No']")
	protected WebElement noBtn;

	@FindBy(xpath = "(//h6)[1]")
	protected WebElement vehicleMakeName;

	@FindBy(xpath = "(//h6)[1]/following-sibling::p")
	protected WebElement vehicleDetailsText;

	@FindBy(xpath = "//button[normalize-space()='Subscribe']")
	protected WebElement subscribeBtn;

	@FindBy(xpath = "//button[normalize-space()='Old']")
	protected WebElement oldVehicleBtn;

	@FindBy(xpath = "//button[normalize-space()='New']]")
	protected WebElement newVehicleBtn;

	@FindBy(xpath = "//input[@name = 'firstName']")
	protected WebElement firstNameInputField;

	@FindBy(xpath = "//input[@name = 'lastName']")
	protected WebElement lastNameInputField;

	@FindBy(xpath = "//input[@name = 'vehicle.firstName']")
	protected WebElement ownerFirstNameInputField;

	@FindBy(xpath = "//input[@name = 'vehicle.lastName']")
	protected WebElement ownerLastNameInputField;

	@FindBy(xpath = "//input[@name = 'email']")
	protected WebElement emailInputField;

	@FindBy(xpath = "//input[@name = 'mobileNumber']")
	protected WebElement mobileNumberInputField;

	@FindBy(xpath = "//input[@name = 'passWord']")
	protected WebElement passWordInputField;

	@FindBy(xpath = "//button[@aria-label = 'toggle password visibility']")
	protected WebElement passWordVisiblityEyeIcon;

	@FindBy(xpath = "//input[@name = 'vehicle.checkbox']")
	protected WebElement termsOfUseCheckBox;

	// span[normalize-space()='terms and condition']
	// label[normalize-space()='First Name*']
	// label[normalize-space()='Last Name*']

	// label[normalize-space()='Email*']
	// label[normalize-space()='Mobile Number*']
	// label[normalize-space()="Owner's First Name*"]
	// label[normalize-space()="Owner's Last Name*"]
	// label[normalize-space()="Password*"]

	@FindBy(xpath = "//div[@class='swiper-slide col-lg-4 col-sm-6 col-xs-6 col-xl-4 col-md-4 wow fadeInUp swiper-slide-active']//button[@class='Plans_price_btn__uzqTq Plans_plan_button__fkD73 text-center col-xl-12 col-lg-12 col-md-12 col-sm-6 col-xs-']")
	protected WebElement breezeBasicForCarUK;
	
	
	@FindBy(xpath="(//a[text()='Get Started'])[1]")
	protected WebElement breezeCarUK;

	@FindBy(xpath = "//div[@class='Plans_single_pricing1__iaoLh col-xl-12 col-lg-12 col-md-12 col-sm-12 col-xs-12']//button[@class='Plans_price_btn__uzqTq Plans_plan_button__fkD73 text-center col-xl-12 col-lg-12 col-md-12 col-sm-6 col-xs-']]")
	protected WebElement windyEssentialForCarUK;

	@FindBy(xpath = "//div[@class='swiper-slide col-lg-4 col-sm-6 col-xs-6 col-xl-4 col-md-4 wow fadeInUp']//button[@class='Plans_price_btn__uzqTq Plans_plan_button__fkD73 text-center col-xl-12 col-lg-12 col-md-12 col-sm-6 col-xs-']")
	protected WebElement aeroSupremeForCarUK;

}

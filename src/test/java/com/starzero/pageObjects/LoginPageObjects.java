package com.starzero.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects extends BasePage{

	public LoginPageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h1[normalize-space()='Welcome Back!']")
	protected WebElement loginPageHeading;
	
	@FindBy(css = "[name = 'userName']")
	protected WebElement emailInputField;
	
	@FindBy(css = "[name = 'password']")
	protected WebElement passwordInputField;
	
	@FindBy(xpath = "//button[@aria-label='toggle password visibility']//*[name()='svg']")
	protected WebElement visiblePassword;
	
	@FindBy(css = "input[name='checkbox']")
	protected WebElement privacyPolicyCheckBox;
	
	@FindBy(css = "button[type='submit']")
	protected WebElement signInBtn;
	
	@FindBy(xpath = "//span[normalize-space()='Sign up']")
	protected WebElement signUpLink;
	
	@FindBy(xpath = "//p[@class='text-danger text-bold border']")
	protected WebElement notValidUser;
	
	//a[normalize-space()='Journey']
	
}

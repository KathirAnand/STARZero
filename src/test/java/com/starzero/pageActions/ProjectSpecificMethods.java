package com.starzero.pageActions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import com.starzero.testBase.BaseClass;
import com.starzero.testBase.FilePaths;

public class ProjectSpecificMethods extends BaseClass{
	static Faker faker;
	
	public static String getTimestamp() {
		return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	}
	
	public static String captureScreen(String tname) throws IOException {

		String timeStamp = getTimestamp();
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = FilePaths.SCREENSHOT_HOME + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}
	
	public static String generateName() {
		faker = new Faker();
		return faker.name().fullName();
	}
	
	public static String generateFirstName() {
		faker = new Faker();
		return faker.name().firstName();
	}
	public static String generateLastName() {
		faker = new Faker();
		return faker.name().lastName();
	}
	public static String generateEmailId() {
		faker = new Faker();
		return faker.internet().emailAddress();
	}
	
	public static PhoneNumber generatePhoneNumber() {
		faker = new Faker();
		return faker.phoneNumber();
	}
	public static String generateRandomNumber() {
		int min_prefix=700;
		int max_prefix=999;
		int min_no=1000000;
		int max_no=9999999;
		Random random=new Random();
		int prefix=random.nextInt(max_prefix - min_prefix+1)+min_prefix;
		int number=random.nextInt(max_no-min_no+1)+min_no;
		return prefix+String.format("%07d", number);
	}
	
	
	public static void main(String[] args) {
		faker = new Faker();
		System.out.println(generateRandomNumber());
	}

}

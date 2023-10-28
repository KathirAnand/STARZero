package com.starzero.testBase;

import java.io.File;

public class FilePaths {
	public final static String USER_HOME=System.getProperty("user.dir")+File.separator;
	public static final String TESTDATA_HOME=USER_HOME+"testDatas"+File.separator;
	public static final String LOGIN_TESTDATAS = TESTDATA_HOME +"loginTestDatas.xlsx";
	public static final String REPORT_HOME=USER_HOME+"reports"+File.separator;
	public static final String EXTENTREPORT_FILE=REPORT_HOME+"test-output\\FailedTestsScreenshots\\";
	public static final String SCREENSHOT_HOME=USER_HOME+"screenshots"+File.separator;
	
	public static final String IMG_PATH=SCREENSHOT_HOME+"odometer.jpg";
	public static final String SIGNIN_DATAS = TESTDATA_HOME + "SignIn_Datas.csv";
	public static final String 	REGISTERED_DATAS = TESTDATA_HOME + "register_generatedData.xlsx";
	
//	public static void main(String[] args) {
//		System.out.println(USER_HOME);
//		System.out.println(TESTDATA_HOME);
//		System.out.println(REPORT_HOME);
//		System.out.println(SCREENSHOT_HOME);
//		System.out.println(LOGIN_TESTDATAS);
////		System.out.println(USER_HOME);
////		System.out.println(USER_HOME);
//		
//	}
}

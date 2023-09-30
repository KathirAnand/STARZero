package com.starzero.pageActions;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.starzero.testBase.BaseClass;

public class ProjectSpecificMethods extends BaseClass{
	
	public static String getTimestamp() {
		return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	}

}

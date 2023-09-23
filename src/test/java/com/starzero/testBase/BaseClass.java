package com.starzero.testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.starzero.pageActions.BrowserActions;
import com.starzero.utilities.ExtentReportUtility;

public class BaseClass extends ExtentReportUtility implements BrowserActions{

	protected static WebDriver driver;
	public ResourceBundle rb;
	public Logger logger;

	@BeforeClass(groups = { "smoke" })
	@Parameters("browser")
	public void lauchBrowser(String browser) {

		rb = ResourceBundle.getBundle("config"); // to get the properties file
		logger = LogManager.getLogger(this.getClass()); // to initiate the logger

		if (browser.equalsIgnoreCase("chrome")) {

			// to ignore the chrome message as "chrome is controlled by selenium"
			ChromeOptions opt = new ChromeOptions();
			opt.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			opt.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(opt);
		} else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions opt = new EdgeOptions();
			opt.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			opt.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(opt);
		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions opt = new FirefoxOptions();
//			opt.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
			opt.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver();
		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(rb.getString("URL"));
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}

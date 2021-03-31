package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.framework.org.Baseclass.BaseClas;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\stepdefinition", monochrome = true, dryRun = false, strict = true)
public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {

		String browserName = FileReaderManager.getInstance().getCrInstance().getBrowserName();
		driver = BaseClas.browserLaunch("chrome");
	}

	@AfterClass
	public static void tearDown() throws InterruptedException, IOException {
		FileReaderManager.getInstance().getCrInstance().wait();
		// Thread.sleep(3000);
		driver.quit();
	}

}

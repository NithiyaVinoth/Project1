package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\WELCOME\\eclipse-workspace\\Nithiya_Project\\src\\test\\FeatureFile\\Login.feature", glue = "com.stepdefinition", monochrome = true, dryRun = false, strict = true, plugin = {
		"html:Reports/Cucumber_Report", "pretty", "json:Reports/Json_Report",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/extent_cucumber.html" })

public class Run_Adactin {

	public static WebDriver driver;
	public static WebDriver getBrowser (String string) {
		return null;
		
		
	}

	@BeforeClass
	public static void setUp() {
		driver = Base_Class.getBrowser("Chrome");
	}

	@AfterClass
	public static void tearDown() {
		driver.close();

	}

}

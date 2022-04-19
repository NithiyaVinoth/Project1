package com.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;// null driver

	public static WebDriver getBrowser(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		return driver;
	}

	public static void clickbutton(WebElement E1) {
		E1.click();

	}

	public static void inputText(WebElement E1, String Value) {
		E1.sendKeys(Value);
	}

	public static void thread() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void close() {
		driver.close();
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void dropDown(WebElement element, String type, String v) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("Visibletext")) {
			s.selectByVisibleText(v);
		}

		else if (type.equalsIgnoreCase("Byvalue")) {
			s.selectByValue(v);
		}

		else if (type.equalsIgnoreCase("Byindex")) {
			int byIndex_value = Integer.parseInt(v);// string to int conversion

			s.selectByIndex(byIndex_value);
		}

	}

}

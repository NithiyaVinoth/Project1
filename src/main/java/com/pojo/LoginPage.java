package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	

	public static WebDriver driver;
	@FindBy(id="username")
	private WebElement uname;
	@FindBy(id="password")
	private WebElement pswd;
	@FindBy(id="login")
	private WebElement Log;
	public LoginPage(WebDriver driver2) {
	this.driver =driver2;
	PageFactory.initElements(driver, this);
	}
	public WebElement getUname() {
		return uname;
	}
	public WebElement getPswd() {
		return pswd;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getLog() {
		return Log;
	}


}

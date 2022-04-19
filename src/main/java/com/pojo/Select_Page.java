package com.pojo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Select_Page {
	
	
	
	
	
	
	public static WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement select;
	@FindBy(id="continue")
	private WebElement conti;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getConti() {
		return conti;
	}
	
	public Select_Page(WebDriver driver)
	{
	Select_Page.driver=driver;
		PageFactory.initElements(driver,this);
	}}




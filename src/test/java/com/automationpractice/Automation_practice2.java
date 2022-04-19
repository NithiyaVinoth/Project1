package com.automationpractice;

import java.io.IOException;
import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;
import com.helper_file.FileReadManager;
import com.pojo.Homepage_automation;
import com.pojo.LoginPage;
import com.pojo.PageObjectManager;

public class Automation_practice2 extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("Chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);

	public static void main(String[] args) throws InterruptedIOException, IOException {

		// geturl("http://automationpractice.com/index.php");
		// FileReadManager.getInstance_FRM().getInstance_CR().getUrl()
		geturl(FileReadManager.getInstance_FRM().getInstance_CR().getUrl());
		clickbutton(pom.getInstancehp().getSignIn());

		inputText(pom.getInstancelp().getemail(), "nithiyah90");

		inputText(pom.getInstancelp().getPass(), "12345");

		clickbutton(pom.getInstancelp().getSubmit());
	}

}

////		Homepage_automation hp = new Homepage_automation(driver);
//clickbutton(hp.getSignIn());

//LoginPage lp= new LoginPage(driver);

//WebElement username = driver.findElement(By.id("email"));
//
//		WebElement password = driver.findElement(By.id("passwd"));
//
//		inputText(password, "dhiyaa15");
//
//		WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
//
//		clickbutton(submit);

package com.automationpractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base_Class;

public class Automation_Practice extends Base_Class {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		clickbutton(signin);
		
		WebElement username = driver.findElement(By.id("email"));

		inputText(username, "nithiyah90gmail.com");

		WebElement password = driver.findElement(By.id("passwd"));

		inputText(password, "dhiyaa15");

		WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));

		clickbutton(submit);

	}

}

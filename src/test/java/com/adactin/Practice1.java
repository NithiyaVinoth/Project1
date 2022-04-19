package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base.Base_Class;

public class Practice1 extends Base_Class {

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");
		geturl("https://adactinhotelapp.com");

		WebElement username = driver.findElement(By.name("username"));
		inputText(username, "Nithiya90");

		WebElement pass = driver.findElement(By.id("password"));
		inputText(pass, "6B980P");

		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		clickbutton(login);

		WebElement location = driver.findElement(By.name("location"));
		dropDown(location, "VisibleText", "London");

		WebElement Hotel = driver.findElement(By.name("hotels"));
		dropDown(Hotel, "VisibleText", "Hotel Sunshine");

		WebElement room_type = driver.findElement(By.id("room_type"));
		dropDown(room_type, "VisibleText", "Standard");

		WebElement room_no = driver.findElement(By.id("room_nos"));
		dropDown(room_no, "ByValue", "1");

		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.clear();
		inputText(checkin, "22/3/2022");

		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear();
		inputText(checkout, "25/3/2022");

		WebElement adult_rooms = driver.findElement(By.id("adult_room"));

		dropDown(adult_rooms, "ByValue", "2");

		WebElement child_no = driver.findElement(By.id("child_room"));

		dropDown(child_no, "ByValue", "1");

		WebElement search = driver.findElement(By.name("Submit"));

		clickbutton(search);

		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		clickbutton(radiobutton);

		WebElement cont = driver.findElement(By.id("continue"));

		clickbutton(cont);

		WebElement firstname = driver.findElement(By.id("first_name"));
		inputText(firstname, "Nithiya");

		WebElement lastname = driver.findElement(By.id("first_name"));
		inputText(lastname, "Vinoth");

		WebElement address = driver.findElement(By.id("address"));

		inputText(address, "No.6/7, Gandhi St, Arumbakkam, chennai");

		WebElement credit_no = driver.findElement(By.id("cc_num"));
		inputText(credit_no, "1234567898893289");

		WebElement card_type = driver.findElement(By.id("cc_type"));
		dropDown(card_type, "ByVisibleText", "Master Card");

		WebElement expiry = driver.findElement(By.xpath("//Select[@name='cc_exp_month']"));
		dropDown(expiry, "ByVisibleText", "October");

		WebElement expiry_year1 = driver.findElement(By.id("cc_exp_year"));
		dropDown(expiry_year1, "ByValue", "2022");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		inputText(cvv, "123");

		WebElement book = driver.findElement(By.id("book_now"));
		clickbutton(book);

		WebElement logout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
		clickbutton(logout);

	}

}
//		WebElement room_type = driver.findElement(By.id("room_type"));
//		Select n2 = new Select(room_type);
//		n2.selectByValue("Standard");
//		Thread.sleep(3000);
//
//		WebElement room_no = driver.findElement(By.id("room_nos"));
//		Select n3 = new Select(room_no);
//		n3.selectByValue("2");
//		Thread.sleep(3000);
//
//		WebElement adult_rooms = driver.findElement(By.id("adult_room"));
//		Select n4 = new Select(adult_rooms);
//		n4.selectByValue("2");
//		Thread.sleep(3000);
//
//		WebElement child_rooms = driver.findElement(By.id("child_room"));
//		Select n5 = new Select(child_rooms);
//		n5.selectByValue("1");
//		Thread.sleep(3000);
//
//		WebElement search = driver.findElement(By.name("Submit"));
//		search.click();
//
//		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
//		radiobutton.click();
//
//		WebElement continue1 = driver.findElement(By.id("continue"));
//		continue1.click();
//
//		WebElement firstname = driver.findElement(By.id("first_name"));
//		firstname.sendKeys("Nithiya");
//		Thread.sleep(3000);
//		
//		WebElement lastname = driver.findElement(By.id("last_name"));
//		lastname.sendKeys("Vinoth");
//		Thread.sleep(3000);
//		
//		WebElement address = driver.findElement(By.id("address"));
//		address.sendKeys("6/7, Gandhi st, Anna nagar");
//		Thread.sleep(3000);
//		
//		
//		WebElement credit_no = driver.findElement(By.id("cc_num"));
//		credit_no.sendKeys("1234567898893289");
//		Thread.sleep(3000);
//		
//		
//		WebElement card_type = driver.findElement(By.id("cc_type"));
//		Select n6= new Select (card_type);
//		n6.selectByVisibleText("Master Card");
//		Thread.sleep(3000);
//		
//		WebElement expiry = driver.findElement(By.xpath("//Select[@name='cc_exp_month']"));
//		Select n7= new Select (expiry);
//		n7.selectByVisibleText("October");
//		Thread.sleep(3000);
//		
//		WebElement expiry_year1 = driver.findElement(By.id("cc_exp_year"));
//		Select n8= new Select (expiry_year1);
//		n8.selectByValue("2022");
//		Thread.sleep(3000);
//		
//		WebElement cvv = driver.findElement(By.id("cc_cvv"));
//		cvv.sendKeys("421");
//		Thread.sleep(3000);
//		
//		
//		WebElement book = driver.findElement(By.id("book_now"));
//		book.click();
//		Thread.sleep(3000);
//		
//		WebElement logout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
//		logout.click();
//		Thread.sleep(3000);
//		

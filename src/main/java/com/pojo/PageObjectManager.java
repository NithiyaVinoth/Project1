package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	public static WebDriver driver;

	private Homepage_automation hp;
	private LoginPage lp;
private Search_Page sp;
	private Select_Page s1;
	private Booking_Page bp;
	
	private Logout_Page lop;
	
	public PageObjectManager(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public Homepage_automation getInstancehp() {

		hp = new Homepage_automation(driver);
		return hp;

	}

	public  LoginPage getInstancelp() {
		
		
		lp = new LoginPage (driver);
		return lp;

	}

	
	
	
	public Search_Page getInstancesp() {
		sp = new Search_Page(driver);
		
		return sp;
	}
	public Select_Page getInstancesl() {
		s1=new Select_Page(driver);
		
		return s1;
	}
	public Booking_Page getInstabp() {
		bp=new Booking_Page(driver);
		
		return bp;
	}
	public Logout_Page getInstalop() {
		lop=new Logout_Page(driver);
		
		return lop;
	}

}

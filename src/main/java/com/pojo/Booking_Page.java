package com.pojo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Booking_Page {

	
	
	
	
	
	
	
	public static WebDriver driver;
	@FindBy(name="first_name")
	private WebElement Fname;
	@FindBy(name="last_name")
	private WebElement Lname;
	@FindBy(name="address")
	private WebElement Addr;
	@FindBy(name="cc_num")
	private WebElement CCN;
	@FindBy(id="cc_type")
	private WebElement CCT;
	@FindBy(id="cc_exp_month")
	private WebElement Emon;
	@FindBy(id="cc_exp_year")
	private WebElement Eyear;
	@FindBy(id="cc_cvv")
	private WebElement CCV;
	@FindBy(name="book_now")
	private WebElement Booknow;
	
	public WebElement getBooknow() {
		return Booknow;
	}
	public WebElement getFname() {
		return Fname;
	}
	public WebElement getLname() {
		return Lname;
	}
	public WebElement getAddr() {
		return Addr;
	}
	public WebElement getCCN() {
		return CCN;
	}
	public WebElement getCCT() {
		return CCT;
	}
	public WebElement getEmon() {
		return Emon;
	}
	public WebElement getEyear() {
		return Eyear;
	}
	public WebElement getCCV() {
		return CCV;
	}
	public Booking_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		}

}

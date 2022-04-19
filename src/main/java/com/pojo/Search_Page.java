package com.pojo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
	
	
	
public static WebDriver driver;
	
	
	@FindBy(id="location")
	private WebElement place;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement Rtype;
	@FindBy(id="room_nos")
	private WebElement Rnos;
	@FindBy(id="datepick_in")
	private WebElement Din;
	@FindBy(id="datepick_out")
	private WebElement Dout;
	@FindBy(id="adult_room")
	private WebElement ARoom1;
	@FindBy(id="child_room")
	private WebElement CRoom;
	@FindBy(id="Submit")
	private WebElement Search ;
	
	public Search_Page(WebDriver driver2) {
		Search_Page.driver=driver2;
		PageFactory.initElements(driver, this);
		}
	
public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getPlace() {
		return place;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getRtype() {
		return Rtype;
	}


	public WebElement getRnos() {
		return Rnos;
	}


	public WebElement getDin() {
		return Din;
	}


	public WebElement getDout() {
		return Dout;
	}


	public WebElement getARoom1() {
		return ARoom1;
	}


	public WebElement getCRoom() {
		return CRoom;
	}


	public WebElement getSearch() {
		return Search;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

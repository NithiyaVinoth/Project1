package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.Base_Class;
import com.helper_file.FileReadManager;
import com.pojo.PageObjectManager;
import com.runner.Run_Adactin;


import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Run_Adactin.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	private String status;

	@cucumber.api.java.Before
	public void beforeHook(Scenario s) {
		String name = s.getName();
		System.out.println("Before Hooks:" + name);
	}

	@cucumber.api.java.After
	public void afterHook(Scenario s) {
		status = s.getStatus();
		System.out.println("After Hooks:" + status);
	}

	@Given("^user is launching the application$")
	public void user_is_launching_the_application() throws Throwable {
		geturl(FileReadManager.getInstance_FRM().getInstance_CR().getUrl());

	}

	@When("^user is entering the \"([^\"]*)\" in username field$")
	public void user_is_entering_the_in_username_field(String username) throws Throwable {
		inputText(pom.getInstancelp().getUname(), username);

	}

	@And("^user enters password in \"([^\"]*)\" field$")
	public void user_enters_password_in_field(String pass) throws Throwable {
		inputText(pom.getInstancelp().getPswd(), pass);

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		clickbutton(pom.getInstancelp().getLog());
		implicitwait();

	}

	@Given("^user is directed to search Hotel page$")
	public void user_is_directed_to_search_Hotel_page() throws Throwable {

	}

	@When("^user select the location from dropdown$")
	public void user_select_the_location_from_dropdown() throws Throwable {
		dropDown(pom.getInstancesp().getPlace(), "VisibleText", "London");
	}

	@And("^user select the hotel from dropdown$")
	public void user_select_the_hotel_from_dropdown() throws Throwable {
		dropDown(pom.getInstancesp().getHotel(), "VisibleText", "Hotel Hervey");

	}

	@And("^user select the room type from dropdown$")
	public void user_select_the_room_type_from_dropdown() throws Throwable {
		dropDown(pom.getInstancesp().getRtype(), "VisibleText", "Double");

	}

	@And("^user select the No of rooms from dropdown$")
	public void user_select_the_No_of_rooms_from_dropdown() throws Throwable {
		dropDown(pom.getInstancesp().getRnos(), "byValue", "2");

	}

	@And("^user select the Check-in-date from dropdown$")
	public void user_select_the_Check_in_date_from_dropdown() throws Throwable {
		inputText(pom.getInstancesp().getDin(), "25/3/2022");

	}

	@And("^user select the check-out date from dropdown$")
	public void user_select_the_check_out_date_from_dropdown() throws Throwable {

		inputText(pom.getInstancesp().getDout(), "26/3/2022");
	}

	@And("^user select the Adult room from dropdown$")
	public void user_select_the_Adult_room_from_dropdown() throws Throwable {
		dropDown(pom.getInstancesp().getARoom1(), "byValue", "3");

	}

	@And("^user select the Child room from dropdown$")
	public void user_select_the_Child_room_from_dropdown() throws Throwable {
		dropDown(pom.getInstancesp().getCRoom(), "byIndex", "3");

	}

	@Then("^user click the search button$")
	public void user_click_the_search_button() throws Throwable {
		clickbutton(pom.getInstancesp().getSearch());

	}

	@Given("^user is redirected to confirm hotel page$")
	public void user_is_redirected_to_confirm_hotel_page() throws Throwable {
		clickbutton(pom.getInstancesl().getSelect());

	}

	@When("^user click on radiobutton$")
	public void user_click_on_radiobutton() throws Throwable {

	}

	@Then("^user click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		clickbutton(pom.getInstancesl().getConti());
	}

	@Given("^user id redirected to card details payment page$")
	public void user_id_redirected_to_card_details_payment_page() throws Throwable {

	}

	@When("^user enters the First name in fisrtname field$")
	public void user_enters_the_First_name_in_fisrtname_field() throws Throwable {
		inputText(pom.getInstabp().getFname(), "Nithiya");

	}

	@And("^user enters the last name in lastname field$")
	public void user_enters_the_last_name_in_lastname_field() throws Throwable {
		inputText(pom.getInstabp().getLname(), "Vinoth");

	}

	@And("^user enter the billing address in billing address field$")
	public void user_enter_the_billing_address_in_billing_address_field() throws Throwable {
		inputText(pom.getInstabp().getAddr(), "No. 6/7 Gandhi st, Razack Garden, Arumbakkam, ch-106");

	}

	@And("^user enters the credit card no in the credit card field$")
	public void user_enters_the_credit_card_no_in_the_credit_card_field() throws Throwable {
		dropDown(pom.getInstabp().getCCT(), "ByValue", "VISA");

	}

	@And("^user enter the credit card type in the credit card type field$")
	public void user_enter_the_credit_card_type_in_the_credit_card_type_field() throws Throwable {
		inputText(pom.getInstabp().getCCN(), "2356493071823415");

	}

	@And("^user enter the expiry month in expiry month field$")
	public void user_enter_the_expiry_month_in_expiry_month_field() throws Throwable {
		dropDown(pom.getInstabp().getEmon(), "VisibleText", "May");

	}

	@And("^user enters the expiry year in expiry year field$")
	public void user_enters_the_expiry_year_in_expiry_year_field() throws Throwable {
		dropDown(pom.getInstabp().getEyear(), "ByValue", "2022");
	}

	@And("^user enter the CVV number in CVV field$")
	public void user_enter_the_CVV_number_in_CVV_field() throws Throwable {
		inputText(pom.getInstabp().getCCV(), "134");
	}

	@Then("^user click on book  now button$")
	public void user_click_on_book_now_button() throws Throwable {

		close();

	}

}

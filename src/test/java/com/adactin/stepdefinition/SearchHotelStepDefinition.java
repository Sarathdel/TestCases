package com.adactin.stepdefinition;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.SearchPage;
import com.framework.org.Baseclass.BaseClas;

import cucumber.api.java.en.*;

public class SearchHotelStepDefinition extends BaseClas {
	// SearchPage sp = new SearchPage(driver);
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user selecting location$")
	public void user_selecting_location() throws Throwable {
		dropdown(pom.getsh().getLocation(), "value", "Sydney");

	}

	@When("^user selecting hotel$")
	public void user_selecting_hotel() throws Throwable {
		dropdown(pom.getsh().getHotels(), "value", "Hotel Creek");
	}

	@When("^user selecting room type$")
	public void user_selecting_room_type() throws Throwable {
		dropdown(pom.getsh().getRoomtype(), "value", "Standard");
	}

	@When("^user selecting number of rooms$")
	public void user_selecting_number_of_rooms() throws Throwable {
		dropdown(pom.getsh().getRoomno(), "value", "2");
	}

	@When("^user selecting check in date$")
	public void user_selecting_check_in_date() throws Throwable {
		sendKeys(pom.getsh().getDate(), "30/03/2021");
	}

	@When("^user selecting check out date$")
	public void user_selecting_check_out_date() throws Throwable {
		sendKeys(pom.getsh().getDateout(), "31/03/2021");
	}

	@When("^user selecting adults per room$")
	public void user_selecting_adults_per_room() throws Throwable {
		dropdown(pom.getsh().getAdultperroom(), "value", "2");
	}

	@When("^user selecting children per room$")
	public void user_selecting_children_per_room() throws Throwable {
		dropdown(pom.getsh().getChildperroom(), "value", "1");
	}

	@Then("^user verify all credentials$")
	public void user_verify_all_credentials() throws Throwable {
		pom.getsh().getSubmit_button().click();
	}

}

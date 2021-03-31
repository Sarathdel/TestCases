package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.Runner;
import com.framework.org.Baseclass.BaseClas;

import cucumber.api.java.en.*;

public class SelectHotelStepDefinition extends BaseClas {
	public static WebDriver driver = Runner.driver;
	// SelectHotel sh = new SelectHotel(driver);
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user checks the options$")
	public void user_checks_the_options() throws Throwable {
		click(pom.SelectHotel().getCheck());
	}

	@When("^user clicks the radiobutton$")
	public void user_clicks_the_radiobutton() throws Throwable {
		click(pom.SelectHotel().getButton());
	}

	@Then("^user verify the hotel selected$")
	public void user_verify_the_hotel_selected() throws Throwable {
	}

}

package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookPage;
import com.adactin.runner.Runner;
import com.framework.org.Baseclass.BaseClas;

import cucumber.api.java.en.*;

public class BookHotelStepDefinition extends BaseClas {
	public static WebDriver driver = Runner.driver;
	// BookPage bp = new BookPage(driver);
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user enters valid first name$")
	public void user_enters_valid_first_name() throws Throwable {
		sendKeys(pom.BookPage().getFirstname(), "sarath");

	}

	@When("^user enters valid last name$")
	public void user_enters_valid_last_name() throws Throwable {
		sendKeys(pom.BookPage().getLastname(), "sarath");
	}

	@When("^user enters valid billing address$")
	public void user_enters_valid_billing_address() throws Throwable {
		sendKeys(pom.BookPage().getAddress(), "c-9, syndney, North Korea");
	}

	@When("^user enters valid credit card no$")
	public void user_enters_valid_credit_card_no() throws Throwable {
		sendKeys(pom.BookPage().getCcnum(), "1234567891234563");

	}

	@When("^user enters valid credit card type$")
	public void user_enters_valid_credit_card_type() throws Throwable {
		screenShot("ssh");
		dropdown(pom.BookPage().getCctype(), "value", "AMEX");
	}

	@When("^user enters valid expiry month$")
	public void user_enters_valid_expiry_month() throws Throwable {
		dropdown(pom.BookPage().getCcexpmonth(), "value", "1");
	}

	@When("^user enters valid expiry year$")
	public void user_enters_valid_expiry_year() throws Throwable {
		dropdown(pom.BookPage().getCcexpyear(), "value", "2022");
	}

	@When("^user enters valid cvv number$")
	public void user_enters_valid_cvv_number() throws Throwable {
		sendKeys(pom.BookPage().getCcvv(), "032");
	}

	@Then("^user verify the datas$")
	public void user_verify_the_datas() throws Throwable {
		click(pom.BookPage().getButton());
	}

}

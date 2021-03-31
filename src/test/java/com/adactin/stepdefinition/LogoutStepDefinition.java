package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.pom.LogoutPage;
import com.adactin.runner.Runner;
import com.framework.org.Baseclass.BaseClas;

import cucumber.api.java.en.*;

public class LogoutStepDefinition extends BaseClas {
	public static WebDriver driver = Runner.driver;
	// LogoutPage le = new LogoutPage(driver);
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user logout from the application$")
	public void user_logout_from_the_application() throws Throwable {
	}

	@When("^an action is performed$")
	public void an_action_is_performed() throws Throwable {
	}

	@Then("^something should be asserted$")
	public void something_should_be_asserted() throws Throwable {
		click(pom.LogoutPage().getLogout());
	}

}

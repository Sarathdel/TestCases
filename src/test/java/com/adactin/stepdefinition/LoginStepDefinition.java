package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.LoginPage;
import com.adactin.runner.Runner;
import com.framework.org.Baseclass.BaseClas;

import cucumber.api.java.en.*;

public class LoginStepDefinition extends BaseClas {
	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	// LoginPage lp = new LoginPage(driver);

	@Given("^user launch application$")
	public void user_launch_application() throws Throwable {
		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl("https://adactinhotelapp.com/");

	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		sendKeys(pom.getlp().getUsername(), arg1);

	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		sendKeys(pom.getlp().getPassword(), arg1);
	}

	@Then("^user verify valid username and valid password$")
	public void user_verify_valid_username_and_valid_password() throws Throwable {
		click(pom.getlp().getLogin_btn());

	}

}

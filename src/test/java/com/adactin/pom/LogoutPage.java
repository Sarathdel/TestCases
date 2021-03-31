package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	public static WebDriver driver;
	@FindBy(linkText = "Logout")
	private WebElement logout;

	public LogoutPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getLogout() {
		return logout;
	}

}

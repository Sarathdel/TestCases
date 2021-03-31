package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement roomno;

	@FindBy(id = "datepick_in")
	private WebElement date;

	@FindBy(id = "datepick_out")
	private WebElement dateout;

	@FindBy(id = "adult_room")
	private WebElement adultperroom;

	@FindBy(id = "child_room")
	private WebElement childperroom;

	@FindBy(id = "Submit")
	private WebElement submit_button;

	public SearchPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	public WebElement getChildperroom() {
		return childperroom;
	}

	public WebElement getSubmit_button() {
		return submit_button;
	}

}

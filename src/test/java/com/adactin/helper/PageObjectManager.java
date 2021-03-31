package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.BookPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.LogoutPage;
import com.adactin.pom.SearchPage;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	public static WebDriver driver;

	private LoginPage lp;
	private SearchPage sp;
	private SelectHotel sh;
	private BookPage bp;
	private LogoutPage le;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public LoginPage getlp() {
		lp = new LoginPage(driver);
		return lp;
	}

	public SearchPage getsh() {
		sp = new SearchPage(driver);
		return sp;
	}

	public SelectHotel SelectHotel() {
		sh = new SelectHotel(driver);
		return sh;
	}

	public BookPage BookPage() {
		bp = new BookPage(driver);
		return bp;

	}

	public LogoutPage LogoutPage() {
		le = new LogoutPage(driver);
		return le;
	}
}

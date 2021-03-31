package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws IOException {
		File f = new File(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowserName() {
		String browser = p.getProperty("browsername");
		System.out.println(browser);
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		System.out.println(url);
		return url;
	}

	public String wait1() {
		String wait = p.getProperty("wait");
		return wait;

	}

	public static void main(String[] args) throws IOException {
		ConfigurationReader c = new ConfigurationReader();
		c.getBrowserName();
		c.getUrl();

	}

}

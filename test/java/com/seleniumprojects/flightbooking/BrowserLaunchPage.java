package com.seleniumprojects.flightbooking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunchPage {

	public static WebDriver driver = null;
	public static String browser;
	public static Properties prop;

	public static Properties loadPropertyFile() throws FileNotFoundException, IOException {

		FileInputStream file = new FileInputStream("src\\main\\java\\com\\seleniumprojects\\flightbooking\\config.properties");
		prop = new Properties();
		prop.load(file);
		return prop;

	}


	public static WebDriver launchBrowser() throws IOException
	{
		loadPropertyFile();
		browser = prop.getProperty("browser");
		
		if(driver==null) {
		switch(browser) {
		case "chrome":
		
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			break;

		case "firefox":
		
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options1 = new FirefoxOptions();
			options1.addArguments("start-maximized");
			driver = new FirefoxDriver();
			break;
		}
		return driver;
	}
		else {
			return driver;
		}
	}


}

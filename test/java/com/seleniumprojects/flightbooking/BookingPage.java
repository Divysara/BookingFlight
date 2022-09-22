package com.seleniumprojects.flightbooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BookingPage extends BrowserLaunchPage  {

	

	static By oneWay = By.xpath("//div/input[@id='oneway']/following-sibling::ins");
	static By twoWay = By.xpath("//div/input[@id='roundtrip']/following-sibling::ins");
	static By from = By.id("from");
	static By to = By.id("to");
	static By searchBtn = By.id("btnbooking");
	static By fromDate = By.id("_depdateeu1");
	static By toDate = By.id("_retdateeu1");
	static By drop = By.id("ddladult1");
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void click(By locator) {
		getElement(locator).click();
	}

	public static void setText(By locator, String place) {
		getElement(locator).sendKeys(place);
	}
	
	public static void NoOfTravelers(String passengers)
	{
		WebElement dropdown = driver.findElement(drop);
		Select selectobj = new Select(dropdown);
		selectobj.selectByVisibleText(passengers);
	}
	
	public static void submit()
	{
		click(searchBtn);

	}
}

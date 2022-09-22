package com.seleniumprojects.flightbooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface CommonElements<T> {

	void assertMethod(String actual,String expected);
	T assertEnabled(WebElement ele);
}
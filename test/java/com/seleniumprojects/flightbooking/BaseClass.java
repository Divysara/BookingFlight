package com.seleniumprojects.flightbooking;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseClass implements CommonElements{

	
	
		
	
	public Boolean assertEnabled(WebElement ele) {
		return  ele.isSelected();
	}

	public void assertMethod(String actual, String expected) {
		assertEquals(actual, expected, "not true"); 
		
	}
	
	
	
}

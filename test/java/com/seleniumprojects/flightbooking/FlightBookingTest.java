/**
 * 
 */
package com.seleniumprojects.flightbooking;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightBookingTest extends BrowserLaunchPage {

	static BaseClass base = new BaseClass();
	@BeforeMethod
	public void callBroswer() throws Exception {

		driver = BrowserLaunchPage.launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ReadJsonData.readData();
	}

	@Test(priority=1)	
	public static void OneWayTrip() {

		Assert.assertFalse(base.assertEnabled(BookingPage.getElement(BookingPage.oneWay)));

		BookingPage.click(BookingPage.oneWay);
		BookingPage.setText(BookingPage.from,ReadJsonData.origin);
		BookingPage.setText(BookingPage.to,ReadJsonData.destination);
		BookingPage.setText(BookingPage.fromDate, ReadJsonData.startdate);
		BookingPage.NoOfTravelers(ReadJsonData.passengers);
		BookingPage.submit();

	}

	@Test(priority=2)
	public static void TwoWayTrip() {

		BookingPage.click(BookingPage.twoWay);
		BookingPage.setText(BookingPage.from,ReadJsonData.origin);
		BookingPage.setText(BookingPage.to,ReadJsonData.destination);
		BookingPage.setText(BookingPage.fromDate, ReadJsonData.startdate);
		BookingPage.setText(BookingPage.toDate, ReadJsonData.todate);
		BookingPage.NoOfTravelers(ReadJsonData.passengers);
		BookingPage.submit();
	}



	@AfterClass
	public void tearDown() {

		driver.close(); 
	}



}

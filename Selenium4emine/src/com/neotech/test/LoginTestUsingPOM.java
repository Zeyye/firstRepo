package com.neotech.test;

import com.neotech.pages.DashboardPage;
import com.neotech.pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods {

	public static void main(String[] args) {
		// https://hrm.neotechacademy.com/

		setUp();

		LoginPage login = new LoginPage();// At this point we are locating elements

		// sending username

		sendText(login.username, ConfigsReader.getProperty("username"));

		// sending the password

		sendText(login.password, ConfigsReader.getProperty("password"));

		login.loginButton.click();

		wait(5);
		// Validate login by using logo
		DashboardPage db = new DashboardPage();

		if (db.logo.isDisplayed()) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!");
		}

		tearDown();
	}

}

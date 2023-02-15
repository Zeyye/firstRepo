package com.neotech.lesson15;

import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		LoginPageUsingFactory loginPage = new LoginPageUsingFactory();

		sendText(loginPage.username, ConfigsReader.getProperty("username"));

		wait(2);

		click(loginPage.loginBtn);

		String expectedText = "Password cannot ne empty";

		String actualText =

				tearDown();

	}

}

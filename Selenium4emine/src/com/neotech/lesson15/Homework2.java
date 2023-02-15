package com.neotech.lesson15;

import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		LoginPageUsingFactory loginPage = new LoginPageUsingFactory();

		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		sendText(loginPage.password, "Wrong Password");

		wait(2);

		click(loginPage.loginBtn);

		wait(2);

		if (loginPage.invalidPassword)

			tearDown();
	}

}

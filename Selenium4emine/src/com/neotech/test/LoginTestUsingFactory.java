package com.neotech.test;

import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingFactory extends CommonMethods {

	public static void main(String[] args) {

		// https://hrm.neotechacademy.com/

		setUp();
		// we are not locating the elements
		// we are just telling how the element will be located
		LoginPageUsingFactory login = new LoginPageUsingFactory();

		sendText(login.username, ConfigsReader.getProperty("username"));

		sendText(login.password, ConfigsReader.getProperty("password"));

		login.loginBtn.click();

		wait(2);

		tearDown();

	}

}

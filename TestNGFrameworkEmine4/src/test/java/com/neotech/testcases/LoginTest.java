package com.neotech.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	@Test(groups = { "smoke", "regression" })
	public void validLogin() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();

		// send username
		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(1);
		// send password
		sendText(login.password, ConfigsReader.getProperty("password"));
		wait(1);
		// click on login
		// you can use jsClick() as well
		click(login.logInButton);
		wait(2);

		// verify username
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();

		// assertion
		Assert.assertEquals(actual, expected, "The account name does NOT match!!!");
	}

	@Test(groups = { "regression" })
	public void emptyPasswordLogin() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(2);
		click(login.logInButton);
		wait(2);
		String expected = "Password cannot be empty";
		String actual = login.passwordError.getText();

		Assert.assertEquals(actual, expected, "Error message does not match!");

	}

	@Test(groups = "regression")

	public void invalidPassword() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(2);
		sendText(login.password, ("my husband is coming!"));
		wait(1);

		click(login.logInButton);
		wait(1);

		String expectedtxt = "Invalid credentials";

		String actualtext = login.invalidMessage.getText();

		Assert.assertEquals(actualtext, expectedtxt, "error");
	}

}

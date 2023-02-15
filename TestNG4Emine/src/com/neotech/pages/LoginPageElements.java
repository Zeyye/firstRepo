package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class LoginPageElements extends CommonMethods {

	@FindBy(id = "txtUserName")

	public WebElement username;

	@FindBy(id = "txtPassword")

	public WebElement password;

	@FindBy(id = "//button[@type='submit']")

	public WebElement logInButton;

	public LoginPageElements() {
		PageFactory.initElements(null, logInButton);
	}

}

package com.neotech.lesson24;

public class WebDriverTest {
	public static void main(String[] args) {

		// Run time polymorphism
		// Method overriding
		// The driver will open the browser depending
		// on the object that has been created

		WebDriver driver = new FireFox();
		driver.openBrowser();

		// Go to facebook
		// Enter password
		// Click the login button

	}

}

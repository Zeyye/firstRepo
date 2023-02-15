package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
	public static void main(String[] args) throws InterruptedException {

		/*
		 * HW2: Opening Page on Firefox Browser Open Firefox browser Navigate to
		 * “https://www.redfin.com/” Verify that you have navigated to
		 * (https://www.redfin.com/) End the Session (close the browser).
		 */
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https:www.redfin.com");

		String url = driver.getCurrentUrl();
		System.out.println("Current url is-->" + url);

		if (driver.getCurrentUrl().equalsIgnoreCase(url)) {
			System.out.println("You are on the right spot!");
		} else {
			System.out.println("I am sorry try again!");
		}
		Thread.sleep(3000);
		driver.quit();

	}

}

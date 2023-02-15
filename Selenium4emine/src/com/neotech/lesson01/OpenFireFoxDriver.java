package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxDriver {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.com/");

		String actualUrl = driver.getCurrentUrl();

		String expectedUrl = "https://www.amazon.com/";

		if (actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Title = " + driver.getTitle());
		} else {
			System.out.println("Url is wrong!");

		}

		Thread.sleep(3000);
		driver.close();

	}

}

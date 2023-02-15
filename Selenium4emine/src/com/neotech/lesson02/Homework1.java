package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	public static void main(String[] args) throws InterruptedException {

		/*
		 * HW1: Amazon Page Title Verification: Open chrome browser Go to
		 * “https://www.amazon.com/” Verify Title “Amazon.com: Online Shopping for
		 * Electronics, Apparel, Computers, Books, DVDs & more” is displayed End the
		 * Session (close the browser).
		 */

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		String url = driver.getCurrentUrl();
		System.out.println("url is--> " + url);

		String title = driver.getTitle();
		System.out.println("title is-->" + title);

		if (title.equalsIgnoreCase(
				"Online Shopping for\r\n" + "		 * Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("The expected title is different than " + title);
		} else {
			System.out.println("Url is wrong!");
		}

		Thread.sleep(2000);

		driver.close();

	}

}

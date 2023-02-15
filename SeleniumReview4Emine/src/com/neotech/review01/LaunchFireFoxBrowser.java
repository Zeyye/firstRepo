package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFireFoxBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

		// WebDriver driver = new FirefoxDriver();

		String url = "";
		driver.get(url);

	}

}

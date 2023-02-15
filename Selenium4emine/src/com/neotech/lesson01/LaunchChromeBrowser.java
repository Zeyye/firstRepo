package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		String url = driver.getCurrentUrl();
		System.out.println("url is--> " + url);

		String title = driver.getTitle();
		System.out.println("title is-->" + title);

		Thread.sleep(2000);

		driver.close();

	}

}

package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://www.instagram.com";
		// driver.get(url);-->will wait for page element to loaded

		driver.navigate().to(url);// -->will not wait page element to loaded woll keep the history

		Thread.sleep(1000);

		driver.manage().window().fullscreen();

		driver.manage().window().minimize();

		Thread.sleep(1000);

		driver.navigate().to("https://www.fakenews.com");

	}

}

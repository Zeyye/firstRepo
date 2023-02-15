package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public final static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// go to this url
		driver.get(url);

		driver.findElement(By.cssSelector("#email")).sendKeys("john123");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("john123");

		driver.findElement(By.cssSelector("button[name='login']")).click();

		Thread.sleep(3000);

		driver.quit();

	}

}

package com.neotech.lesson06;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends BaseClass {

	/*
	 * HW1: Orange HRM Application Login: Open Chrome browser Go to
	 * https://hrm.neotechacademy.com/ Enter valid username and password Click on
	 * login button Then verify that "span with id account-name" has the text
	 * "Jacqueline White". Quit the browser
	 */

	public static void main(String[] args) throws InterruptedException {

		setUp();// 1-declaring driver location
				// 2-Initialize driver
				// 3-Go to the URL
		String username = ConfigsReader.getProperty("username");
		String password = ConfigsReader.getProperty("password");

		System.out.println(username + "  --" + password);

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Neotech@123");
		driver.findElement(By.xpath("//*[@id=\"divLogin\"]/div[2]/div/form/div[3]/button")).click();

		Thread.sleep(3000);

		String title = driver.getTitle();
		System.out.println("title -> " + title);
		Thread.sleep(3000);

		tearDown();

	}
}

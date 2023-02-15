package com.neotech.interviewpreparation;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class example1 extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		sendText(driver.findElement(By.id("tUsername")), ConfigsReader.getProperty("username"));

		sendText(driver.findElement(By.id("tPassword")), ConfigsReader.getProperty("password"));

		click(driver.findElement(By.xpath("//input[@type='submit']")));

		String buttonText = driver.findElement(By.id("Header1_lblSIS")).getText();

		System.out.println(buttonText);

		String innerText = driver.findElement(By.cssSelector("#Header1_lblSIS")).getAttribute("type");

		System.out.println(innerText);

		wait(2);

		tearDown();

	}

}

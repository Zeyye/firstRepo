package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class LoginWithAdvancedXPath extends CommonMethods {

	public static void main(String[] args) {

		// using parent child relationship in Xpath

		setUp();

		WebElement username = driver.findElement(By.xpath("//form[@class='form-body']/div[1]/input"));

		tearDown();
	}

}

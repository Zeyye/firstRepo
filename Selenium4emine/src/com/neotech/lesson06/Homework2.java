package com.neotech.lesson06;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends BaseClass {
	public static void main(String[] args) {

		setUp();

		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));

		tearDown();

	}

}

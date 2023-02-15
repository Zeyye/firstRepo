package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DropDownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// http://sis.neotechacademy.com:9000/Test/

		setUp();

		driver.findElement(By.id("tUsername")).sendKeys(ConfigsReader.getProperty("username"));

		driver.findElement(By.id("tPassword")).sendKeys(ConfigsReader.getProperty("password"));

		Thread.sleep(3000);

		// how

		WebElement dd = driver.findElement(By.id("dAcademicYear_list"));

		Select selDD = new Select(dd);
		// 1 ST WAY TO SELECT
		selDD.selectByIndex(0);

		// 2ND WAT TO SELECT

		tearDown();

	}

}

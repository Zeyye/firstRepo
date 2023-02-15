package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// http://uitestpractice.com/Students/Switchto

		setUp();

		driver.findElement(By.id("alert")).click();

		Thread.sleep(3000);

		Alert simpleAlert = driver.switchTo().alert();

		String alertText = simpleAlert.getText();

		System.out.println(alertText);

		Thread.sleep(2000);

		simpleAlert.accept();

		driver.findElement(By.id("confirm")).click();
		// we are trying to switch the focus of the driver to the alert
		Alert confirm = driver.switchTo().alert();

		String confirmationText = confirm.getText();

		System.out.println(confirmationText);

		confirm.dismiss();

		tearDown();

	}

}

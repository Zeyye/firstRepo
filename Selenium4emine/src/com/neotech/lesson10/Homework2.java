package com.neotech.lesson10;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

//		TC: Delete Orders
//
//		1) Open chrome browser
//		2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		3) Login to the application
//		4) Click on the checkbox of all orders with product FamilyAlbum
//		5) Delete Selected orders
//		6) Verify the orders have been deleted
//		7) Quit the browser

		setUp();

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Thread.sleep(2000);

		tearDown();
//		
	}
}

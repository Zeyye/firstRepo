package com.neotech.lesson04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends CommonMethods {

	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}

	@AfterMethod

	public void quitBrowser() {
		tearDown();
	}

	@Test(dataProvider = "getData")

	public void test(String firstName, String lastName, String password, String userName) {

		System.out.println(firstName + " " + lastName + " " + password + " " + userName);

		// login
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));

		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

		click(driver.findElement(By.xpath("//button[@type='submit']")));

		// navigate to PIM menu
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();

		wait(2);

		// enter new employee data

		sendText(driver.findElement(By.id("first-name-box")), firstName);

		sendText(driver.findElement(By.id("last-name-box")), lastName);

		wait(1);

		// get employeeID for verification
		String empId = driver.findElement(By.id("employeeId")).getAttribute("value");

		WebElement dropDown = driver.findElement(By.id("location"));

		Select sel = new Select(dropDown);

		sel.selectByValue("string:19");

		wait(1);

		//
		jsClick(driver.findElement(By.id("hasLoginDetails")));

		wait(1);

		// provide the username and password for the new employee
		sendText(driver.findElement(By.id("username")), userName);

		sendText(driver.findElement(By.id("password")), password);

		sendText(driver.findElement(By.id("confirmPassword")), password);

		wait(1);

		click(driver.findElement(By.id("modal-save-button")));

		waitForVisibility(driver.findElement(By.id("pimPersonalDetailsForm")));

		String actualId = driver.findElement(By.id("employeeId")).getAttribute("value");

		Assert.assertEquals(actualId, empId, "EmployeeId's do not match!");

		// Take screenShot

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(source, new File("screenshot/" + firstName + " " + lastName + " " + ".png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@DataProvider(name = "getData")
	public Object[][] createData() {
		Object[][] data = { // { "ali", "baba", "donuld123", "al" }, //{ "Huss", "hus123", "willl", "mill"
							// },
				// { "emine", "emine123", "emin", "lol" },
				{ "ayse", "ayse12", "ayse@2", "ala" } };
		return data;

	}
}

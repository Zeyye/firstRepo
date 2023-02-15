package com.neotech.review04;

import org.openqa.selenium.TakesScreenshot;

import com.neotech.utils.CommonMethods;

public class ScreenshotExample extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		wait(2);

		TakesScreenshot ts = TakesScreenshot(driver);

		tearDown();

	}

}

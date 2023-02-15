package com.neotech.lesson07;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass {

//	TC 1: Frame verification
//	Open chrome browser
//	Go to https://demoqa.com/frames
//	Verify the headers in both frames
//	Quit the browser

	public static void main(String[] args) throws InterruptedException {
		setUp();

		Thread.sleep(1000);

		// Be careful! There may be a lot of iFrames
		// driver.switchTo().frame(0);

		driver.switchTo().frame("frame1");
		String frame1Text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("The text in the first frame -> " + frame1Text);

		// This is crucial
		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame2");
		// Locating an element inside the second frame
		String frame2Text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("The text in the second frame -> " + frame2Text);

		tearDown();
	}
}

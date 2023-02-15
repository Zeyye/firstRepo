package com.neotech.review03;

import static com.neotech.utils.BaseClass.driver;

import com.neotech.utils.BaseClass;

public class HandlingWindows extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		setUp();

		String windowID1 = driver.getWindowsHandle();

		System.out.println(windowID1);

		Thread.sleep(2000);

		tearDown();

	}

}

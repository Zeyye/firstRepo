package com.neotech.lesson26;

public interface WebD {

	/*
	 * Homework 1: Create a WebDriver Interface that will have the following
	 * unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(),
	 * findElement().
	 * 
	 * Create another interface named Camera that will have the method:
	 * takePicture(); Create 2 classes that implements WebDriver and Camera
	 * interfaces: ChromeDriver and FirefoxDriver.
	 */

	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();

}

interface Camera {

	void takePicture();
}

class CromeDriver implements WebD, Camera {

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub

	}

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub

	}
}

class FireFoxd implements WebD, Camera {
	String driver = "Firefox";

	@Override
	public void takePicture() {

	}

	@Override
	public void openBrowser() {

	}

	@Override
	public void closeBrowser() {

	}

	@Override
	public void maximizeWindow() {

	}

	@Override
	public void findElement() {

	}
}

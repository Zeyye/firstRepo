package com.neotech.lesson24;

public class WebDriver {

	public void openBrowser() {
		System.out.println("Open browser!");
	}
}

class ChromeDriver extends WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Open chrome browser!");
	}

}

class FireFox extends WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Open Fire Fox browser!");
	}

}

class InternetExplorer extends WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Open Internet Explorer browser!");
	}

}

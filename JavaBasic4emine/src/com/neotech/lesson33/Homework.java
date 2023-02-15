package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Homework {
	public static void main(String[] args) throws IOException {
		/*
		 * Homework 1: Create a PROPERTY file to store following configurations:
		 * browser= url= username= password=
		 */

		String filePath = "/Users/emine/eclipse-workspace/JavaBasic4emine/homework1.properties";

		System.out.println(filePath);

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();
		prop.load(fis);
		String userName = prop.getProperty("userName");

		System.out.println(userName);

		String password = prop.getProperty("password");
		System.out.println(password);

		String url = prop.getProperty("url");

		System.out.println(url);

		String browser = prop.getProperty("browser");

		System.out.println(browser);

	}

}

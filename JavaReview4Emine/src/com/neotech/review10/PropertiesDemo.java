package com.neotech.review10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {

		// String
		// path="/Users/emine/eclipse-workspace/JavaReview4Emine"+"/extra/demo.properties";
		// created the full path to the file
		String path = System.getProperty("user.dir");
		System.out.println(path);

		String filePath = path + "/extra/demo.properties";
		System.out.println(filePath);

		FileInputStream fis = new FileInputStream(filePath);// this will help to read from the file

		Properties prop = new Properties();

		prop.load(fis); // will help me from the file to the proper map

		System.out.println(prop);

		// 1.way

		Object fn = prop.get("FirstName");
		System.out.println(fn);

		// 2.way and correct way of doing same

		String school = prop.getProperty("School");
		System.out.println(school);

		String age = prop.getProperty("Age");
		// Add more key-->value pairs
		prop.setProperty("SSN", "12345678");// this is adding new info

		prop.setProperty("Age", "60");// --->this is reassigning
		System.out.println(age);

		System.out.println(prop);

		// now let us save into a new file

		// The to the new file

		String newPath = System.getProperty("user.dir") + "/extra/NewFile.txt";

		FileOutputStream fos = new FileOutputStream(newPath);

		System.out.println(prop);
		prop.store(fos, newPath);

	}

}

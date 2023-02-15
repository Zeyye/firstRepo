package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {

		// where is my .properties file?
		// locate your .properties file
		String filePath = "/Users/emine/eclipse-workspace/JavaBasic4emine/configs/config.properties";// ------->absolute
		// path/path of the file

		// second step create an object of FileInputStream

		FileInputStream fis = new FileInputStream(filePath);

		// 3.step is to handle .properties file ;we need to use a properties jaava class

		Properties prop = new Properties();

		// 4.step is load everything file with load()method

		prop.load(fis);

		String name = prop.getProperty("name");

		System.out.println(name);

		Set<Object> keys = prop.keySet();

		Collection<Object> values = prop.values();

		String os = System.getProperty("user.name");// to find the user name from the system

		System.out.println(os);

	}

}

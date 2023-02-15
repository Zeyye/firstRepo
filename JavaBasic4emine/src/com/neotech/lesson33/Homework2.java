package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Homework2 {
	public static void main(String[] args) throws IOException {

		// 1.create a path to the file

		// to avoid file location issues
		String projectPath = System.getProperty("user.dir");

		System.out.println(projectPath);

		// String path =
		// "Users/emine/eclipse-workspace/JavaBasic4emine/example.properties";/we could
		// use this one but
		// to avoid location issues we need to use this dynamic path

		String fullPath = projectPath + "/configs/Homework1.properties";
		System.out.println(fullPath);

		// 2 create an object to read the file

		FileInputStream fis = new FileInputStream(fullPath);

		// load the data from stream

		Properties p = new Properties();

		p.load(fis);

		System.out.println(p);

	}

}

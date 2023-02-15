package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IntroToExceptions {
	public static void main(String[] args) throws FileNotFoundException {

		int a = 10;
		int b = 0;

		// System.out.println(a / b);//arithmeticException-->division by ZERO

		System.out.println("test");

		int[] arr = { 2, 3, 4 };

		// System.out.println(arr[5]);-->ArrayIndexOutOfBound
		String str = "";
		// System.out.println(str.lenght());

		String filePath = "";

		FileInputStream fis = new FileInputStream(filePath);

		NullPointerException npe = new NullPointerException();

		throw (npe);

	}

}

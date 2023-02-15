package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlinException {
	public static void main(String[] args) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			System.out.println("caught InterruptedException ");

		}
		System.out.println("Continue with other code ");

		String path = "";

		try {
			FileInputStream fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {

			System.out.println("Caught a FileNotFoundException");

		}
		System.out.println("Let's add another try and catch block");

		int a = 5;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("Caught ArithmeticException!!!");
		}

	}

}

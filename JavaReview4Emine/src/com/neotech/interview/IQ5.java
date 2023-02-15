package com.neotech.interview;

public class IQ5 {
	public static void main(String[] args) {

		String str = "Neotech";

		System.out.println(reverseOne(str));
		reverseOne(str);

		System.out.println(reverseTwo(str));

	}

	public static String reverseOne(String str) {
		// 1st way char at method
		// starting from the last character to the first one
		String reversedStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);// get the char from str using index i
		}
		return reversedStr;
	}

	public static String reverseTwo(String str) {
		// 2nd way using toCharArray()
		String reversedStr = "";
		char[] arrac = str.toCharArray();
		for (int i = arrac.length - 1; i >= 0; i--) {
			reversedStr += arrac[i];// get the char from chararray using index i
		}
		return reversedStr;

	}

}

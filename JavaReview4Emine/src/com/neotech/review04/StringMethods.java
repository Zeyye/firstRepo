package com.neotech.review04;

public class StringMethods {
	public static void main(String[] args) {

		String str = "Merhaba";

		str.length();

		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);

		boolean result = str.equals("Merhaba");
		System.out.println(result);

		System.out.println(str.equalsIgnoreCase("Merhaba"));

	}

}

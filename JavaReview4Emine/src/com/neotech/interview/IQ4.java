package com.neotech.interview;

public class IQ4 {

	public static void main(String[] args) {

		String str = "igiugug && ougouo87565764JGG";

		str = str.replaceAll("[A-Za-z]", "");
		System.out.println(str);

		System.out.println("Number of alpha characters= " + str.length());

		String longStr = "bye bye Java hello Selenium";

		String[] words = longStr.split(" ");
		System.out.println("Number of words in a string " + words.length);// this length is property of array

		for (String el : words) {
			System.out.print(el);
		}

	}

}

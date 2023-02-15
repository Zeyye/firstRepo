package com.neotech.review05;

public class Task1 {

	public static void main(String[] args) {

		// Task: Print the whole array, but replace 'a' with 'e'
		// Don't use replace/replaceAll method
		String longStr = "I am very happy today, because today is not Monday";

		char[] charArr = longStr.toCharArray();

		System.out.println(charArr.length);
		System.out.println(longStr);
		for (char el : charArr) {

			if (el == 'a') {
				System.out.print('e');

			} else {
				System.out.print(el);
			}

		}

	}

}

package com.neotech.interview;

public class IQ6 {
	public static void main(String[] args) {

		String original = "emine";

		// 1st way reversing the string

		String reversed = IQ5.reverseOne(original);

		System.out.println(original + "<-->" + reversed);

		if (original.equalsIgnoreCase(reversed)) {

			System.out.println(original + " is a Palindrom");
		} else {
			System.out.println(original + " is NOT a palindrom");
		}

		System.out.println("-----------------------------");

		// 2nd way cheking for symetry

		boolean palindrom = true;

		int lastIndex = original.length() - 1;

		for (int i = 0; i < original.length(); i++) {
			if (original.charAt(i) != original.charAt(lastIndex - i)) {
				palindrom = false;
				break;
			}
		}
		System.out.println(palindrom);
	}

}

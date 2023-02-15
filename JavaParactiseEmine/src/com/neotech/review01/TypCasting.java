package com.neotech.review01;

public class TypCasting {

	public static void main(String[] args) {

		// byte <short <int <long <float <double

		int intNumber = 50;

		double doubleNumber = intNumber;

		System.out.println(intNumber);

		System.out.println(doubleNumber);
		// re-assigning
		intNumber = 7890;

		byte byteNumber = (byte) intNumber;

		System.out.println(byteNumber);

	}

}

package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {

		// byte<short<int<long<float<double<

		int intNumber = 50;
		double doubleNumber = (double) intNumber;
		// widening/implicit/automatically
		System.out.println(intNumber);
		System.out.println(doubleNumber);

		// narrowing/explicit/manually
		byte byteNumber = (byte) intNumber;// you may loose data!

		System.out.println(byteNumber);

		intNumber = 870;
		byte b2 = (byte) intNumber;
		//we will data!!!
		System.out.println(b2);
		
		byte b3=90;
		int i3=b3;
		
		System.out.println(i3);
	}

}

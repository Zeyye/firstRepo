package com.neotech.lesson24;

public class OverloadingMinMethod {

	private static OverloadingMinMethod OverloadingMainMethod;

	// can we overload main method? YES we can overload the main method.They are all
	// main methods we are just overloading

	public static void main(int[] args) {

		System.out.println("Main method with int array parameter");
	}

	private static void main(String arg1, String arg2) {
		System.out.println("Main method with two arguments!");
	}

	public void main(int arg1, int arg2) {
		System.out.println("Main method with two integer parameters");
	}

	public static void main(String[] Jenn) {
		System.out.println("Jenn");// Java will otomaticlly lookinhg for main method has String array to run

		OverloadingMainMethod.main(8, 9);

		main("Hi", "Bye");

	}

}

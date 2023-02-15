package com.neotech.lesson21;

public class Constructors {

	Constructors() {
		this(6, 7);

		System.out.println("Hi");
	}

	Constructors(int x) {
		this(6, 7);
		System.out.println(" emine");
	}

	Constructors(int x, int b) {
		System.out.println("How are uou?");
	}

	public static void main(String[] args) {

		Constructors str1 = new Constructors();

	}

}

package com.neotech.lesson21;

public class Homework2 {

	/*
	 * Homework 2: Write a program that will have 4 different access levels of
	 * constructors and create 3 objects of this class: 1 -inside same class; 2-from
	 * outside the class; 3-from different class inside different package and
	 * observe result.
	 */
	String name, state;
	int age;

	Homework2() {
		System.out.println("no parameters!");
	}

	private Homework2(String name) {

	}

	protected Homework2(String name, int age) {

	}

	public Homework2(String name, String state, int age) {

	}

	public static void main(String[] args) {

		Homework2 obj1 = new Homework2("Ayse");
		Homework2 obj2 = new Homework2("Ayse", 23);
		Homework2 obj3 = new Homework2("Ayse", "Virginia", 23);
		// three of them are visible inside the same class and same package

	}

}

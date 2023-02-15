package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {
	/*
	 * Homework 1: Create a Set collection in which you need to add names of the
	 * countries. In this set we want all objects to be sorted in alphabetical
	 * order. Using 2 different ways retrieve all elements from set.
	 */

	public static void main(String[] args) {

		Set<String> countries = new TreeSet<>();

		countries.add("Turkiye");
		countries.add("Iran");
		countries.add("Tunisia");
		countries.add("Chad");
		countries.add("Usa");
		countries.add("Germany");

		System.out.println(countries);

		System.out.println("==========================");

		for (String country : countries) {
			System.out.print(country + " ");
		}

		System.out.println("============================");

		// iterator

		Iterator<String> it = countries.iterator();
		while (it.hasNext()) {
			String country = it.next();
			System.out.println(country);
		}

	}

}

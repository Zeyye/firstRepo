package com.neotech.lesson29;

import java.util.ArrayList;

public class Homework1 {
	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();

		drinks.add("milk");
		drinks.add("coffee");
		drinks.add("ayran");
		drinks.add("beer");
		drinks.add("tea");
		drinks.add(1, "water");
		drinks.add(3, "coffee");

		// using for each

		for (String drink : drinks) {// check if drink contains letter a or e
			if (drink.contains("a") || drinks.contains("e")) {
				drink = drink.replaceAll(drink, "water");
			}
			System.out.print(drink + " ");
		}
		System.out.println();
		System.out.print(drinks);

		System.out.println();
		System.out.println("+================+");

		// indexed for loop

		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);

	}

}

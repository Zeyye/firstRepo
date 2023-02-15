package com.neotech.review08;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {

		List<String> asia = new LinkedList<>();// Upcasting

		asia.add("Japan");
		asia.add("Vietnam");
		asia.add("Turkey");
		asia.add(0, "Camboadia");
		asia.add("Taiwan");
		asia.add("Japan");
		asia.add("Taiwan");

		List<String> asia2 = new LinkedList<>();// for every country in asia I will get tehm one by one
		for (String country : asia) {
			if (asia2.contains(country)) {
				System.out.println("The country " + country + " exits in the list");

			} else {
				asia2.add(country);
			}

		}
		System.out.println(asia2);

		List<String> asia3 = new LinkedList<>();
		Iterator<String> iter = asia.iterator();

	}
}

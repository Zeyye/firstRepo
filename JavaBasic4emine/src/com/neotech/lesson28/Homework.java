package com.neotech.lesson28;

import java.util.ArrayList;

public class Homework {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Arin");
		names.add("Oguzhan");
		names.add(1, "Sid");
		names.add("Emine");
		names.add("Baris");

		// is this list empty?
		System.out.println("Is the arrayList empty? " + names.isEmpty());

		// does it contain Arin?

		System.out.println("Does it contain Arin? " + names.contains("Arin"));

		System.out.println("The size of the aratList is: " + names.size());

		System.out.println(names);

		for (String name : names) {
			System.out.print(name + "-");
		}

	}

}

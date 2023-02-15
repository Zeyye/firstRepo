package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> breakfast = new HashSet<>();

		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("eggs");
		breakfast.add("tea");
		breakfast.add("coffee");

		int size = breakfast.size();
		System.out.println("The size of the set is : " + size);// we do not count duplicates.

		// get all elements using for each loop

		System.out.println(breakfast);

		for (String item : breakfast) {
			System.out.print(item + " ");
		}
		System.out.println();

		// by using iterator

		Iterator<String> it = breakfast.iterator();

		while (it.hasNext()) {

		}

	}

}

package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	public static void main(String[] args) {

		// Create an arrayList of words. Remove every word that
		// ends with "e". Use iterator

		ArrayList<String> words = new ArrayList<>();

		words.add("Java");
		words.add("Pyton");
		words.add("Elion");
		words.add("Sabah");
		words.add("Shane");
		System.out.println(words);
		Iterator<String> it = words.iterator();

		while (it.hasNext()) {
			String element = it.next();
			System.out.print(element + " ");

			if (element.endsWith("e")) {
				it.remove();
			}
		}
		System.out.println();
		System.out.println(words);
	}

}

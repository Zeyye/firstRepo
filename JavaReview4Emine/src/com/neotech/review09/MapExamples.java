package com.neotech.review09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExamples {

	public static void main(String[] args) {

		// Map
		// HashMap | LinkedHashMap | TreeMap |HashTable

		Map<Integer, String> phoneBook = new HashMap<>();

		phoneBook.put(123456, "James Book");
		phoneBook.put(76767676, "Julia Roberts");
		phoneBook.put(768879, "Donald Trump");
		phoneBook.put(1111111, "Obama");
		phoneBook.put(99999999, "Ronaldo");

		phoneBook.replace(111111001, "Ahmet");
		System.out.println(phoneBook);

		// Another way is to replace

		phoneBook.put(1234566, "Sedat");

		System.out.println(phoneBook);

		// Map is one directional from the key to the value

		String name = phoneBook.get(768879);
		System.out.println(" is calling " + name);// getting the value by using key

		name = phoneBook.get(999);

		System.out.println("Who is calling " + name);

		boolean containKey = phoneBook.containsKey(666);
		System.out.println("is my phonebook conatains " + containKey);

		boolean containsV = phoneBook.containsValue("Obama");
		System.out.println(containsV);

		phoneBook.remove(1234566);// will remove the pair or the entry from my map

		System.out.println(phoneBook);

		System.out.println("the size is-->" + phoneBook.size());

		System.out.println("===========phoneBook.keySet====================");

		// Let's get all the keys and store them into a set

		Set<Integer> numbers = phoneBook.keySet();

		System.out.println(numbers);

		Iterator<Integer> itNumbers = numbers.iterator();

		while (itNumbers.hasNext()) {
			itNumbers.hasNext();

			String nam = phoneBook.get(1234566);

			System.out.println(nam);
		}

		phoneBook.values();

	}

}

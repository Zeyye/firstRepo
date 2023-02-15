package com.neotech.lesson31;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Create a Map from array of cities that will sort keys in alphabetical order.
		 * As a key store the name of the city and as a value store the length of the
		 * city. (Example: Paris=5, Moscow=6, Washington DC=13 etc..). - If any city
		 * name is more than 7 characters remove that city.
		 */

		// array of cities
		String[] cities = { "Paris", "Moscow", "Toronto", "Milano", "Denver", "Crimea" };

		// Create a map with city as the key, and length of city as the value
		Map<String, Integer> map = new TreeMap<>();

		// do not populate the map manually
		// map.put("Paris", 5);
		for (String city : cities) {
			map.put(city, city.length());
		}

		System.out.println(map);

		// using iterator

		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> e = it.next();

			if (e.getValue() >= 7) {
				it.remove();
			}
		}

		// using for loop
		for (Entry<String, Integer> entry : map.entrySet()) {
			// we could get the key and value
			String key = entry.getKey();
			int value = entry.getValue();

			if (value > 7) {
				map.remove(key);
			}
		}

	}

}

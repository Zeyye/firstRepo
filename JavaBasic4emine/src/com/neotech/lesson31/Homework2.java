package com.neotech.lesson31;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {
	public static void main(String[] args) {

		Map<String, String> countries = new TreeMap<>();

		countries.putIfAbsent("France", "Paris");
		countries.put("Kosova", "Prishtina");
		countries.put("Turkiye", "Ankara");
		countries.put("Albania", "Tirana");
		countries.put("USA", "DC");
		countries.put("Italy", "Rome");
		System.out.println(countries);

		System.out.println("Does the map contains Albania?");

		System.out.println(countries.containsKey("Albania"));

		System.out.println("Does the map contain Prishtina");

		System.out.println(countries.containsValue("Prishtina"));

		Set<String> keys = countries.keySet();

		System.out.println(keys);

		for (String country : keys) {
			System.out.print(country + " ");
		}
		System.out.println();

		Collection<String> capitals = countries.values();

		Iterator<String> it = capitals.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

	}

}

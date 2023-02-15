package com.neotech.lesson30;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
		// TreeMap will order the entries (pairs)malphabetically according to
		Map<String, Integer> groceries = new TreeMap<>();

		groceries.put("Milk", 2);
		groceries.put("Bread", 3);
		groceries.put("Olive Oil", 3);
		// groceries.put(3, "Olive Oil");//compiler error

		System.out.println(groceries);

		// keySet--->we can get all the keyse of teh map and the

		Set<String> keys = groceries.keySet();

		System.out.println(keys);

		// values--->get the values

		Collection<Integer> values = groceries.values();

		System.out.println(values);
		System.out.println("====================");
		// can we iterate over the keys?

		for (String key : keys) {
			System.out.println(key + " " + groceries.get(keys));
		}

	}

}

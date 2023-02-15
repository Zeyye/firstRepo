package com.neotech.lesson30;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {

		// <K ,V >---->a pair entry, a key-value pair

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Emine");
		map.put(2, "Ayse");
		map.put(3, "Omer");
		map.put(4, "Ihsan");
		map.put(5, "Nesli");

		boolean isEmpty = map.isEmpty();
		System.out.println(isEmpty);

		System.out.println("The size of the map is :" + map.size());

		System.out.println(map);

		String name = map.get(2);
		System.out.println(name);

		// if we want to replace

		map.replace(1, "Hasan");

		System.out.println(map.get(1));

		map.remove(4);

		System.out.println(map);
		// check kep 4 exits
		boolean checkKey = map.containsKey(4);
		System.out.println(checkKey);

	}

}

package com.neotech.lesson30;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
	public static void main(String[] args) {

		/*
		 * Create a map of a building. Store floor number and it is associated company
		 * name. (Example: 1=Google, 2=Apple, 3=Neotech etc..). Insert 7 entries with
		 * duplicate keys and values. - Check how many entries you have? - Update
		 * company on a 4th floor - Remove company on the 7th floor - Print your map
		 */

		Map<Integer, String> floors = new LinkedHashMap<>();

		floors.put(1, "Google");
		floors.put(2, "Apple");
		floors.put(3, "Neotech");
		floors.put(4, "Samsung");
		floors.put(1, "Nokia");
		floors.put(5, "Google");
		floors.put(7, "Huawei");

		System.out.println("The size of the map is: " + floors.size());

		floors.replace(4, "ABC");

		floors.remove(7);

		System.out.println(floors);
		floors.clear();
		System.out.println(floors);

	}

}

package com.neotech.review09;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class WorldMap {

	public static void main(String[] args) {

		Map<String, String> europe = new TreeMap<>();// ordered by the key

		europe.put("Spain", "Madrid");
		europe.put("Germany", "Berlin");
		europe.put("Italy", "Rome");

		System.out.println(europe);

		Map<String, String> africa = new LinkedHashMap<>();// ordered preserved

		africa.put("Morocco", "Rabat");
		africa.put("Egypt", "Cairo");
		africa.put("SouthAfrica", "Johannesburg");

		System.out.println(africa);

		Map<String, String> asia = new HashMap<>();

		asia.put("Japan", "Tokyo");
		asia.put("Iran", "Tehran");
		asia.put("tURKEy", "Ankara");

		System.out.println(asia);

		//

	}

}

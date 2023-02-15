package com.neotech.lesson32;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();

		ht.put(1, "Mustafa");
		ht.put(2, "Gloria");
		ht.put(3, "Emine");
		ht.put(4, "Serkan");

		System.out.println(ht);
		System.out.println(ht.size());

	}

}

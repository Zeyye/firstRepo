package com.neotech.lesson29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {

		// HashSet - no duplicates, no order
		Set<String> veggies = new HashSet<>();
		veggies.add("potato");
		veggies.add("eggplant");
		veggies.add("tomato");
		veggies.add("tomato");

		System.out.println(veggies);

		// LinkedHashSet - no duplicates, insertion order
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("apple");

		System.out.println(fruits);

		// TreeSet - no duplicates, ascending order
		Set<String> food = new TreeSet<>();
		food.add("eggs");
		food.addAll(veggies); // not just for the TreeSet
		food.addAll(fruits);

		System.out.println(food);

	}

}

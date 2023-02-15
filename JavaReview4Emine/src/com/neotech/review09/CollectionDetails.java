package com.neotech.review09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionDetails {

	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<>();

		numbers.add(78);
		numbers.add(90);
		numbers.add(780);
		numbers.add(89);
		numbers.add(12);
		numbers.add(45);

		System.out.println(numbers);

		Integer min = Collections.min(numbers);
		System.out.println("min is " + min);

		Integer max = Collections.max(numbers);
		System.out.println("max is " + max);

		// Collections.sort(numbers);--->CANNOT BE SORTED

		// LIST CAN BE SORTED

		List<Integer> number = new ArrayList<>(numbers);

		System.out.println("The size of the list is: " + number.size());

		System.out.println("The list can be sorted---> " + number);

		List<String> students = new LinkedList<>();

		students.add("emine");
		students.add("ayse");
		students.add("dardan");
		students.add("murat");
		students.add("omer");
		students.add("zeynep");

		System.out.println(students);

		String first = Collections.min(students);
		System.out.println(first);

		Collections.sort(students);
		System.out.println(students);

		int[] arr = { 5, 7, 8, 9 };

		Arrays.sort(arr);

		for (int n : arr) {
			System.out.print(n + " ");
		}

	}

}

package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<>();

		ls.add("Harun");
		ls.add("Enes");
		ls.add("Baris");
		ls.add("Oguzhan");
		ls.add("Moises");
		ls.add("Harun");

		System.out.println(ls);

		// LinkedHashSet --- no duplicates, insertion order
		Set<String> lhs = new LinkedHashSet<>();
		lhs.addAll(ls);
		System.out.println(lhs);

		// HashSet --- no duplicates, no insertion order
		Set<String> hs = new HashSet<>(ls); // passing list as a constructor param
		System.out.println(hs);

		// TreeSet --- no duplicates, ascending order
		Set<String> ts = new TreeSet<>();
		ts.addAll(ls);
		System.out.println(ts);

		// how do we get a specific value
		if (lhs.contains("Hakan")) {
			System.out.println("Contains Hakan");
		}

		// we can convert sets back to list
		List<String> list = new ArrayList<>(ts);
//		list.addAll(lhs);
		list.add(0, "Hakan");
		list.add("Harun");
		System.out.println(list);

		// can we convert set to an array
		Object[] array = lhs.toArray();
		// Arrays
		Arrays.sort(array);

		// for collections we have another utility class
		Collections.sort(list);
		System.out.println(list);

	}

}

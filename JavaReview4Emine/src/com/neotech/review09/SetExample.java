package com.neotech.review09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		// Collection
		// List|Set|Queue(Three interfaces which are inheriting collection interface.)
		// ArrayList|LinkedList(Two classes implementing the lIST interface )
		// HasSet|LinkedHashSet|TreeSet(Three classes implementing the Set interface)

		Set<String> africa = new LinkedHashSet<>();// up-casting

		africa.add("Egypt");
		africa.add("Niger");
		africa.add("Mororco");
		africa.add("Ghana");
		africa.add("Chad");
		africa.add("Uganda");

		System.out.println(africa);
		System.out.println("The size of the set is: " + africa.size());

		boolean added = africa.add("Niger");// ----->it will not add to the set because it already exits.
		africa.add("Chad");

		System.out.println("The size of the set is: " + africa.size());
		System.out.println("Boolean is added? " + added);

		// africa.add(2,"Zambia");//cannot added NO INDEX IN SET

		System.out.println("LinkedHashSet -->" + africa);

		Set<String> africaTree = new TreeSet<>(africa);

		// System.out.println("The size of the africa tree " + africaTree);

		Set<String> africaHash = new HashSet<>();
		africaHash.addAll(africa);

		// System.out.println("The size of the africaHash is: " + africaHash.size());

		// System.out.println(africaHash);

		// boolean contains = africaHash.contains("Turkey");

		// boolean contains1 = africaHash.contains("Senegal");

		// boolean isEmpty = africaHash.isEmpty();
		// what will happen when I try to remove Turkey
		// boolean ableToRemove = africaHash.remove("Turkey");

		// System.out.println("Am I able to remeove? " + ableToRemove);

		// Note:We are not able to get/remove/add by index in Set
		// africaHah.get(3);

		// using enhanced for loop

		System.out.println("USING ENHANCED FOR LOOP");

		for (String country : africa) {
			System.out.print(country + " ");

		}

		System.out.println();

		System.out.println("Second way with iterator");

		Iterator<String> iter = africa.iterator();

		while (iter.hasNext()) {
			String country = iter.next();

			System.out.print(country + " ");
		}
	}

}

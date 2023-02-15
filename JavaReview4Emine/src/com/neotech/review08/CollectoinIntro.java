package com.neotech.review08;

//imports all classes that are needed
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectoinIntro {
	public static void main(String[] args) {

		// List is an Interface

		// List<String> names=new List<>();

		List<String> africa = new ArrayList<>();// upcasting
		africa.add("Kenya");
		africa.add(0, "Morocco");// We can add the index number
		africa.add("Chad");
		africa.add(1, "Ghana");

		System.out.println(africa);

		List<String> africa2 = new ArrayList<>();// SECOND WAY OF FILLING A ARRAYLIST by creating an empty list

		africa2.addAll(africa);
		System.out.println(africa2);

		// Third WAY OF FILLING A ARRAYLIST

		List<String> africa3 = new ArrayList<>(africa);// creating a filled list

		System.out.println(africa3);

		System.out.println("===================");// there are three ways to iterate

		for (int i = 0; i < africa.size(); i++) {
			String country = africa.get(i);
			System.out.print(country + " ");
		}
		System.out.println();
		for (String country : africa) {
			System.out.print(country + " ");
		}
		System.out.println();

		// using iterator

		Iterator<String> iter = africa.iterator();
		while (iter.hasNext()) {
			String country = iter.next();

			System.out.print(country + " ");
		}
		System.out.println();

		ArrayList<Object> list = new ArrayList<>();// Same non-generic

		ArrayList europe = new ArrayList();// Non-generic -->we can use this structure to add any type of element
		europe.add("Italy");
		europe.add(7);
		europe.add(4.6);

		for (Object element : europe) {
			System.out.println(element);
		}

	}
}

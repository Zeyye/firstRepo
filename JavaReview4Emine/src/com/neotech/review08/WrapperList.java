package com.neotech.review08;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperList {

	public static void main(String[] args) {

		// ArrayList<int>nums =ArrayList<>(); ArrayList can only store objects /classes
		ArrayList<Integer> numbers = new ArrayList<>();

		boolean isEmpty = numbers.isEmpty();

		System.out.println("Is it empty? " + isEmpty);

		System.out.println("The size is: " + numbers.size());

		numbers.add(new Integer(5));// this is the long way

		numbers.add(6);// Auto-boxing

		numbers.add(2);
		numbers.add(1);

		System.out.println("The size is-->" + numbers.size());

		// List is an Interface

		// ArrayList and LinkedList are classes implementing the List Interface
		boolean contains = numbers.contains(8);
		System.out.println(numbers.contains(8));
		System.out.println(contains);

		// numbers.remove(1); remove by index

		numbers.remove(new Integer(1));
		System.out.println(numbers);

		System.out.println("How can I iterate the whole ArrayList?");

		for (int i = 0; i < numbers.size(); i++) {
			int element = numbers.get(i);// Auto-Unboxing
			System.out.println(element);
		}

		// Second way

		for (Integer element : numbers) {
			System.out.print(element);
		}
		// third way using iterator

		Iterator<Integer> it = numbers.iterator();// it is a getter

		// there are three methods in the iterator class.
		// 1-hasNext(); this will return if there is a next element
		// 2-next();this will return the next element
		// 3-remove();this will remove the current element
		System.out.println();
		System.out.println("====================");
		while (it.hasNext()) {
			int element = it.next();
			System.out.println(element);

		}

	}

}

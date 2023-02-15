package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework2 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i <= 50; i = i + 2) {
			numbers.add(i);

		}

		// how do we create an iterator??
		// className<> identifier =[collection].iterator();

		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) // check if there in an integer object next
		{
			Integer num = it.next();// iterator points now to the next element and also keeps track of the last
									// returned element
			if (num % 5 == 0) {
				it.remove();
			}
		}
		System.out.println(numbers);

	}

}

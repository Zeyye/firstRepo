package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {
	public static void main(String[] args) {

		// Generic ArrayList

		ArrayList<Double> al = new ArrayList<>();

		al.add(2.5);
		al.add(4.7);
		al.add(6.9);
		al.add(7.9);

		// al.add((double) 100);//CE, this is not converted automatically
		// al.add(5);

		System.out.println(al);

		// replacing the array list

		al.set(1, 10.2);
		// if the index is larger than the arrayList, if you do that you will get an
		// IndexOutof BoundsException

		System.out.println(al);

		// remove an element

		al.remove(2.5);
		System.out.println(al);

		// how do we elements at the index 0??

		System.out.println(al.get(0));

		// for loop

		for (int i = 0; i < al.size(); i++) {
			// arr[i]
			System.out.print(al.get(i) + " ");
		}
		System.out.println();

		// for each loop

		for (Double d : al) // we can use double or Double Java does automatically boxing and unboxing
		{
			System.out.print(d + " ");
		}

		System.out.println("===============================");

		// Non-Generic ArrayList

		ArrayList al2 = new ArrayList();

		al2.add(100);// storing integer object

		al2.add("Hello");// storing a String object

		al2.add('A');// storing a Character

		al2.add(al);// storing an ArrayList

		System.out.println(al2);

		// retrieving all elements from Non-Generic ArrayList

		for (Object obj : al2) {
			System.out.println(obj);
		}

	}

}

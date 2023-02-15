package com.neotech.lesson12;

public class RetrieveElements {

	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		// loop through the grades array
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ", ");
		}
		System.out.println();

		// 2nd way: enhanced loop / advanced for loop / for-each loop
		for (char element : grades) {
			System.out.print(element + ", ");
		}

		System.out.println();
		System.out.println("----------------");
		String[] fruits = { "Apple", "Orange", "Pear", "Peach", "Kiwi", "Watermelon" };
		// Lets print the fruits on the screen
		for (int i = 0; i < fruits.length; i++) {
			// System.out.print(fruits[i] + ", ");
			// Lets print our favorite fruit
			if (fruits[i].equals("Apple")) {
				System.out.println(fruits[i] + " is my fav fruit");
			} else {
				System.out.println(fruits[i]);
			}
		}

		System.out.println("----------------");
		// Lets do it the with the for-each loop
		for (String fruit : fruits) {
			if (fruit.equals("Watermelon")) {
				System.out.println(fruit + " is my fav fruit");
			} else {
				System.out.println(fruit);
			}
		}

	}

}

package com.neotech.lesson14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;

		do {

			System.out.println("Enter item" + count + "its price:");
			item = scan.next();
			price = scan.nextDouble();
			shoppingListReport = shoppingListReport + "item" + count + ": " + item + " Price" + price + ", ";
			totalPrice += price;
			System.err.println("Add one more item?");
			countinue = scan.next();
			count++;

		} while (countinue.equalsIgnoreCase("yes"));
		shoppingListReport = shoppingListReport.substring(0, shoppingListReport.lastIndexOf((", ")));
		System.out.println(shoppingListReport);
		System.out.println("Total price :" + totalPrice);

	}
}
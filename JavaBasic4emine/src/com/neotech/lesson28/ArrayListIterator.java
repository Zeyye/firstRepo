package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String[] args) {

		ArrayList<String> choco = new ArrayList<>();

		choco.add("Kinder");
		choco.add("Albeni");
		choco.add("Godiva");
		choco.add("Ferrero");
		choco.add("Toblerone");

		ArrayList<String> sweets = new ArrayList<>();

		sweets.add("Baklava");
		sweets.add("Tiramisu");
		sweets.add("Tres Leches");
		sweets.add("Ice Cream");

		sweets.addAll(choco);

		System.out.println(" the size of the sweets is: " + sweets.size());

		System.out.println(sweets);

		Iterator<String> it = sweets.iterator();

		while (it.hasNext()) // checks if there is any element any other next
								// we use to control the iteration
		{
			String element = it.next();// gives us the next element
			System.out.print(element + "-");

			if (element.equals("Albeni")) {
				it.remove();
			}

		}
		System.out.println();
		System.out.println(sweets);

	}

}

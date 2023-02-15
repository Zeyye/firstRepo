package com.neotech.lesson32;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {

	public static void main(String[] args) {

		List<Integer> arrlist = new ArrayList<>();

		arrlist.add(34);
		arrlist.add(56);
		arrlist.add(89);
		arrlist.add(90);
		arrlist.add(23);

		// System.out.println(arrlist);

		int sum = 0;

		for (Integer i : arrlist) {
			sum += i;

		}
		System.out.println(sum);
	}
}

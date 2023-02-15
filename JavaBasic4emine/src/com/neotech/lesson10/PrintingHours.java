package com.neotech.lesson10;

public class PrintingHours {
	public static void main(String[] args) {

		// print the all combinations of hours and minutes in a digital clock
		// 00:00
		// 00:01
		// 00:02
		// ....
		// ...
		// 23:59

		for (int hour = 0; hour <= 24; hour++) {
			for (int min = 0; min < 60; min++) {

				// System.out.println(hour + ":" + min);
				// 1. we need to change 0:0 to 00:00(up to 10)
				// 2.what if 10:1--->update it to 10:01
				// 3.what if 1:10 --->update it to 01:10
				// 4.both are larger than 9
				if (hour < 10 && min < 10) {
					// case: 1
					System.out.println("0" + hour + ":" + "0" + min);
					// case:2
				} else if (hour >= 10 && min < 10) {
					System.out.println(hour + ":" + "0" + min);

				} else if (hour < 10 && min >= 10) {// case:3
					System.out.println("0" + hour + ":" + min);
				} else {
					// case:4
					System.out.println(hour + ":" + min);
				}
			}
		}

	}

}

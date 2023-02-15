package com.neotech.lesson10;

public class Task3 {
	public static void main(String[] args) {

//      1
//		22
//		333
//		4444
//		55555
//		666666
//		55555
//		4444
//		333
//		22
//		1

		for (int i = 0; i < 7; i++) {
			for (int col = 1; col <= i; col++) {

				System.out.print(i);
			}
			System.out.println();
			for (int x = 5; x >= 1; x--) {
				for (int y = 1; y <= x; y++) {
					System.out.print(x);
				}
				System.out.println();
			}
		}

	}

}

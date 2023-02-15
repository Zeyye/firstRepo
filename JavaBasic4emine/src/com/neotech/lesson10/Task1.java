package com.neotech.lesson10;

public class Task1 {

	public static void main(String[] args) {

//		1
//		22
//		333
//		4444
//		55555//print it on the console

		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {// ====> THIS INEER LOOP EXECUTES AS MANY TIMES AS THE VALUE OF ROW
				System.out.print(i);

			}
			System.out.println();// THIS IS FOR THE NEW LINE

		}

	}

}

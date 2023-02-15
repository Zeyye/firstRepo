package com.neotech.lesson12;

public class Recap {
	public static void main(String[] args) {

		// lets create basic integer

		int[] grades = new int[5];

		// lets print the size of this array

		System.out.println("The size of the array is: " + grades.length);
		// element with index#2

		System.out.println("The third element of the array is: " + grades[2]);

		grades[3] = 78;

		grades[1] = 90;

		// grades[5] = 100;---->runtime error

		System.out.println(grades[3] + grades[1] + grades[4]);

		// grades [2]="hello";---->compile time error

		grades[2] = 100;
		grades[0] = 93;
		grades[4] = 78;

		// re-assigning the value of an element

		grades[4] = 98;

		int size = grades.length;

		System.out.println("The size of the array after values is " + size);

		// lets find the total of the array

		int total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];

		System.out.println("The total is: " + total);

		// find the average of the array

		int average = total / 5;

		System.out.println("The average is :" + average);

		// 2nd way:lets find the total using for loop

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			sum += grades[i];// ------->sum=sum+grades[i]

		}
		System.out.println("The total is: " + sum);
	}

}

package com.neotech.lesson07;

public class IntroToSwitch {

	public static void main(String[] args) {

		// given the 1-7 then print the name of the day

		int day = 3;

		switch (day) // we use the variable that we want to compare the value
		{
		case 1:
			System.out.println("Monday");
			break;// end the execution or get out of the switch

		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}

	}
}

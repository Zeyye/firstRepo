package com.neotech.review01;

public class SwitchWithMissingBreaks {

	public static void main(String[] args) {
		int number=5;
		switch (number) {
		
		case 2:
			System.out.println("2");
		
		case 3:
			System.out.println("3");
		break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
		}
		
		//limitations of switch
		//1--you cannot have duplicate cases
		//2--You should be careful about the breaks!
		//3--You cannot use logical operators like in if-else
		//4--you can only use integer you cannot use double

	}

}

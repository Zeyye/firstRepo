package com.neotech.lesson02;

public class VariableDeclaration {

	public static void main(String[] args) {

		// 1st way. Declaring a variable and assigning a value
		int number1 = 10;

		// 2nd way. Declaring a variable and NOT assigning a value
		byte number2; // 1st step is declaring the variable
		number2 = 15; // 2nd step is assigning the value

		// 3rd way. Declaring multiple variables (of the same type)
		char var1, var2, var3; // Declaring multiple variables
		var1 = '@';
		var2 = '$';
		var3 = 'T';
		
		System.out.println(number1);
		
		// I want to change the value that is store inside a variable
		// re-assigning a value
		// I am NOT creating a new container
		number1 = 55;
		
		System.out.println(number1);
		
	}

}


package com.neotech.lesson24;

public class FinalExamples {

	/*
	 * 1.Create a class FinalExamples that has one final String variable with an
	 * initial value and one final method printVariable(). In the main method create
	 * an object of FinalExamples class and try to reassign a value to instance
	 * variable. Create a sub class of FinalExamples named ChildClass and try to
	 * override the printVariable() method.
	 */

	final String str = "I love java";

	final void printVariable() {

		System.out.println(str);
	}

	public static void main(String[] args) {

		FinalExamples f = new FinalExamples();
		// f.str = "I hate java";// we cannot do it!

		f.printVariable();

	}
}

class child extends FinalExamples {

	/*
	 * void printVariable() {------->final methoc cannot be overriden
	 * 
	 * }
	 */

	// String f.printVariable();

	void printVariables(String name) // --------------->this is doable it is a different method
	{

	}

}

package com.neotech.lesson24;

public class FinalKeyword {

	public static String str = "Hello";
	// Final variable=Constant ! can not be re-assigned!
	public static final String str2 = "Bye";

	public final double PI = 3.14;// pi will always have this value

	public static void main(String[] args) {

		// str2="Hi";--->it will give compile error

		// local variable

		final String finalStr = "Java is easy!";
		// finalStr="Java is difficult";--->you CANNOT change
		final int age = 8;
		// after one year

		// age=9;--->you CANNOT CHANGE!

	}

	// final methods cannnot be overriden
	public final void hello()

	{
		System.out.println("Hello, I am a final method!");

	}

	// Yes I can overload a final method
	public final void hello(String name) {
		System.out.println("Hello " + name);
	}

}

class SubClass extends FinalKeyword {// @Override
										// public void hello() //compiler error cannot override final method it is not
										// allowed
	{
	}

//this is not overriding! method signature is different:just another method!
	public void hello(int num) {
	}

}

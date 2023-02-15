package com.neotech.lesson17;

public class StringBufferDemo {

	public static void main(String[] args) {

		// how did we create a String
		String a = "Hello"; // string literal
		String b = new String("Hello"); // String is a class, we are creating an object

		// when we want to change the string frequently
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);

		// we can change the stringBuffer object, without the need to create a new one
		sb.append(" All");// string is added to the sb object
		System.out.println(sb);

		// if we do it as:
		a = a + " All";
//		a  = new String("Hello All"); this is what java need to do
		System.out.println(a);

		// String is immutable --- once created it cannot be changed
		// StringBuffer and StringBuilder are mutable --- we create a string and
		// we can change the existing string

		System.out.println(sb.length());
		System.out.println(sb.reverse());

		String subStr = sb.substring(2, 5);
		System.out.println(subStr);

		// an example with StringBuffer and StringBuilder
		StringBuffer strBuff = new StringBuffer("");

		StringBuilder strBld = new StringBuilder("It is late,");
		strBld.append(" but we won't stop!");

		System.out.println(strBld);

	}

}

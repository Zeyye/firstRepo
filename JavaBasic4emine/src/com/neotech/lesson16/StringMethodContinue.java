package com.neotech.lesson16;

public class StringMethodContinue {

	public static void main(String[] args) {

		// contains
		String sentence = "Today is Oct 22";
		boolean cont = sentence.contains("today"); // this is like a question:
		// does this string contain this element --> Yes/No
		System.out.println(cont);
		System.out.println(sentence.toLowerCase().contains("today"));

//		sentence.toLowerCase().contains("today")
		// using method chaining we write 2 lines in line
//		String lower = sentence.toLowerCase();
//		boolean check = lower.contains("today");

		// startsWith()
//		"Today is Oct 22"
		boolean starts = sentence.startsWith("Today");
		System.out.println("starts with --> " + starts);

		// endsWith()
		boolean ends = sentence.endsWith("Oct 22");
		System.out.println("ends with --> " + ends);

		// equals()
		String s1 = "Saturday";
		String s2 = "saturday";
		boolean equals = s1.equals(s2);
		System.out.println("equals --> " + equals);

		// equalsIgnoreCase()
		boolean equalsIgnoreCase = s1.equals(s2);
		System.out.println("equals ignore case --> " + equalsIgnoreCase);

		// instead of using equalsIgnoreCase
		boolean equalsLower = s1.toLowerCase().equals(s2.toLowerCase());
		System.out.println("Equals lower --> " + equalsLower);
		boolean equalsUpper = s1.toUpperCase().equals(s2.toUpperCase());
		System.out.println("Equals upper --> " + equalsUpper);

		// step by step
		String s1Upper = s1.toUpperCase();
		String s2Upper = s2.toUpperCase();
		boolean compare = s1Upper.equals(s2Upper);
		System.out.println("Compare --> " + compare);

	}

}

package com.neotech.lesson18;

public class LocalVariables {

	public static void main(String[] args) {

		boolean flag = true;

		if (flag) {
			String answer = "Yes";
			System.out.println(answer);
			System.out.println(flag);

		}
		// System.out.println(answer);//it is local to the code block of if
		System.out.println(flag);

		// The scope /lifetime of answer is only the if block
		// The scope of the flag is the main method

	}

}

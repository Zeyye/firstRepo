package com.neotech.lesson07;

public class LogicalNot {
	
	public static void main(String[] args) {
		// !(NOT)-reserves the value of a boolean variable
		
		boolean b1=!true;
		System.out.println(b1);
		
		boolean b2=!false;
		System.out.println(b2);
		
		// not only in front of a boolean variables, it can be with any boolean expression
		
		System.out.println(!(6<5));
		
		boolean cold=false;
		
		if (!cold) 
		{
			System.out.println("it is cold");
		}
		int x=12;
		
	}

}

package com.neotech.review01;

public class VariableDemo {
	public static void main(String[] args) {
		
		//declaring a variable		
		String firstName;		
		
		//System.out.println("My first name is"+   firstName);
		
		//Assign a value (initialize a value)
		
		firstName="Cesur";
		System.out.println("My first name is "+   firstName);
	//Declaring a variable & assign the value
		String lastName="Unsur";
		
		int age=28;
		System.out.println(firstName+" "+ lastName+" "  +age+1);//--->concatination
		System.out.println(firstName+" "+ lastName+" "  +(age+1));
		// After 5 years 
		//age=age+5;-->long way
		
		age+=5;//--->re-assigning the value
		
		System.out.println(age);
		
		lastName="Aniston";
		
		System.out.println("After getting married!");
		System.out.println(firstName+" "+ lastName+" "+age);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

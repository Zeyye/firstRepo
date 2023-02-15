package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {
	public static void main(String[] args) {
		
		
		//Ask the user their country and  print the language they speak
		
		Scanner scan =new Scanner(System.in);
		
		String country;
		
		//escape character\: \" \n \t
		
		System.out.println("Where are you from");
		country =scan.next();
		
		/*
		 * if(country.equals("Albania")) { System.out.println("You speak Albanian"); }
		 * else if (country.equals("Turkey")) { System.out.println("You speak Turkish");
		 * } else if(country.equals("Moldova")) {
		 * System.out.println("You speak Romanina"); } else
		 * if(country.equals("USA")||country.equals("UK")) {
		 * System.out.println("You speak English"); } else
		 */
		{
			
			//System.out.println("I dont know what language you speak!");
			
		}
		
		switch (country) 
		{
		
		case "Turkiye":
			
			System.out.println("You speak TURKISH");
			break;
		case"Albania":
		case"Kosova":
			
			System.out.println("You speak Albanian!");
			
		case"Spain":
		case"Colombia":
			System.out.println("You speak Spanish!");
			break;
		case"USA":
		case"UK":
		case"Malta":
				System.out.println("You speak English");
			
		}
	}

}

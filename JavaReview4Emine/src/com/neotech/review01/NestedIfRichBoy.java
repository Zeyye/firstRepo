package com.neotech.review01;

import java.util.Scanner;

public class NestedIfRichBoy {

	public static void main(String[] args) {

		// Task until 2:45
		// If you are a boy
		// If you are rich -- Buy a Ferrari
		// otherwise -- Play soccer

		// If you are a girl
		// If you are rich -- Buy a LV bag
		// otherwise -- Read a book

		// You can start like this:
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your gender:");
		char gender =input.next().charAt(0);

		System.out.println("Are you rich? (true/false)");
		boolean rich = input.nextBoolean();
		
		if (gender =='M') 
		{
			System.out.println("Yaayy it is a boy!!");
			
		}
		else if(gender=='F') 
		{
			
			System.out.println("oooohh no it is a girl!");
		}
		else 
		{
			System.out.println("invalid data");
		}

	}

}

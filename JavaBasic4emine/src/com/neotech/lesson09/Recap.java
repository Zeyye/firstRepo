package com.neotech.lesson09;

public class Recap {
	public static void main(String[] args) {
		// How can we print 5 times"Good evening!"
		// FIRST WAY
		System.out.println("Good evening!");
		System.out.println("Good evening!");
		System.out.println("Good evening!");
		System.out.println("Good evening!");
		System.out.println("Good evening!");

		// SECOND WAY USING WHILE
		// WHAT DO WE NEED WHEN USE A WHILE
		// -WE ARE RESPONSIBLE FOR WHERE, WHEN WE START
		// -WE ARE RESPONSIBLE WHEN WE STOP

		int count = 1;

		while (count <= 5) {
			System.out.println("Good evening!");

			count++;
			
			
			//3RD--> USING DO WHILE
			
			int num=1;
					do 
					{
						
						
					System.out.println("Good evening!");	
						
					num++;	
					}
			while (num<10);
			
			
			
			
		}

	}

}

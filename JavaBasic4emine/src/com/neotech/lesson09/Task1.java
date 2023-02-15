package com.neotech.lesson09;

public class Task1 {
	public static void main(String[] args) {
		
		/*
		 * Print numbers from 1 to 100 in 1 line with space 
		 
		 
		 * Print odd numbers between 20 and 50  (2 ways)
		 */
		
		for(int i=1; i<=100; i++)
		
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		// Print numbers from 100 to 1
		for (int a=100; a>=1; a--) 
			
			
		{
			System.out.print(a+" ");
			
		}
		System.out.println();
		//* Print even numbers from 20 to 1 (2 ways) 
		
		for (int b=20; b>=1; b--) 
		{
			if(b %2==0) 
			{
				System.out.print(b+" ");
			}
			
		}
		System.out.println();
		
		for (int b=20; b>=1; b-=2)
		
		{
			System.out.print(b+" ");
			
			
		}	
		System.out.println();
		
			
			for(int c=20; c<=50; c++) 
			{
				if(c %2 ==1) 
				{
					System.out.print(c+" ");
				}
				
				
			}
		for(int c=21; c<=50; c+=2) 
		{
			
			System.out.print(c+" ");
		}	
			
	}

}

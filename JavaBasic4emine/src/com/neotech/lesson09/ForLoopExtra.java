package com.neotech.lesson09;

public class ForLoopExtra {
	
	public static void main(String[] args) {
		
		System.out.println("Print numbers from 21 to 30");
		
		for(int i=21; i<=30; i++) 
		{
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("Lets print numbers from 20 to 1");
		
		for(int i=20; i>=1; i--) 
		{
			
			System.out.print(i+" ");
			
			
		}
		
		System.out.println("\nPlease print odd numbers from 1 to 10");
		
		for(int i=1; i<=10; i+=2) 
		{
			
			System.out.print(i+" ");
			
			System.out.println("SECOND WAY");
			
		}
		
	}

}

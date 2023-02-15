package com.neotech.lesson09;

public class SkipNumbers {
	public static void main(String[] args) {
		
		
		//print numbers 1 to 10 ----skip 3, 6, and 9
		
		
		for(int i=1; i<=10; i++) 
		{
			
			
			if(i==3 || i==6 || i==9) 
			{
				continue;
			}
			
			System.out.print(i+" ");
		}
		
		//print numbers fron 20 to 30 --skip 23 to 28
	}

}

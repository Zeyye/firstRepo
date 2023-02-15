package com.neotech.lesson05;

public class ElseIfCondition {
	
	public static void main(String[] args) {
		
		
		double d1=15.5;
		double d2=15;//what is this called?
		
		//d1>d2-->same as saying d2<d1
		
		//d1==d2
		
		//d1<d2
		
		if(d1>d2) {
			
			System.out.println("number  "+d1 +"is larger than  "+d2);
		}
		else if (d1==d2) 
		{
			
			System.out.println("number " +d1 +"is equal to "+d2);
		}
		
		
		else
		{
		System.out.println("number "+d1 +"is less than "+d2);	
			
		}
		
		int a=5;
		int b=8;
		
		
		//a>b
		//b>a
		//a==b
		
		if (a==b) 
		{
			
			System.out.println("number "+a+ " is equal to "+b);			
			
			
		}
		else if(a>b) 
		{
			System.out.println("number "+ a+ "is larger than "+b);
			
		}
		
		
		else 
		{
			
			System.out.println("number "+a +" is smaller than "+b);
		}
		
		
		
	}

}

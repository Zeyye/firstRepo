package com.neotech.lesson09;

public class Homework1 {
	
public static void main(String[] args) {
	
	//1. Write a program using while loop that calculates the 
	//sum of the even numbers between 0 and 10.
	
	int num=0;//====>1st way increment by ONE
	int sum=0;
	
	while(num <=10) 
	{
		//now check the current number is odd or even
		if(num %2== 0) 
		{
			
			sum+=num;
		}
		
		
		
		num++;
	}
	System.out.println("The total sum is: "+sum);
	
	
	//2nd way -Increment by TWO
	
	int num2=0;
	int total=0;
	
	while(num2<=10) 
	
	{
		total += num2;
		num2+=2;
	}
	
	
	
	System.out.println(total);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

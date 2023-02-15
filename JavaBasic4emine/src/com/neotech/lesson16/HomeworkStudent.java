package com.neotech.lesson16;

import java.util.Scanner;

public class HomeworkStudent {

	
	
	/*
	 * Create a class Student that will have a method getGrade. 
	 * Your method should accept the score of a student 
	 * and return a grade: 
	 * score > 90 - A 
	 * score > 80 - B 
	 * score > 70 - C 
	 * score > 50 - D 
	 * anything else - F
	 */
	
	
	
	
	char getGrade(int score)
	{
		char grade;
		
		if (score > 90)
		{
			grade = 'A';
		}
		else if (score > 80)
		{
			grade = 'B';
		}
		else if (score > 70)
		{
			grade = 'C';
		}
		else if (score > 50)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}
		
		return grade;
		
	}
	
	public static void main(String[] args) {
		
		HomeworkStudent st = new HomeworkStudent();
		char result = st.getGrade(95);
		System.out.println("Student 1 got " + result);
		
		
		
		//can we add a scanner - if we need to
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your score: ");
		int score = scan.nextInt();
		char result2 = st.getGrade(score);
		System.out.println("Student 2 got " + result2);
		
		
		
	}
}

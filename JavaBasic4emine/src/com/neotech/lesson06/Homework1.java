package com.neotech.lesson06;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * Homework 1:
		 * 
		 * Write a java program to check if a patient has allergies. If the patient does
		 * not have allergies print “You’re healthy!”. If the patient has allergies,
		 * check if it is a peanut allergy, lactose allergy, bee allergy or seafood
		 * allergy and print a statement telling the patient “Don’t eat ___”. (fill the
		 * line with the food names – peanut, seafood etc.)
		 */

		boolean allergy = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		boolean seafood = false;

		if (allergy) {
			//the patient has allergies
			System.out.println("You have allergies!!!");
			if (peanut) {
				//the patient peanut allergy
				System.out.println("Do NOT eat peanut!");
	  		}
			if (lactose) {
				System.out.println("Do NOT consume lactose!");
			}
			if (bee) {
				System.out.println("Do NOT eat honey !");
			}
			if (seafood) {
				System.out.println("Do NOT eat seafood!");
			}
		}

		else {
			System.out.println("You are healty!!!");

		}

	}

}

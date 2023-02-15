package com.neotech.lesson02;

public class PrimitiveDataTypes {
	
	public static void main(String[] args) {
		
		
		byte var1 =9;// range is -128 to 127, total 256 different values
		
		
		// complier will give an error
		//byte baris =130;
		
		
		short var2 =25;
		//range -32768 to 32767
		
		//short var3 =34.7;complier will complain again we can only store whole number not decimel
		
		int var4=30000;
		//range -2billion  to +2 billion
		
		int esat =3;
		
		//yes we can store small numbers in int
		
		long elionBankBalance= 7876986978698796879L;
		// if the number is bigger than 2 billion we have to use long 
		
		System.out.println(elionBankBalance);
		
		//to store decimail number we use float and double
		
		float rahime =23.568F;// WE MUST USE f or F at the end
		
		double rahime2 =234.89; // we do not need f at the end
		
		System.out.println(rahime);
		System.out.println(rahime2);
		
		// if you want to store a single character we use char
		
		char var6 = 'D';
		char var7 ='s';
		char var8 =' ';//this is the space character
		char var9 ='7';
		
		boolean ali =true;// to store boolean values (true /false)
		
		
		
	}

}

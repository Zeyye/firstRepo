package com.neotech.lesson04;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		
		//casting or converting
		//byte-->short-->int-->long-->float-->double-->
		
		double d1=3.1;//no casting /conversion
		System.out.println(d1);
		
		double d2=6;// casting is happening
		System.out.println(d2);
		
		int num1=5;
		int num2=num1;
		
		System.out.println(num2);
		//widening, implicit casting, automatically
		int num3=5;
		double d3=num1;//casting is happening
		
		System.out.println(d3);
		//narrowing, explicit casting, manually		
		byte b1=(byte) 7676;
		System.out.println(b1);
		
		int i2=45;
		
		byte b2=(byte) i2;
		System.out.println(b2);
		
		long l1=17;
		int number1=(int) l1;
		System.out.println(number1);
		
		long l2=9898769767L;
		int number2=(int) l2;
		
		System.out.println(number2);
		
	}

}

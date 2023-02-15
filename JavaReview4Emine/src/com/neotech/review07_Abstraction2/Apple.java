package com.neotech.review07_Abstraction2;


//You can only extend ONE  and ONLY ONE class

// You can implement multiple interfaces
public class Apple extends Fruit implements Peelable, Washable{

	public Apple(String color) {
		super(color);
		
	}

	@Override
	public void peel() {
		System.out.println("Pleeling the apple");
		
	}

	@Override
	public void wash() {
		
		
	}
	
	

}

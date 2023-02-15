package com.neotech.lesson24;

public class CreditCardTest {
	public static void main(String[] args) {

		CreditCards card1 = new CreditCards(4000);
		card1.calculateInterest();

		CreditCards card2 = new AX(18000);
		card2.calculateInterest();

		CreditCards card3 = new Visa(80000);
		card3.calculateInterest();// ============>up-casting
	}

}

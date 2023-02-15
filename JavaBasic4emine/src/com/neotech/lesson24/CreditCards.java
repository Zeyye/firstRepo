package com.neotech.lesson24;

public class CreditCards {

	double balance;
	double interest;

	public CreditCards(double balance) {
		this.balance = balance;
	}

	public void calculateInterest() {
		interest = 5;
		System.out.println("Interest rate is :" + interest + "%");
	}
}

class AX extends CreditCards {

	public AX(double balance) {
		super(balance);

	}

	@Override
	public void calculateInterest() {
		if (balance < 5000) {
			interest = 10;
		} else {
			interest = 20;
		}
		System.out.println(" Amex interest rate is :" + interest + "%");
	}

}

class Visa extends CreditCards {

	public Visa(double balance) {
		super(balance);

	}

	@Override
	public void calculateInterest() {
		if (balance > 10000) {
			interest = 15;
		} else {
			interest = 30;
		}
		System.out.println(" visa Interest rate is :" + interest + "%");
	}

}

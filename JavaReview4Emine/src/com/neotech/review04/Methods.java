package com.neotech.review04;

public class Methods {

	void sayWelcome() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayWelcomeWithNumbers(String greeting, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();

	}

	void sayGreeting(String greeting) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(greeting + " ");
		}
	}

	void greetingWithNumber(String greeting, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(greeting + " ");
		}
	}

	public static void main(String[] args) {

		Methods m = new Methods();
		m.sayWelcome();
		m.sayWelcomeWithNumbers("Merhaba", 3);
		m.sayGreeting("Laskova prosymo!");
		m.sayWelcomeWithNumbers("Merhaba", 2);
	}
}

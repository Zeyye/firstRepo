package com.neotech.lesson34;

public class InfoAboutExceptions {

	public static void main(String[] args) {

		String str = "Hello";

		try {
			char c = str.charAt(2);
			System.out.println(c);

			int a = 10;
			int b = 0;
			System.out.println(a / b);

		} catch (StringIndexOutOfBoundsException e) {
			// e.printStackTrace();

			System.out.println(e);

		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("End of code");

	}

}

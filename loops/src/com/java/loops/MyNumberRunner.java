package com.java.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("SumUptoN is " + sum);

		int sumOfDivisors = number.sumOfDivisor();
		System.out.println("SumOfDivisor is" + sumOfDivisors);

		number.printNumberTriangle();
	}

}

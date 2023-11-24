package com.introductiontoOOps;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(100);
		Book cleanCode = new Book(100);

		artOfComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(50);
		cleanCode.setNoOfCopies(45);

		artOfComputerProgramming.increaseNoOfCopies(50);
		effectiveJava.increaseNoOfCopies(25);
		cleanCode.increaseNoOfCopies(20);

		artOfComputerProgramming.decreaseNoOfCopies(20);
		effectiveJava.decreaseNoOfCopies(10);
		cleanCode.decreaseNoOfCopies(5);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}

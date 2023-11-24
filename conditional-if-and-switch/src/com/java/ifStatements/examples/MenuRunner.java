package com.java.ifStatements.examples;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter Number1 : ");
			int number1 = scanner.nextInt();
			System.out.println("The number you entered is - " + number1);

			System.out.print("Enter Number2 : ");
			int number2 = scanner.nextInt();
			System.out.println("The number you entered is - " + number2);

			System.out.println("Choose any of the following operations:");
			System.out.println(1 + " - add");
			System.out.println(2 + " - subtract");
			System.out.println(3 + " - multiply");
			System.out.println(4 + " - divide");

			System.out.print("Choosed operation : ");
			int operation = scanner.nextInt();

			System.out.println("Your choice are");
			System.out.println("Number1 " + number1);
			System.out.println("Number2 " + number2);
			System.out.println("choice : " + operation);

			performOperationUsingSwitch(number1, number2, operation);
		}
	}

	public static void performOperationUsingIfElse(int number1, int number2, int operation) {
			if (operation == 1) {
			System.out.println("Result = " + (number1 + number2));
		} else if (operation == 2) {
			System.out.println("Result = " + (number1 - number2));
		} else if (operation == 3) {
			System.out.println("Result = " + (number1 * number2));
		} else if (operation == 4) {
			System.out.println("Result = " + (number1 / number2));
		} else {
			System.out.println("Invalid operation");
		}
	}

	public static void performOperationUsingSwitch(int number1, int number2, int operation) {

			switch (operation) {
			case 1:
				System.out.println("Result = " + (number1 + number2));
				break;
			case 2:
				System.out.println("Result = " + (number1 - number2));
				break;
			case 3:
				System.out.println("Result = " + (number1 * number2));
				break;
			case 4:
				System.out.println("Result = " + (number1 / number2));
				break;
			default:
				System.out.println("Invalid Operation");
				break;
			}
		}


	}



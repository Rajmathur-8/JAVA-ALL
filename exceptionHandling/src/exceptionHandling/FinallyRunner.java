package exceptionHandling;

import java.util.Scanner;

public class FinallyRunner {
	public static void main(String[] args) {
		Scanner scanner= null;
			try {
				scanner = new Scanner(System.in);

		int[] a = { 12, 3, 4, 5 };
		int i = a[5];

	} catch (Exception ex) {
		ex.printStackTrace();
	} finally {
		System.out.println("Before Scanner Closed");
		if (scanner != null) {
			scanner.close();
		}
	}
	System.out.println("Just before closing out main");
	}
}

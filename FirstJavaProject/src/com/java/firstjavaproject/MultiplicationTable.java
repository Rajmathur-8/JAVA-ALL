package com.java.firstjavaproject;

public class MultiplicationTable {

	void multiplicationTable() {
		multiplicationTable(5);
	}
	void multiplicationTable(int table) {
		multiplicationTable(table, 1, 10);
	}

	void multiplicationTable(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}
}
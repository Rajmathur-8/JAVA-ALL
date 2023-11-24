package com.java.arraysAndArraylists;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student(" Raj ", 97, 98, 100);
		// Student student1 = new Student(" Aman ", 97, 100);
		// Student student2 = new Student(" Harsh ", 97, 98, 99, 100);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks " + number);

		int sum  = student.getTotalSumOfMarks();
		System.out.println("Total sum of marks is " + sum);

		int maximumMarks = student.getMaximumMarks();
		System.out.println("Maximum Mark is " + maximumMarks);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average marks is " + average);

		student.addNewMark(35);
		System.out.println(student);

		student.removeMarkAtIndex(1);
		System.out.println(student);

	}

}

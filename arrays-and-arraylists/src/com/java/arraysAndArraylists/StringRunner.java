package com.java.arraysAndArraylists;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thrusday",
				"Friday","Saturday"};
		String dayWithMostCharacters = "";
		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		System.out.println("Day with Most number of " + "character is " + dayWithMostCharacters);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}
	}



package com.java.oops.level2.inheritance;

public class Student extends Person {
	private String collegeName;
	private int year;

	public Student(String name, String collegeName) {
		super(name);
		this.collegeName = collegeName;
	}


	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegename(String collegename) {
		this.collegeName = collegename;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}

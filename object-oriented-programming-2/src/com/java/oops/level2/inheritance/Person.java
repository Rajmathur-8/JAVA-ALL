package com.java.oops.level2.inheritance;

public class Person extends Object {
	private String name;
	private String email;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public Person(String name) {
		// super();
		System.out.println("Person Constructor");
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

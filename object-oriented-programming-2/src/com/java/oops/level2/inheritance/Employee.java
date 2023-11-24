package com.java.oops.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {

	private String title;
	private String employee;
	private char employeeGrade;
	private BigDecimal salary;


	public Employee(String name, String title) {
		super(name);
		this.title = title;
		System.out.println("Employee Constructor");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return title = "#" + employee + "#" + employeeGrade + "#" + title + "#" + super.getEmail();
	}
}

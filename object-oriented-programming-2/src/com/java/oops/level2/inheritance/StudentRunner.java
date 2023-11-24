package com.java.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		/*
		 * Student student = new Student(); student.setName("Raj");
		 * student.setEmail("rajmathur9955@gmail.com");
		 *
		 * Person person= new Person(); String value = person.toString();
		 * System.out.println(value); System.out.println(person);
		 */

		Employee employee = new Employee("Rajesh", "Developer");
		employee.setEmployee("Rajesh");
		employee.setEmail("rajmathur9955@gmail.com");
		employee.setPhoneNumber("9646533232");
		employee.setEmployeeGrade('A');
		employee.setTitle("Developer");
		System.out.println(employee);
	}

}

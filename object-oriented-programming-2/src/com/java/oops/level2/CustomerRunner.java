package com.java.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line1", "Patna", "800001");
		Customer customer = new Customer("Rajiv", homeAddress);
		System.out.println(customer);

		Address workAddress = new Address("line1", "Bhubaneswar", "505515");
		customer.setHomeAddress(workAddress);
		System.out.println(customer);
	}

}

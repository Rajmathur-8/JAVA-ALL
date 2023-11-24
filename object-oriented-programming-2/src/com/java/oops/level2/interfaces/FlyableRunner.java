package com.java.oops.level2.interfaces;

interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("With Wings");
	}
}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("With fuel");
	}

}

public class FlyableRunner {
	public static void main(String[] args) {
		Flyable[] flyableObject = { new Bird(), new Aeroplane() };
		for (Flyable object : flyableObject) {
			object.fly();
		}

	}

}

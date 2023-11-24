package com.java.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 2.5, "black");
		fan.setSpeed((byte) 5);
		fan.switchOff();
		System.out.println(fan);

	}

}

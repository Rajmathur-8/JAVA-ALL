package com.java.oops.level2;

public class Fan {
	// states
	private String make;
	private double radius;
	private String colour;

	private boolean isOn;
	private byte speed;
	// creation
	public Fan(String make, double radius, String colour) {
		this.make = make;
		this.radius = radius;
		this.colour = colour;
	}

	// isOn
	public void switchOn() {
		this.isOn = true;
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// print the state
	@Override
	public String toString() {
		return String.format("Make - %s,Radius- %f,Colour - %s,isOn-%b ,Speed- %d", make, radius, colour, isOn, speed);
	}

}


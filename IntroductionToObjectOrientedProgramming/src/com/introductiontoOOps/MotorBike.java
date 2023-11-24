package com.introductiontoOOps;

public class MotorBike {
	// state
	private int speed;
	// behavior-->method,input(Speed),output(void),names(set)

	MotorBike(int speed) {
		this.speed=speed;
	}

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		if (speed > 0) {
			// System.out.println(speed);
			// System.out.println(this.speed);
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Bike started");
	}

	void stop() {

	}
}

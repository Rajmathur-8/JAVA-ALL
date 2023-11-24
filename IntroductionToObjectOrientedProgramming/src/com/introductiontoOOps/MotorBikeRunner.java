package com.introductiontoOOps;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(100);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.start();

		honda.start();
		ducati.setSpeed(100);
		ducati.increaseSpeed(100);
		ducati.decreaseSpeeed(50);
		System.out.println(ducati.getSpeed());

		honda.increaseSpeed(100);
		honda.decreaseSpeeed(30);
		System.out.println(honda.getSpeed());
		// ducati.setSpeed(40);
		// honda.setSpeed(0);
	}

}

package com.java.oops.level2;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw material");
		System.out.println("Get the utensils");
		System.out.println("Switch on the microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Get Stuff Ready");
		System.out.println("Put it in microwave");
	}

	@Override
	void cleanup() {
		System.out.println("cleanup the utensils");
		System.out.println("Switch off the microWave");
	}

}

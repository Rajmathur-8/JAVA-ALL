package com.java.oops.level2.interfaces;

public class GameRunner {

	public static void main(String[] args) {
//		MarioGame game = new MarioGame();
		GamingConsole game = new MarioGame();
		game.up();
		game.down();
		game.right();
		game.left();
	}

}

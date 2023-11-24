package com.java.loops;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquareUptoLimit() {
		int i = 1;
		while (i * i < limit) {

			System.out.print(i * i + " ");
			i++;
		}
	}

	public void printCubeUptoLimit() {
		int i = 1;
		while (i * i * i < limit) {
			System.out.println(i * i * i + " ");
			i++;
		}
	}

}

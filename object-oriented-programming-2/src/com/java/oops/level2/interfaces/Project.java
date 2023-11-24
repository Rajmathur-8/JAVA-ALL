package com.java.oops.level2.interfaces;

public class Project {
	public static void main(String[] args) {

		ComplexAlgorithm algorithm = new RealAlgorithm2();

		System.out.println(algorithm.complexAlgorithm(10, 20));
	}
}

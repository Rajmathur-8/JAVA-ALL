package com.java.primitivedatatype;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('1');
		System.out.println(myChar.isVowel());

		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		MyChar.printLowerCaseAlphabet();
		MyChar.printUpperCaseAlphabet();
	}

}

package com.codingProblems.examples;

public class StringExample {

	public static void main(String[] args) {

		String name = "Java12334";

		int charCount = 0;
		int intCount = 0;

		String converToLowercase = name.toLowerCase();

		for (int i = 0; i < converToLowercase.length(); i++) {

			char currentChar = converToLowercase.charAt(i);

			if (Character.isDigit(currentChar)) {
				intCount++;
			} else if (Character.isLetter(currentChar)) {
				charCount++;
			}

		}

		System.out.println("Number of Character : " + charCount);
		System.out.println("Number of Digits : " + intCount);
	}
}

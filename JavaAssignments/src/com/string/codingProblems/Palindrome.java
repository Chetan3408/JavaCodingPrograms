package com.string.codingProblems;

public class Palindrome {

	public static void main(String[] args) {

		String input = "mom";

		String reverse = new StringBuilder(input).reverse().toString();

		if (reverse.equals(input)) {
			System.out.println("It's Palindrome");
		} else {
			System.out.println("It's not Palindrome");
		}

	}

}

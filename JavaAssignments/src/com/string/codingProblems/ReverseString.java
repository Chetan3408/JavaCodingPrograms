package com.string.codingProblems;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Hello World";
		String reverse = new StringBuilder(input).reverse().toString();
		System.out.println(reverse);

	}
}

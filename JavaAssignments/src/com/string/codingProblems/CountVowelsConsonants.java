package com.string.codingProblems;

public class CountVowelsConsonants {

	public static void main(String[] args) {

		String input = "ChetanKamble";

		int intVowels = 0;
		int intConst = 0;

		for (char c : input.toLowerCase().toCharArray()) {

			if ("aeiou".indexOf(c) != -1) {
				intVowels++;
			} else if (Character.isLetter(c)) {
				intConst++;
			}
		}

		System.out.println("Number Of Vowels : " + intVowels);
		System.out.println("Number of Consonants : " + intConst);
	}

}

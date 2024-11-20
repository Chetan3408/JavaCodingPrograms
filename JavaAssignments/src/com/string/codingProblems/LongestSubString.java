package com.string.codingProblems;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {

		String input = "aacbccdebb";
		int maxLength = 0;
		String longestSubString = "";

		for (int i = 0; i < input.length(); i++) {
			HashSet<Character> seen = new HashSet<>();
			StringBuilder currentSubString = new StringBuilder();

			for (int j = i; j < input.length(); j++) {

				if (seen.contains(input.charAt(j))) {
					break;
				} else {
					seen.add(input.charAt(j));
					currentSubString.append(input.charAt(j));
				}
			}

			if (currentSubString.length() > maxLength) {
				maxLength = currentSubString.length();
				longestSubString = currentSubString.toString();
			}
		}

		System.out.println("Longest Sub String : " + longestSubString);
		System.out.println("Max Length of Sub String : " + maxLength);
	}

}

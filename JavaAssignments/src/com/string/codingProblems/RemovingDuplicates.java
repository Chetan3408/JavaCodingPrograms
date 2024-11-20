package com.string.codingProblems;

import java.util.LinkedHashSet;

public class RemovingDuplicates {

	public static void main(String[] args) {

		String str = "letters";

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (char c : str.toCharArray()) {
			set.add(c);
		}

		StringBuilder result = new StringBuilder();
		for (char c1 : set) {
			result.append(c1);
		}

		System.out.println("Removed Duplicates : " + result.toString());
	}

}

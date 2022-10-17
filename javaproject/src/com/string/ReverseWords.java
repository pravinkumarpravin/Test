package com.string;

public class ReverseWords {
	public static String reverseEachWordOfString(String inputString) {
		String[] words = inputString.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			String reverseWord = ReverseString.reverseString(words[i]);
			reverseString = reverseString + reverseWord + " ";
		}
		return reverseString.trim();
	}

	public static void main(String[] args) {
		String output = reverseEachWordOfString("India is my country");
		System.out.println(output);

	}

}

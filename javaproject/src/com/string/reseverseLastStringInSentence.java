package com.string;

public class reseverseLastStringInSentence {
	public static String reverseWord(String inputSentence) {
		String reverse = "";
		String lowerCaseSentence = inputSentence.toLowerCase();
		String[] array = lowerCaseSentence.split(" ");
		int endIndex = array.length - 1;
		for (int i = 0; i <= endIndex; i++) {
			if (i == endIndex) 
			{
				String reversedWord = extracted(array[i]);
				
				array[endIndex] = reversedWord;

			}
			reverse = reverse + array[i].concat(" ");
		}
		return reverse;
	}

	private static String extracted(String lastName) {
		char[] lastWord = lastName.toCharArray();
		String reversedWord = "";
		for (int j = lastWord.length-1; j >= 0; j--) {
			reversedWord = reversedWord + lastWord[j];
		}
		return reversedWord;
	}

	public static void main(String[] args) {
		String output = reverseWord("T20 WorldCup Happening in Australia");
		System.out.println(output);
	}
}
package com.string;

public class PalindromeUsingWhileLoop {
	public static boolean palindromeUsingWhileLoop(String inputString) {
		int i = 0, j = inputString.length() - 1;
		while (i < j) {
			if (inputString.charAt(i) != inputString.charAt(j)) {
				return true;
			}
			i++;
			j--;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean isPalindrome = palindromeUsingWhileLoop("malayalam");
		if (isPalindrome) {
			System.out.println("The Stirng is not Palindrome");
		} else {
			System.out.println("The String is Palindrome");
		}
	}
}
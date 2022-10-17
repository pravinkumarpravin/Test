package com.string;

import java.util.Scanner;

public class Palindrome {
	public static boolean palindrome(String input) {
		String reverse = ReverseString.reverseString(input);
		if (input.equalsIgnoreCase(reverse)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		boolean isPalindrome = palindrome(input);
		if (isPalindrome) {
			System.out.println(" String is Palindrome  ");
		} else {
			System.out.println("String is not Palindrome ");
		}
	}
}

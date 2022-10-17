package com.string;

public class ReverseString {
	public static String reverseString(String country) {
		String reverseCountry = "";
		char[] ch = country.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			reverseCountry = ch[i] + reverseCountry;
		}
		return reverseCountry;
	}

	public static void main(String[] args) {
		String str = reverseString("india");
		System.out.println("Reverse String : " + str);
	}
}

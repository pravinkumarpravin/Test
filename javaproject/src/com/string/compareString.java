package com.string;

public class compareString {

	public static void main(String[] args) {
		String str = "java Programming";
		String str1="java";
		int strlength = str.length();
		System.out.println("string lenght is " + strlength);
		char ch1 = str.charAt(0);
		System.out.println("character at 0th index is " + ch1);
		System.out.println("The character at last index is " + (strlength - 1));
		if(str.equals(str1))
		{
			System.out.println("the string is equal");
		}
		else
		{
			System.out.println("The string is not equal");
		}
	}

}

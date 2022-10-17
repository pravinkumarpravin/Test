package com.string;

public class StringMethods {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "Java Programming";

//System.out.println("compare : "+compare);
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.concat(str2));
		boolean contains = str1.contains("llo");
		System.out.println("contains : " + contains);
		String str3 = "javaguides";
		String str4 = "javatutorial";
		boolean equal = str3.equals(str4);
		System.out.println("both string equal: " + equal);
		boolean equalIgnoreCase = str4.equalsIgnoreCase("JAVATUTORIAL");
		System.out.println("both string equal :" + equalIgnoreCase);
		System.out.println(str1.substring(1, 7));
		boolean startsWith = str1.startsWith("He");
		System.out.println("startswith : " + startsWith);
		char[] result = str1.toCharArray();
		System.out.println("ToCharArray : " + result);
		System.out.println("Indexof : " + str1.indexOf(2));
		System.out.println("to upper case : " + str1.toUpperCase());
		System.out.println("to lower case : " + str1.toLowerCase());

	}

}

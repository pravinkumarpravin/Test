package com.methods;

import java.util.Scanner;

public class CheckWhetherSringIsPresent {
	public static boolean isStringPresentInArray(String[] array, String findString) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (findString.equals(array[i])) {
				count++;

				return true;
			}
		}
		return false;
	}
	public static int numberOfTimeStringPresent(String[] array,String findString) {
		int count=0;
		count++;
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of string");
		int length = sc.nextInt();
		String[] array = new String[length];
		for (int i = 0; i < array.length; i++) {
			sc = new Scanner(System.in);
			System.out.println("Enter the " + i + " string");
			String string = sc.nextLine();
			array[i] = string;
		}
		System.out.println("Enter the string to find");
		String findString = sc.nextLine();
		boolean isPresent = isStringPresentInArray(array, findString);
		if (isPresent) {
			System.out.println("The string is present");
		} else {
			System.out.println("The String is not present");
		}
		int count=numberOfTimeStringPresent(array, findString);
		System.out.println("The string present "+count+" time in the array");

	}

}

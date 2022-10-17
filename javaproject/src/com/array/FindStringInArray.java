package com.array;

public class FindStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "sathya", "kiruthiga", "sathya", "tharani", "pralavika" };
		String findString = "sathya";
		boolean isExist = false;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (findString == arr[i]) {
				isExist = true;
				count++;
			}
		}
		if (isExist == true) {
			System.out.println("The String is present");
			System.out.println("the String " + findString + " is present " + count + " times in the array");

		} else {
			System.out.println("the string not present");
		}
	}
}
package com.methods;

import java.util.Scanner;

public class FindTheNumberInArray {
	public static boolean TheNumberIsExistInArray(int[] array, int findNumber) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findNumber) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length = scanner.nextInt();
		int[] array = new int[length];
		for (int j = 0; j < array.length; j++) 
		{
			System.out.println("Enter the " + j + "th index number");
			int values = scanner.nextInt();
			array[j] = values;
		}
		System.out.println("Enter the number to find");
		int findNumber=scanner.nextInt();
			boolean IsExist = TheNumberIsExistInArray(array, findNumber);
			if (IsExist) {

				System.out.println("The number found");
			} else {
				System.out.println("The number not found");
			}

		}

	}



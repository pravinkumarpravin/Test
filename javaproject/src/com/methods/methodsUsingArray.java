package com.methods;

import java.util.Scanner;

public class methodsUsingArray {
	public static int[] getArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int length = sc.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + i + " index values");
			int numbers = sc.nextInt();
			array[i] = numbers;
		}
		return array;
	}

	public static int[] sortArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] > inputArray[j]) {
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		return inputArray;
	}

	public static void printArray(int[] sortArray) {
		for (int i = 0; i < sortArray.length; i++) {
			System.out.println(sortArray[i]);
		}
	}

	public static boolean findNumber(int[] array, int findNumber) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findNumber) {
				return true;
			}
		}
		return false;
	}

	public static int[] numberOfTimeNumberPresent(int[] array, int findnumber) {
		int count = 0;
		count++;
		return array;
	}

	public static int sumOfArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static int sumOfEvenNumbersInArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println("even numbers is " + array[i]);
				sum = sum + array[i];
			}
		}
		return sum;
	}

	public static int sumOfOddNumbersInArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println("odd numbers is " + array[i]);
				sum = sum + array[i];
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] inputArray = getArray();
		int[] sortedArray = sortArray(inputArray);
		printArray(sortedArray);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find");
		int findNumber = sc.nextInt();
		boolean isExist = findNumber(sortedArray, findNumber);
		if (isExist) {
			System.out.println("The number is found");
		} else {
			System.out.println("The number is not found");
		}

		int sum = sumOfArray(sortedArray);
		System.out.println("The sum of Array is " + sum);
		int evenNumbersSum = sumOfEvenNumbersInArray(sortedArray);
		System.out.println("The sum of even numbers in array is  " + evenNumbersSum);
		int oddNumbersSum = sumOfOddNumbersInArray(sortedArray);
		System.out.println("the sum of odd numbers in array is" + oddNumbersSum);

	}

}

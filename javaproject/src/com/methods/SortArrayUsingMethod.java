package com.methods;

import java.util.Scanner;

public class SortArrayUsingMethod {

	public static int[] prepareData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int length = sc.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + i + "th index value");
			int number = sc.nextInt();
			arr[i] = number;
		}

		return arr;
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

	public static void printArray(int[] sortedArray) {
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

	public static void main(String[] args) {
		int[] inputArray = prepareData();
		int[] sortedArray = sortArray(inputArray);
		printArray(sortedArray);
	}

}

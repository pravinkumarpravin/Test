package com.methods;

import java.util.Scanner;

public class SortArray {
	public static int[] sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int length = sc.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + i + "th index value");
			arr[i] = sc.nextInt();
		}
		System.out.println("sorting");
		sortArray(arr);
		printArray(arr);
	}
}

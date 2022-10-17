package com.array;

import java.util.Scanner;

public class SortArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element at " + i + "index");
			arr[i] = sc.nextInt();
					}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		
	}

}

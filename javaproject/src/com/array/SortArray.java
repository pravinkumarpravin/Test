package com.array;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 20, 11, 13, 14 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j <arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}

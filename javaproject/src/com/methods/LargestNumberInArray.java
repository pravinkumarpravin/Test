package com.methods;

public class LargestNumberInArray {
	public static int[] largestNumberInArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int k = i + 1; k < array.length; k++) {
				if(array[i]<array[k]) {
				int temp = array[i];
				array[i] = array[k];
				array[k] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = { 10, 5, 25, 6, 1, 2 };
		int[] maximumNumber = largestNumberInArray(array);
		System.out.println(maximumNumber[0]);
		System.out.println(maximumNumber[array.length-1]);
}
}

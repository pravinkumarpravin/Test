package com.string;

public class PushZeroToEndArray {
	public static int[] pushZeroToEndOfArray(int[] inputArray, int length) {
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				inputArray[count++] = inputArray[i];
			}
		}
		while (count < length) {
			inputArray[count++] = 0;
		}
		return inputArray;
	}

	public static void main(String[] args) {
		int[] inputArray = { 10, 0, 2, 10, 3, 0, 6 };
		int[] output = pushZeroToEndOfArray(inputArray, 7);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}
}

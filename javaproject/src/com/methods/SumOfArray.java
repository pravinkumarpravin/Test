package com.methods;

public class SumOfArray {
	public static int sumOfArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static int sumOfEvenNumberArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			boolean isEven = OddorEven.isEvenNo(array[i]);
			if (isEven) {
				sum = sum + array[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int array[] = { 2, 3, 4, 5 };
		int sum = sumOfArray(array);
		int sumEven = sumOfEvenNumberArray(array);
		System.out.println(sum);
		System.out.println(sumEven);
	}

}

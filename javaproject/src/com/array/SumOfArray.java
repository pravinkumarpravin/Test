package com.array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = { 2, 3, 4, 5, 6, 7 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
	}
}

package com.methods;

public class SumOfFirstTenEvenNumbers {
	public static int sumOfFirstTenEvenNumbers(int endNumber) {
		int sum = 0, i = 0;
		do {
			sum = sum + i;
			i = i + 2;
		} while (i < endNumber);
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenNumberSum = sumOfFirstTenEvenNumbers(20);
		System.out.println(evenNumberSum);
	}

}

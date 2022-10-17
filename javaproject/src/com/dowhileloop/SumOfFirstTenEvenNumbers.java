package com.dowhileloop;

public class SumOfFirstTenEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum = 0;
		do {
			sum = sum + num;
			num = num + 2;

		} while (num <= 10);
		System.out.println(sum);
	}

}

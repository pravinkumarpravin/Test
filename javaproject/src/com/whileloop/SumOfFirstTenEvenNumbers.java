package com.whileloop;

public class SumOfFirstTenEvenNumbers {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while (i <= 20) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;	
		}
		System.out.println(sum);
	}
}

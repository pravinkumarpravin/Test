package com.methods;

public class FirstTwentyOddNumbers {
	public static int firstTwentyOddNumbers(int endNumber) {
		for (int i = 0; i < endNumber; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		return endNumber;
	}

	public static void main(String[] args) {
		int isOddNo = firstTwentyOddNumbers(19);
		System.out.println(isOddNo);
	}

}

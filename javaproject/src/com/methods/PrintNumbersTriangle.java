package com.methods;

public class PrintNumbersTriangle {
	public static void printNumbersTriangle(int row) {
		int count = 0;
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}

			for (int j = row; j >= i; j--) {
				System.out.println("   ");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		printNumbersTriangle(2);

	}

}

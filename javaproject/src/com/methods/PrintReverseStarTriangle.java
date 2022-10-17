package com.methods;

public class PrintReverseStarTriangle {
	public static void printReverseStarTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= i; j--) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("   ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printReverseStarTriangle(5);

	}

}

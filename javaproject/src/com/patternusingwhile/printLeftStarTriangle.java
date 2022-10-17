package com.patternusingwhile;

public class printLeftStarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		while (row <= 5) {
			for (int col = 2 * (5 - row); col >= 1; col--) {
				System.out.println("  ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(" *");
			}
			System.out.println();
			row++;
		}
	}

}

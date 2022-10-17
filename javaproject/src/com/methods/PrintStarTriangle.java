package com.methods;

public class PrintStarTriangle {
	public static void printStarTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			for(int j=row;j>=i;j--) {
				System.out.println(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printStarTriangle(3);

	}

}

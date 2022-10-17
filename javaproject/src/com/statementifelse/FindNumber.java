package com.statementifelse;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("the number is less than zero");
			// sc.nextInt();

		} else if ((num <= 0) || (num <= 100)) {
			System.out.println("the number is between 1 to 100");

		} else if ((num >= 101) && (num <= 200)) {
			System.out.println("the number is between 101 to 200");

		} else {
			System.out.println("the number is greater than 200");

		}
	}
}

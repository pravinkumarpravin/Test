package com.statementifelse;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = input.nextInt();
		if (num % 2 != 1) {
			System.out.println("The number is Even");
		} else {
			System.out.println("The number is Odd");
		}

	}
}

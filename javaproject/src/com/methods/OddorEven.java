package com.methods;
import java.util.Scanner;

public class OddorEven {

	public static boolean isEvenNo(int input) {
		if (input % 2 == 0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		boolean isEven = isEvenNo(number);

		if (isEven) {
			System.out.println(number + " is even");

		} else {
			System.out.println(number + " is odd");
		}
	}

}

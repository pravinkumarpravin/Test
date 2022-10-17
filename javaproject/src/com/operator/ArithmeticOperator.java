package com.operator;

import java.util.Scanner;

public class ArithmeticOperator {
	static int num1, num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num1 = input.nextInt();
		System.out.println("Enter the number");
		int num2 = input.nextInt();
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
		input.close();
	}

}

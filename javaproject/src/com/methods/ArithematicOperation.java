package com.methods;

public class ArithematicOperation {
	public static int addition(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public static int subtract(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	public static int multiply(int num1, int num2) {
		int mul = num1 * num2;
		return mul;
	}
	public static float divide(int num1, int num2) {
		float div = num1 / num2;
		return div;
	}

	public static void main(String[] args) {
		int add = addition(10,20);
		int sub = subtract(30,20);
		int mul = multiply(10,2);
		float div = divide(9,2);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}
}

package com.array;

import java.util.Scanner;

public class SwapTwoVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two variable a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a + "," + "b=" + b);

	}

}

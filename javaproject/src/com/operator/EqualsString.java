package com.operator;

import java.util.Scanner;

public class EqualsString {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = sc.nextLine();
		if (name.equals("sathya")) {
			System.out.println("The name is:" + name);
		} else if (name.equals("vinoth")) {
			System.out.println("the name is:" + name);

		} else {
			System.out.println("xxx");
		}

	}
}
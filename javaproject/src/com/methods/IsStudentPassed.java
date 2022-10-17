package com.methods;

import java.util.Scanner;

public class IsStudentPassed {
	public static boolean isStudentPassed(int[] array, int passMark) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < passMark) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		int noOfSubjects = scanner.nextInt();
		int[] marks = new int[noOfSubjects];
		for (int i = 0; i < marks.length; i++) {
			System.out.println("enter the " + i + " subject marks");
			int mark = scanner.nextInt();
			marks[i] = mark;
		}
		System.out.println("enter the passmark");
		int passMark=scanner.nextInt();
		boolean studentPassed = isStudentPassed(marks, passMark);
		if (studentPassed) {
			System.out.println("The Student is Passed");
		} else {
			System.out.println("The Student is failed");
		}
	}
}
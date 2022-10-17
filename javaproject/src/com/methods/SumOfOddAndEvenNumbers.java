package com.methods;

import java.util.Scanner;

public class SumOfOddAndEvenNumbers {
	public static int sumOfEvenNumbers(int startNumber,int endNumber) {
		int sum = 0;
		if(startNumber>endNumber) {
			int temp=startNumber;
			startNumber=endNumber;
			endNumber=temp;
		}
		for (int i = startNumber; i <= endNumber; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
	public static int sumOfOddNumbers(int startNumber,int endNumber) {
		int sum = 0;
		if(startNumber>endNumber) {
			int temp=startNumber;
			startNumber=endNumber;
			endNumber=temp;
		}
		for (int i = startNumber; i <= endNumber; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the startnumber:");
		int startNumber=sc.nextInt();
		System.out.println("Enter the endnumber:");
		int endNumber=sc.nextInt();
		int sumOfEven = sumOfEvenNumbers(startNumber, endNumber);
		System.out.println(sumOfEven);
		int sumOfOdd=sumOfOddNumbers(startNumber, endNumber);
		System.out.println(sumOfOdd);
	}

}

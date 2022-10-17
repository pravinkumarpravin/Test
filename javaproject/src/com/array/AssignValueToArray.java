package com.array;

import java.util.Scanner;

public class AssignValueToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length :");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the" + i + "th index value");
			arr[i] = sc.nextInt();

		}
		for(int i=0;i<arr.length;i++)
		{
System.out.println("the elements present in "+i+"th index is"+arr[i]);
	}

}
}

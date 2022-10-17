package com.array;

public class AssignValuesToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[5];
		array[0] = 2;
		array[1] = 3;
		array[2] = 4;
		array[3] = 5;
		array[4] = 6;
		printNumbers(array);

	}

	private static void printNumbers(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}

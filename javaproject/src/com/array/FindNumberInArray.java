package com.array;

public class FindNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isExist = false;
		int numbers[] = { 2, 3, 4,4,5, 6, 7, 5 };
		int findnumber = 4;
		for (int i = 0; i < numbers.length; i++) {
			if (findnumber == numbers[i]) {
				isExist = true;
				break;
			}
		}

		if (isExist == true) {
			System.out.println(" the number is present");
		} else {
			System.out.println("the number not found");
		}
	}
}

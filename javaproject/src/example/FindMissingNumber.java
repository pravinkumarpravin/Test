package example;

import java.util.Scanner;

public class FindMissingNumber {
	int n;
	int sumofn;
	int missingnumber;
	
	public FindMissingNumber(int n) {
		sumofn = (n*(n+1))/2;
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] array = new int[n-1];
		for(int i = 0;i<n-1;i++) {
			System.out.println("enter the numbers" + i);
			int values = sc.nextInt();
			array[i] = values;
			sum = sum + array[i];
		}
		if (sum != sumofn) {
			missingnumber = sumofn - sum;
		}
	}
	public static void main(String[]args) {
		FindMissingNumber num = new FindMissingNumber(4);
		System.out.println(num.missingnumber);
	}

}

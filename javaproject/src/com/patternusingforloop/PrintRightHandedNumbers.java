package com.patternusingforloop;

public class PrintRightHandedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=5;
int count=1;
for(int i=1;i<=rows;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(count+" ");
		count++;
	}
	System.out.println();
	
}
	}

}

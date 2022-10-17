package com.patternusingwhile;

public class ToPrintRightTriangleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=1;
int count=1;
while(row<=5) {
	for(int col=1;col<=row;col++) {
		System.out.print(count+"  ");
		count++;
	}
	System.out.println();
	row++;
}
	}

}

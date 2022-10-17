package com.patternusingwhile;

public class ToPrintRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=1;
while(rows<=5) {
	for(int col=1;col<=rows;col++) {
		System.out.print("*");
	}
	System.out.println();
	rows++;
}
	}

}

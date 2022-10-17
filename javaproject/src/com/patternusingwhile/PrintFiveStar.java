package com.patternusingwhile;

public class PrintFiveStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		while(row<=5){
			for(int col=1;col<=5;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		row++;
		}
	}

}

package com.operator;

public class UnaryOperator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1,y=2;
		int z=x++ + y--;
		int k=++x;
		int a=--y * x-- + y++;
		System.out.println("z is:"+z);
		System.out.println("k is:"+k);
		System.out.println("a is:"+a);
		System.out.println("x is:"+x+" "+"y is:"+y);
		
		

	}

}

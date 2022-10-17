package com.methods;

public class IncrementByTwo {
	public static int incrementByTwo(int x)
	{
		return x+2;
	}
	public static void main(String[] args) {
		int x=incrementByTwo(3);
		System.out.println("The incremented value is : "+ x);
	}

}

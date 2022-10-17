package com.statementifelse;

import java.util.Scanner;

public class ConditionStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value i is:");
		int i=input.nextInt();
		
		if(i>=5){
			if(i!=10)
				{
			System.out.println("i is greater ");
		}
		else if(i==15)
		{
		System.out.println("i is equal");	

	}
		else
		{
			System.out.println(" i is smaller");
		}

input.close();
}
}
}

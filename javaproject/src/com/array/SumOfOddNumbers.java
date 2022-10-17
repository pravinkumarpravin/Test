package com.array;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numbers[]= {2,3,4,5,6,7};
int sum=0;
for(int i=0;i<numbers.length;i++) {
	if(numbers[i]%2!=0)
	{
	sum=sum+numbers[i];	
	}
}
System.out.println(sum);
	}

}

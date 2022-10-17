package com.array;

public class PrintNumberOfTimeTheNumberPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]= {2,4,4,5,6,7,8,9};
int findnumber=4;
int total=0;
for(int i=0;i<array.length;i++) {
	if(findnumber==array[i]) {
		total++;
	}
}
		System.out.println("The number " +findnumber+ " is present "+total+" times ");
	}

}

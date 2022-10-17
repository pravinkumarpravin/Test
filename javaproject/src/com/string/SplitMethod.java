
package com.string;

public class SplitMethod {
	public static String splitInputString(String inputString) {
		String[] input=inputString.split("a");
		for (int i = 0; i < input.length; i++) {
			
		}
		return inputString;
	}

	public static void main(String[] args) {
		String output=splitInputString("sathya vinothkumar");
		System.out.println(output);
		}

}

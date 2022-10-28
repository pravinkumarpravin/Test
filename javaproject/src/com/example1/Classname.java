package com.example1;


public class Classname {
	public void printnumber() {
		try
		{
			System.out.println("beforeexception");
			int i = 10/0;
			System.out.println("afterexception");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("");
		}
	}
	public static void main(String[]args)
	{
		
		Classname a = new Classname();
		a.printnumber();
		System.out.println("hey");
	}
	}

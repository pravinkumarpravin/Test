package Repeatingstring;

public class Repeatingcharacter {
	public static String Repeatingcharacter(String word)
	{
		char repeated = ' ';
		char[] name =word.toCharArray();
		for(int i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i] == name[j])
				{
					repeated = name[i];
				}
			}
		}
		String output = String.valueOf(repeated);
		return output;
	}
	public static void main(String[]args)
	{
		System.out.println(Repeatingcharacter("geekforgeeks"));
	}

}

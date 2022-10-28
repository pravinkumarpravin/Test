package BufferReadingProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReading {
	public static void main(String[]args)   {	
		String filename = "C:\\Users\\Selvakumar\\JavaProject\\New Text Document.txt";
		File file = new File(filename);
		FileInputStream fr = null;
		try {
			fr = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		InputStreamReader in = new InputStreamReader(fr);
		BufferedReader br = new BufferedReader(in);
		
		String line;
		try {
			while((line = br.readLine()) !=null)
			{
				System.out.println(line);
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

} 

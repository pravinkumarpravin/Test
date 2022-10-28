package FileReading;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx {
	public static void main(String[]args) throws IOException{
		String filename = "C:\\Users\\Selvakumar\\JavaProject\\New Text Document.txt";
		File file = new File(filename);
		FileInputStream fr = new FileInputStream(file);
		InputStreamReader in = new InputStreamReader(fr);
		BufferedReader br = new BufferedReader(in);
		
		String line;
		while((line = br.readLine()) !=null)
		{
			System.out.println(line);
			}
		}
		

}

package FileReading;

public class BufferReading {
	public static void main(String args[]) {
		StringBuffer str = new StringBuffer("wel come");
		System.out.println(str);
		System.out.println(str.append("to my world"));
		System.out.println(str.insert(0,"hai"));
		System.out.println(str.length());
		System.out.println(str.indexOf("to"));
		System.out.println(str.charAt(8));
		System.out.println(str.substring(5));
		System.out.println(str.subSequence(7,12));
		
	}

}

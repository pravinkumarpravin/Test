package example;

public class Choclate {
	public static int NumberOfChoclate(int rupees, int price,int wrapperchoclate) {
		int choclate , wrappers;
		choclate = rupees / price;
		wrappers = choclate;
		while (wrappers >= wrapperchoclate) {
			int extrachoclate = wrappers / wrapperchoclate;
			choclate = extrachoclate + choclate;
			int extrawrappers = wrappers % wrapperchoclate;
			wrappers = extrawrappers + extrachoclate;
		}
		return choclate;
	}

	public static void main(String[] args) {
		System.out.println(NumberOfChoclate(100,3,3));
 	}

} 
  
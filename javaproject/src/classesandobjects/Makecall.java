package classesandobjects;

public class Makecall {
	String name;
	String color;
	int ram;
	float size;
	int prize;
	String processor;
	long no;
	public void makecall(long no) {
		System.out.println("call");
		
	}
	public Makecall()
	{
		System.out.println();
	}
	public Makecall(String name1,String color1)
	{
		this.name = name1;
		this.color = color1;
	}
	public static void main(String[]args)
	{
		Makecall m1 = new Makecall();
		System.out.println(m1.name);
		m1.makecall(904374567l);
		Makecall m2 = new Makecall("vivo","gray");
		System.out.println(m2.name);
		System.out.println(m2.color);
		
	}
}


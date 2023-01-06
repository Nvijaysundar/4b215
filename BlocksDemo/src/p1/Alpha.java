package p1;
public class Alpha {
	Alpha()
	{
		System.out.println("This is Constructor");
	}
	static
	{
		System.out.println("This is Static block");
	}
	static void m1()
	{
		System.out.println("This is m1 static method");
	}
	{
		System.out.println("THis is Instance Block");
	}
	public static void main(String[] args) {	
		m1();
		Alpha ob = new Alpha();
		System.out.println(ob);
	}
}








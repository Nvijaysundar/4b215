package staticmemebrs;

public class B extends A{
	static int y = 100;
	
	static 
	{
		System.out.println("This is Cc static block");
	}
	
	static void m2()
	{
		System.out.println("This is s -m2()");
	}
	public static void main(String[] args) {
		B.m2();
		m1();
	}

}

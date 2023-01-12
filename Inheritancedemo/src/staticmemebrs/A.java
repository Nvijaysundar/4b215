package staticmemebrs;

public class A {
	static int x = 100;
	
	static 
	{
		System.out.println("This is static block");
	}
	
	static void m1()
	{
		System.out.println("This is s -m1()");
	}
}

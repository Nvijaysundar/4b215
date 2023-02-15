package p1;

public abstract class Execution {
	public Execution() {
		System.out.println("This is Constructor");
	}
	abstract void m1();
	
	{
		System.out.println("This is I-Block");
	}
	
	static
	{
		System.out.println("This is S-Block");
	}
	void m2() {
		System.out.println("This is m2 method");
	}
}

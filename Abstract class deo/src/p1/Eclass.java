package p1;

public class Eclass extends Execution {
	void m1()
	{
		System.out.println("This is OVerridden");
	}
	public static void main(String[] args) {
		Eclass ob = new Eclass();
		ob.m1();
		ob.m2();
	}
}

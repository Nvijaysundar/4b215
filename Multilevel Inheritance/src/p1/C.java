package p1;

public class C extends B {
	void m3()
	{
		System.out.println("This is m3 Class C");
	}
	public static void main(String[] args) {
		
		C ob = new C();
		ob.m1();
		ob.m2();
		ob.m3();
	}

}

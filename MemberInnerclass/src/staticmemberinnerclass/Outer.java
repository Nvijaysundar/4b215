package staticmemberinnerclass;
public class Outer {
	static int x=110;
	int y =115;
	static void m1()
	{
		System.out.println("This is M1 method");
	}
	static class Inner
	{
		static int a =10;
		int b = 15;
		static void inn1()
		{
			//System.out.println("B: "+b);
			System.out.println("A: "+a);
			m1();
			System.out.println("x: "+x);
		}
		
		void inn2()
		{
			System.out.println("B: "+b);
			System.out.println("A: "+a);
			m1();
			System.out.println("x: "+x);
			//System.out.println("y: "+y);
		}
	}
	public static void main(String[] args) {
		Outer.Inner ob = new Outer.Inner();
		ob.inn2();
		Outer.Inner.inn1();
	}
}

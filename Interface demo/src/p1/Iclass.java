package p1;
public class Iclass implements Itest1 {
	public void m1()
	{
		System.out.println("This is overridden method of Interface");
	}
	public void m2()
	{
		System.out.println("This is m2 method");
	}
	public static void main(String[] args) {
		Iclass ob = new Iclass();
		ob.m1();
		ob.m2();
	}
}

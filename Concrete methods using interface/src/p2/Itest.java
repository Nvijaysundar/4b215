package p2;
public interface Itest {
	void m1();//abstract method
	private static void m2()
	{
		System.out.println("THis is m2 method");
	}
	private void m3()
	{
		System.out.println("This is m3 method");
	}
	default void access()
	{
		this.m3();
		Itest.m2();
	}
}






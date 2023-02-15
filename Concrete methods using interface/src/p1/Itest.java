package p1;
public interface Itest {
	void m1();//abstract method
	static void m2()
	{
		System.out.println("THis is m2 method");
	}
	default void m3()
	{
		System.out.println("This is m3 method");
	}
}

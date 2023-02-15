package p1;
public interface Itest1 {
	void m1();
	static void m2()
	{
		System.out.println("THis is Itest1 m2");
	}
	default void m3()
	{
		System.out.println("THis is ITest1 m3");
	}
}

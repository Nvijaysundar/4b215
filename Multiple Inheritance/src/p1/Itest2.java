package p1;
public interface Itest2 {
	void m1();
	static void m2()
	{
		System.out.println("This is m2 ITest2");
	}
	default void m3()
	{
		System.out.println("This Itest2 D-con");
	}
}

package p1;

public class Iclass implements Itest {

	@Override
	public void m1() {
	System.out.println("THis is m1 method");
	}

	public static void main(String[] args) {
		Iclass ob = new Iclass();
		ob.m1();
		ob.m3();
		Itest.m2();
	}
}

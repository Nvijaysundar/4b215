package p2;
public class B extends A implements I {

	public void x() {
		System.out.println("This is x method");
	}
	
	public static void main(String[] args) {
		B ob = new B();
		ob.x();
	}

}

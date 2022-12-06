package p1;

public class Main {
	static int i=10;//static
	int j=20;//instance
	public static void main(String[] args) {
		int c=30;//local
		Main ob = new Main();
		System.out.println("I: "+i);
		System.out.println("ob-j: "+ob.j);
		System.out.println("C: "+c);	
		Main.i +=100;
		ob.j += 200;
		System.out.println("I: "+Main.i);
		System.out.println("ob-j: "+ob.j);
		Main ob2 = new Main();
		System.out.println("I: "+Main.i);
		System.out.println("ob2-j: "+ob2.j);
	}}

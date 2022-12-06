package p1;
public class Var {
	static int i=10;//static
	int j= 20;//instance
	public static void main(String[] args) {
	int c = 30;//local
	Var ob = new Var();
	System.out.println("I:: "+ i);
	System.out.println("J:: "+ob.j);
	System.out.println("C:: "+c);
	Var.i += 100;
	ob.j +=200;
	System.out.println("I:: "+ Var.i);
	System.out.println("J:: "+ob.j);
	Var ob2 = new Var();
	System.out.println("I:: "+ Var.i);
	System.out.println("J:: "+ob2.j);
	}}

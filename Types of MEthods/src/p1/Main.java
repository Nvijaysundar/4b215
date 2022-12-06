package p1;

public class Main {
	int a =121,b =13;
	static void add()
	{
		Main ob = new Main();
		System.out.println("Add: "+ (ob.a+ob.b));
		ob = null;
	}
	int diff(int a, int b)
	{
		return a-b;
	}
	static double mul(int a,int b)
	{
		return a*b;
	}
	
	void div()
	{
		System.out.println("Div: "+ (a/(float)b));
	}
	static void rem(int a, int b)
	{
		System.out.println("rem :: "+ (a%b));
	}
	public static void main(String[] args) {
		add();
		Main ob = new Main();
		System.out.println("Diff" +ob.diff(ob.a, ob.b));
		System.out.println("Mul:: "+ mul(45,65));
		ob.div();
		rem(ob.a,ob.b);
		

	}

}

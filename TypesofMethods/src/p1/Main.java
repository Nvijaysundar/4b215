package p1;

public class Main {
	static double add(int a,int b)
	{
		return a+b;
	}
	void sub()
	{
		int a=30,b=40;
		System.out.println("diff:  "+(a-b));
	}
	static void mul()
	{
		int a =40,b=10;
		System.out.println("mul:: "+(a*b));
	}
	float div(int a,int b)
	{
		return a/(float)b;
	}
	static int rem()
	{
		int a=40,b=3;
		return a%b;
	}
	public static void main(String[] args) {
		
		System.out.println("ADD::"+Main.add(15, 56));
		new Main().sub();
		Main.mul();
		System.out.println("Div:: "+new Main().div(45, 3));
		System.out.println("REm: "+Main.rem());

	}

}

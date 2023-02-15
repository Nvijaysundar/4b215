package p1;
public class DemoC extends Demop{
	DemoC(int x,int y)
	{
		super(x);
		System.out.println("This is 2p Con");
	}
	DemoC(int x,int y,int Z)
	{
		this(x,y);
		System.out.println("This is 3 parameter Con");
	}
	
	public static void main(String[] args) {
		new DemoC(1,2,3);
	}

}

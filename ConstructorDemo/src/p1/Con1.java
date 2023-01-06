package p1;
public class Con1 {
	int ab;
	Con1(int x)
	{
		ab =x;
		System.out.println("X: "+ab);
	}
	public static void main(String[] args) {
		Con1 ob = new Con1(1000);
	}
}

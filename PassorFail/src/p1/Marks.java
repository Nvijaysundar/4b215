package p1;
public class Marks {
	int totalmarks,fcount;
	public Marks(int Tmarks,int failcount)
	{
		totalmarks = Tmarks;
		fcount = failcount;
	}
	public void getResult()
	{
		System.out.println("Percentage: "+(totalmarks/6.0f));
		if(fcount==0)
			System.out.println("PASS");
		else
			System.out.println("Fail");
	}
}

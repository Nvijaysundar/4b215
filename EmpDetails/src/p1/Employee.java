package p1;

public class Employee {
	String Name,Desg;
	float bsal;
	public void Setdata(String Name,String Desg,float bsal)
	{
		this.Name = Name;
		this.Desg = Desg;
		this.bsal = bsal;
	}
	public void getData()
	{
		System.out.println("Name: "+Name);
		System.out.println("Desg: "+Desg);
		System.out.println("TotalSal: "+(bsal+ 0.23f*bsal
						+ 0.27f*bsal));
	}
}

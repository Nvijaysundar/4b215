package p1;

public class Address {
	String Hno,Stname,City;
	int pin;
	
	public void SetData(String Hno,String Stname,String City,
					int pin)
	{
		this.Hno = Hno;
		this.Stname = Stname;
		this.City = City;
		this.pin = pin;
	}
	public void getData() {
		System.out.println("Address: "+Hno+"\t"
							+Stname+"\t"+City+"\t"+pin);
	}
}

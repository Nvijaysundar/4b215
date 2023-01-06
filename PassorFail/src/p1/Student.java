package p1;
public class Student {
	String Name;
	long Rollno;
	public Student(String Sname, long Srollno)
	{
		Name = Sname;
		Rollno = Srollno;
	}
	public void getData()
	{
		System.out.println("Name: "+Name);
		System.out.println("ROllno: "+Rollno);
	}
}

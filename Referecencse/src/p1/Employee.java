package p1;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Employee {
	Techskills ob = null; //new TechSkills();
	String Name,Desg,EMpid,Branch;
	public Employee(Techskills ob)
	{
		this.ob = ob;
	}
	
	public void SetData(Scanner sc)
	{
		System.out.println("Enter Name: ");
		Name = sc.nextLine();
		System.out.println("Enter DEsg: ");
		Desg = sc.nextLine();
		System.out.println("Enter Empid: ");
		EMpid = sc.nextLine();
		System.out.println("ENter Branch: ");
		Branch = sc.nextLine();
		System.out.println("Enter Backend Lang: ");
		ob.BE_lang = sc.nextLine();
		System.out.println("Enter FrontEnd Lang: ");
		ob.Fr_lang = sc.nextLine();
		System.out.println("Enter Tools: ");
		ob.Tools = sc.nextLine();
	}
	public void getData()
	{
		StringTokenizer st = null;
		System.out.println("Name: "+Name);
		System.out.println("Desg: "+Desg);
		System.out.println("Empid: "+EMpid);
		System.out.println("BRanch: "+Branch);
		System.out.println("Backend Languages: ");
		st = new StringTokenizer(ob.BE_lang,",");
		int i=1;
		while(st.hasMoreTokens())
		{
			System.out.println(i++ +")"+st.nextToken());
		}
		System.out.println("FrontEnd Languages: ");
		st = new StringTokenizer(ob.Fr_lang,",");
		i=1;
		while(st.hasMoreTokens())
		{
			System.out.println(i++ +")"+st.nextToken());
		}
		System.out.println("Tools: ");
		st = new StringTokenizer(ob.Tools,",");
		i=1;
		while(st.hasMoreTokens())
		{
			System.out.println(i++ +")"+st.nextToken());
		}
		
	}
}

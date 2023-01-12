package p1;

import java.util.Scanner;

public class Read {
	public Read(Scanner sc, Student st)
	{
		System.out.println("Enter Name: ");
		st.Name = sc.nextLine();
		System.out.println("Enter Rollno: ");
		st.Rollno = sc.nextLine();
		System.out.println("Enter Branch: ");
		st.BRanch = sc.nextLine();
		while(true) {
			System.out.println("Enter Emailid: ");
			st.c.Emailid = sc.nextLine();
			if(st.c.Emailid.contains("@")&&st.c.Emailid.contains("."))
			{
				System.out.println("Email Verified");
				break;
			}
			else
				System.err.println("Enter Valid Emailid");
		}
		System.out.println("Enter phno: ");
		st.c.phno = Long.parseLong(sc.nextLine());
		System.out.println("Enter Hno: ");
		st.ad.Hno = sc.nextLine();
		System.out.println("Enter Stname: ");
		st.ad.Stname = sc.nextLine();
		System.out.println("Enter city: ");
		st.ad.City = sc.nextLine();
		System.out.println("enter Pincode");
		st.ad.pincode = Integer.parseInt(sc.nextLine());
		
		for(int i=1,sub;i<=6;i++)
		{
			System.out.println("Enter Sub"+i+" Marks: ");
			sub = Integer.parseInt(sc.nextLine());
			st.m.totalmarks += sub;
			if(sub<40)
				st.m.failsub ++;
		}
	}
}

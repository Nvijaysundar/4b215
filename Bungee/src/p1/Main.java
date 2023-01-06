package p1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age,wt;
		System.out.println("Enter Age:");
		age = sc.nextInt();
		if(age>=18 && age<=60)
		{
			System.out.println("ENter Height:");
			if(sc.nextFloat()>=4.8f)
			{
				System.out.println("Enter Weight:");
				wt= sc.nextInt();
				if(wt>=50&& wt<=120)
				{
					if(wt>=80)
						System.out.println("Add Extra Ropes");
					System.out.println("Eligible");
				}
				else
					System.out.println("Not Eligible. REason: Weight Limit");
			}
			else
				System.out.println("Not Eligible. REason: Height limit");
		}
		else if(age>=13 && age<=17)
		{
			System.out.println("ENter Height:");
			if(sc.nextFloat()>=4.2f)
			{
				System.out.println("Enter Weight:");
				wt= sc.nextInt();
				if(wt>=40&& wt<=60)
				{
					System.out.println("Eligible");
				}
				else
					System.out.println("Not Eligible. REason: Weight Limit");
			}
			else
				System.out.println("Not Eligible. REason: Height limit");
		}
		else
		{
			System.out.println("Not Eligible. Reason: Age Limit");
		}
		sc.close();	
	}
}

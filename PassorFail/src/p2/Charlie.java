package p2;
import java.util.Scanner;
import p1.*;
public class Charlie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String Nam= sc.nextLine();
		System.out.println("Enter Roll");
		long rol = sc.nextLong();
		Student st = new Student(Nam,rol);
		int sub, sum =0,fc=0;
		for(int i=1;i<=6;i++)
		{
			System.out.println("Enter sub"+i+" Marks:");
			sub = sc.nextInt();
			sum += sub;
			if(sub<40)
				fc++;
		}
		Marks m = new Marks(sum,fc);
		st.getData();
		m.getResult();
		st = null;
		m = null;
		sc.close();
	}

}

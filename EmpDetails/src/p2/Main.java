package p2;
import java.util.*;
import p1.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		Address ad = new Address();
		System.out.println("Enter Name: ");
		String N = sc.nextLine();
		System.out.println("Enter Desg: ");
		String D = sc.nextLine();
		System.out.println("ENter Bsal: ");
		float bsal = Float.parseFloat(sc.nextLine());
		e.Setdata(N, D, bsal);
		System.out.println("Enter Hno:");
		String Hno = sc.nextLine();
		System.out.println("Eter Stname: ");
		String st = sc.nextLine();
		System.out.println("ENter City: ");
		String C = sc.nextLine();
		System.out.println("Enter Pin: ");
		int pin = sc.nextInt();
		ad.SetData(Hno, st, C, pin);
		e.getData();
		ad.getData();
		
		
	}

}

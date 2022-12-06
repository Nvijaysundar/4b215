package p1;
import java.util.*;
public class Product {
	String Code,Name;
	int qty;
	float price;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Product p = new Product();
	System.out.println("Enter Code::");
	p.Code = sc.nextLine();
	System.out.println("Enter Name::");
	p.Name = sc.nextLine();
	System.out.println("Enter Qty::");
	p.qty = sc.nextInt();
	System.out.println("Enter Price");
	p.price = sc.nextFloat();
	System.out.println("Name : "+p.Name);
	System.out.println("Code : "+p.Code);
	System.out.println("Qty : "+p.qty);
	System.out.println("Price : "+p.price);
	sc.close();
	}

}

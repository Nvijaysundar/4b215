package p2;
import p1.Product;
import java.util.*;
public class ProductArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] p = new Product[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter new Product Details:");
			String Name = sc.nextLine();
			String Code = sc.nextLine();
			int qty = Integer.parseInt(sc.nextLine());
			float price = Float.parseFloat(sc.nextLine());
			p[i]= new Product(Name, Code, qty, price);
		}
		System.out.println("Name\tCode\tQty\tPrice");
		for(int i=0;i<p.length;i++)
			p[i].getData();
		
		System.out.println("Name\tCode\tQty\tPrice");
		for(Product temp: p)
			temp.getData();
		sc.close();
	}}






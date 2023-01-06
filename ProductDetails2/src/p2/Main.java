package p2;
import java.util.*;
import p1.Product;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noofelements = Integer.parseInt(sc.nextLine());
		String N,C;
		int q;
		float pr;
		Product[] Data = new Product[noofelements];
		for(int i = 0 ;i<noofelements;i++)
		{
			System.out.println("Enter Product "+(i+1)+"Details");
			N = sc.nextLine();
			C = sc.nextLine();
			q = Integer.parseInt(sc.nextLine());
			pr = Float.parseFloat(sc.nextLine());
			Data[i]	=new Product(N, C, q, pr);
		}
		for(Product temp : Data)
				temp.getData();
	}
}

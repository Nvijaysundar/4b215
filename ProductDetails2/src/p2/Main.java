package p2;
import java.util.*;
import p1.Product;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String C = sc.nextLine();
		int q = sc.nextInt();
		float pr = sc.nextFloat();
		Product p = new Product();
		p.setData(N, C, q, pr);
		p.getData();
	}
}

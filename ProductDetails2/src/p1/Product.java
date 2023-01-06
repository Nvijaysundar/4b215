package p1;
public class Product {
	String Code,Name;
	int qty;
	float price;
	public  Product(String pname,String pcode,
						int pqty,float pprice )
	{
		Code = pcode;
		Name = pname;
		qty = pqty;
		price = pprice;
	}
	public void getData()
	{
		System.out.println("Code: "+Code);
		System.out.println("Name: "+Name);
		System.out.println("qty: "+qty);
		System.out.println("price: "+price);
	}
}

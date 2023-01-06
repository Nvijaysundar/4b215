package p1;
public class Product {
		String name,code;
		int qty;
		float price;
		public Product(String name, String code,int qty,float price)
		{
			this.name = name;
			this.code = code;
			this.qty = qty;
			this.price = price;
		}
		
		public void getData()
		{
			System.out.println(name+"\t"+code+"\t"+qty+"\t"+price);
		}
}

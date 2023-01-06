package stringBuffer;
public class Gamma {
	public static void main(String[] args) {
		StringBuffer ob = new StringBuffer();
		System.out.println(ob.capacity());
		System.out.println(ob.length());
		ob.append("Java");
		System.out.println(ob.capacity());
		System.out.println(ob.length());
		ob.append("Programming Language");
		System.out.println(ob.capacity());
		System.out.println(ob.length());
		ob.setCharAt(6,'a');
		System.out.println(ob.toString());
		ob.insert(7, "HEllo");
		System.out.println(ob.toString());
		ob.reverse();
		System.out.println(ob);
	}
}

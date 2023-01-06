package anonymousrarray;
public class OnjectArray {
	public static void main(String[] args) {
		Object[] ob = new Object[3];
		
		ob[0] = new Integer(125);
		ob[1] = new String("Java");
		ob[2] = new Product("Mouse","A121",45,456.85f);
		
		System.out.println(ob[0]);
		System.out.println(ob[1]);
		((Product)ob[2]).getData();

	}

}

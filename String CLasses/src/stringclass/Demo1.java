package stringclass;
public class Demo1 {
	public static void main(String[] args) {
		String st = "JAVA";
		String str = "LAnguage";
		String st2 = st.concat(str);
		for(int i= 0;i<st2.length();i++)
		{
			System.out.println(i+" : "+st2.charAt(i));
		}
		System.out.println(st2.endsWith("age"));
		String st3 = st2.replace("a","HELLO");
		System.out.println(st3.toString());
		String st4 = st2.replaceAll("[JAV]","Python");
		System.out.println(st4);
		System.out.println(st4.contains("Python"));
	}
}








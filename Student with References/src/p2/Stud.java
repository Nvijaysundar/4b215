package p2;
import p1.*;
import java.util.*;
public class Stud {

	public static void main(String[] args) {
		Student st = new Student(new Address(), new Contact(),new Marks());
		Read r = new Read(new Scanner(System.in), st);
		Out o = new Out(st);
	}

}

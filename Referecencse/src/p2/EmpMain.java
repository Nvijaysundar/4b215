package p2;
import p1.*;
import java.util.Scanner;
public class EmpMain {

	public static void main(String[] args) {
	Employee e = new Employee(new Techskills());
	e.SetData(new Scanner(System.in));
	e.getData();
	

	}

}

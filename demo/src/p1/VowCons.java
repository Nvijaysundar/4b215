package p1;
import java.util.*;
public class VowCons {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char ch  = sc.nextLine().charAt(0);
	switch(ch)
	{
	case 'A':
	case 'a':
	case 'E':
	case 'e':
	case 'I':
	case 'i':
	case 'U':
	case 'u':
	case 'O':
	case 'o':
		System.out.println("Vowel");
		break;
	default:
		System.out.println("Consonent");
	}
	sc.close();
	}

}

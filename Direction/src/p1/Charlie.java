package p1;
import java.util.*;
public class Charlie {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
		int dir,sum=0;
		for(;;)
		{
			System.out.println("Enter 1.left or -1.right or 0.end");
			dir = sc.nextInt();
			if(dir==1||dir==-1)
				sum+=dir;
			else if(dir==0)
				break;
			else
			{
				System.out.println("Enter 1 or -1 or 0 only ");
				continue;
			}
		}
		System.out.println("Sum: "+sum);
		switch(sum%4)
		{
		case 0:
			System.out.println("EAST");
			break;
		case -1:
		case 3:
			System.out.println("South");
			break;
		case 2:
		case -2:
			System.out.println("West");
			break;
		default:
			System.out.println("NORTH");
		}
		}
	}

}

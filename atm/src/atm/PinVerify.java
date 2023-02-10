package atm;
import java.util.Scanner;
public class PinVerify {
	Scanner sc = new Scanner(System.in);
	int Verify(){
		int chances = 3;
		
		while(chances>=1) {
			System.out.println("Enter Pin: ");
			int pin = sc.nextInt();
			if(pin==1111||pin==2222||pin==3333) {
				System.out.println("Pin Verified");
				return 0;
		    }
			else {
				System.out.println("Wrong PIN!\n");
				System.out.println("Left Chances: "+--chances+"\n");
				if(chances==0) {
					System.out.println("\n Invalid Three chances\n PIN BLOCKED!");
					System.exit(0);
				}
			}
		}
		return -1;
	}
}


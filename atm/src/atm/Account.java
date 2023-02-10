package atm;
import java.util.Scanner;
public class Account {
	Scanner sc = new Scanner(System.in);
	public void acc(){
		System.out.println("Enter Account No(15 Digits): ");
		long accno = sc.nextLong();
		String acc_no = Long.toString(accno);
		if(acc_no.length()==15) {
			System.out.println("Enter your name: ");
			String name = sc.next();
			System.out.println("Hello "+name+"! \nYour Account no: "+accno);
			PinVerify p = new PinVerify();
			p.Verify();
			
			Balance b = new Balance();
			Withdraw w = new Withdraw();
			Deposit d = new Deposit();
			while(true) {
				System.out.println("1.Balance\n2.Withdraw\n3.Deposit\n4.exit\nSelect Option: ");
				int ch = sc.nextInt();
				switch(ch) {
				case 1:
					b.getbal();
					break;
				case 2:
					System.out.println("Enter amount(in multiples of 100): ");
					int wamt = sc.nextInt();
					w.process(wamt);
					break;
				case 3:
					System.out.println("Enter amount(in multiples of 100: ");
					int damt = sc.nextInt();
					d.process(damt);
					break;
				case 4:
					System.out.println("Thanks! Visit Again.");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Entry!");
				}
			}
		}
		else {
			System.out.println("Enter Account number correctly (with 15 digits)!");
		}
	}
	//sc.close();
}

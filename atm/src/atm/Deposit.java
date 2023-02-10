package atm;

public class Deposit implements Transaction {
	public void process(int amt) {
		if(amt%100 == 0) {
			if(amt>=500) {
				Balance.Bal = Balance.Bal + amt;
				System.out.println("Your amount "+amt+"rs is deposited.");
				B.getbal();
			}
			else {
				System.out.println("You can't deposit less than 500 rs!");
			}
		}
		else {
			System.out.println("Enter an amount multiple of 100!");
		}
	}
}

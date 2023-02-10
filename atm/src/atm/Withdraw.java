package atm;

public class Withdraw implements Transaction {
	public void process(int amt) {
		if(amt%100 == 0) {
			if(amt <= Balance.Bal) {
				if(Balance.Bal-amt>500) {
					Balance.Bal = Balance.Bal-amt;
					System.out.println("Your "+amt+"rs were successfully withdrawn.");
					B.getbal();
				}
				else {
					System.out.println("You should have a minimum balance of 500 every time!");
				}
			}
			else {
				System.out.println("Insufficient Balance!");
			}
		}
		else {
			System.out.println("Enter an amount multiple of 100");
		}
	}
}

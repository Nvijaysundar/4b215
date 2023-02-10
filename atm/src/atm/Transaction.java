package atm;

public interface Transaction {
	Balance B = new Balance();
	void process(int amt);
}

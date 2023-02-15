package mainexecution;
import executiontask.*;
public class Execute {
	public static void main(String[] args) {
	
		new Thread(new Task1()).start();
			
		Task2 on = new Task2();
		Thread t2 = new Thread(on);
		t2.start();
	}

}

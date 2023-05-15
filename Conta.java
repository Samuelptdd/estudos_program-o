
public class Conta {

	private int number;
	private String holder;
	private double balance ;
	
	public Conta() {
		
	}
	

	public Conta(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Conta(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}


	public void deposit(double amount) {
		balance += amount;
}
	
	public void withDraw(double amount) {
		balance -= amount + 5.00;
	}



	public String toString() {
		return "Conta { number=" + number + ", holder=" + holder + ", balance=" + balance + " }";
	}
	
	
	
}

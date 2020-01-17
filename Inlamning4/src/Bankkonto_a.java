public class Bankkonto_a {

	private String nbr;
	private double balance;
	
	public String getNbr() {
		return nbr;
	}
	public void setNbr(String nbr) {
		this.nbr = nbr;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public void credit(double amount) {
		this.balance = balance + amount;
	}
	public void withdraw(double amount) {
		this.balance = balance - amount;
	}

}
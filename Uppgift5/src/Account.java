public class Account {
	
	private String nr;
	private double balance;
	private Person owner = null;

	public void setOwner(Person owner) {
		this.owner= owner;
	}
	public Person getOwner() {
		return owner;
	}
	public void setNr(String nr) {
		this.nr=nr;
	}
	public String getNr() {
		return nr;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void credit(double amount) {
		if(amount>0) {
			this.balance+=amount;
		}
		else System.out.println("Beloppet får inte vara negativt.");
	}
	public void withdraw(double amount) {
		if (amount<0) {
		this.balance-=amount;
		}
		else System.out.println("Beloppet måste vara negativt.");
}
}
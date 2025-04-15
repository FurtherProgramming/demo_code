package lectorials.week07;

public class Account {
	//attributes
	private String accountID;
	private String accountName;
	private double balance;
	
	//constructor
	public Account() {
		this.accountID = "empty";
	}
	
	public Account(String id, String name) {
		this.accountID = id;
		this.accountName = name;
		this.balance = 0.0;
	}
	
	public Account(String id, String name, double balance) {
		this.accountID = id;
		this.accountName = name;
		this.balance = balance;
	}
	
	// getter
	public String getID(){
		return this.accountID;
	}
	public double getBalance() {
		return this.balance;
	}

	// setter
	public void setID(String newID) {		
		this.accountID = newID;
	}
	
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	@Override
	public String toString() {
		return this.accountID + "|" + this.accountName + "|" + this.balance;
	}
	
	public void withdraw(double amount) {
		System.out.println("Withdrawing from Account class!");
	}
	
	public boolean deposit(double amount) {
		this.balance += amount;
		return true;
	}
	
	public void addInterest(double rate) {
		if(rate <= 0) {
			throw new IllegalArgumentException();
		}else {
			this.balance += this.balance * rate;
		}
	}

}
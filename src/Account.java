import java.util.Random;

public abstract class Account {

	private int id;
	private static int lastId = 0;
	protected double balance;
	private double commision = 0;
	private long accountNumber;

	public Account() {
		this.id = lastId + 1;
		lastId = id;
		this.accountNumber = generateAccountNum();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public int getId() {
		return id;
	}

	long generateAccountNum() {
		Random random = new Random();
		long accountNum = random.nextLong() / 1000;
		if (accountNum < 0)
			accountNum *= -1;
		return accountNum;
	}

	@Override
	public String toString() {
		return id + " - Account  number: " + accountNumber + " has balance: " + balance;
	}

	public abstract void calculateCommission();

}
import java.util.Random;

public class Bank {
	private double balance;
	private long accountNumber;

	public Bank(BankBuilder bankBuilder) {
		this.balance = bankBuilder.balance;
		this.accountNumber = generateAccountNum();
	}

	// depositing money
	public void depositMoney(double amount) {
		balance += amount;
	}

	// withdrawing money
	public void withdrawMoney(double amount) {
		balance -= amount;
	}

	// checking balance(get)
	public double checkBalance() {
		return balance;
	}

	@Override
	public String toString() {
		String acc = Long.toString(accountNumber);
		String s = acc.substring(0, 4) + "-" + acc.substring(4, 8) + "-" + acc.substring(8, 12) + "-"
				+ acc.substring(12, acc.length());

		return "Account number " + s + " Balance " + balance;
	}

	long generateAccountNum() {
		Random random = new Random();
		long accountNum = random.nextLong() / 1000;
		if (accountNum < 0)
			accountNum *= -1;
		return accountNum;
	}

	// BUILDER FACTORY PATTERN
	public static class BankBuilder {
		private double balance;
		private long accountNumber;

		public BankBuilder setBalance(double balance) {
			this.balance = balance;
			return this;
		}

		public Bank build() {
			return new Bank(this);
		}
	}

}
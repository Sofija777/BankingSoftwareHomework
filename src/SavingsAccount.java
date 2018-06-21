
public class SavingsAccount extends Account {

	private double commision = 0.03;

	public double getPercentageCommision() {
		return commision;
	}

	public void setPercentageCommision(double percentageCommision) {
		this.commision = commision;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
		this.calculateCommission();
	}
	
	@Override
	public void calculateCommission() {
		super.setBalance(getBalance() + getBalance() * commision);
	}

	@Override
	public String toString() {
		return getId() + " - Account  number: " + getAccountNumber() + " has balance: " + getBalance() + ", with added commision of " + commision*100 + "% on savings account";

	}
	
	
}

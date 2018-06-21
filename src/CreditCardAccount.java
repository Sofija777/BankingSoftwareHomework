
public class CreditCardAccount extends Account {
	
	private long creditCardNumber;
	private double commision = -30;

	
	public CreditCardAccount() {
		creditCardNumber = generateAccountNum();
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}

	@Override
	public void calculateCommission() {
		super.setBalance(getBalance() + commision);
	}

	@Override
	public String toString() {
		String acc = Long.toString(creditCardNumber);
		String s = acc.substring(0, 4) + "-" + acc.substring(4, 8) + "-" + acc.substring(8, 12) + "-"
				+ acc.substring(12, acc.length());

		
		return getId() + " - Account  number: " + getAccountNumber() + " has balance: " + getBalance() + ", with commision " + commision*-1 + "mkd, on credit card number " + s;

	}
}

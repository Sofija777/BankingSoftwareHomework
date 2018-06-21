
public class CurrentAccount extends Account {
	
	private double commision = -10;;

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
		return getId() + " - Account  number: " + getAccountNumber() + " has balance: " + getBalance() + ", with commision " + commision*-1 + "mkd";

	}

}
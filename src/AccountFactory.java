//FACTORY DESIGN PATTERN
public class AccountFactory {
	
	public static Account getAccount(String type){
		if(type.equals(AccountType.CreditCardAccount)) 
			return new CreditCardAccount();
		else if(type.equals(AccountType.SavingsAccount)) 
			return new SavingsAccount();
		else if(type.equals(AccountType.CurrentAccount)) 
			return new CurrentAccount();
		
		return null;
	}

}

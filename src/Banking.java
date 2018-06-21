
public class Banking {

	public static void main(String[] args) {

		// CREATING OBJECT USING BUILDER
		Bank b = new Bank.BankBuilder().setBalance(1200).build();
		System.out.println(b);

		b.depositMoney(1000.00);
		System.out.println("balance after deposit " + b.checkBalance());

		b.withdrawMoney(250);
		System.out.println("balance after withdraw " + b.checkBalance());
		
		
		
		System.out.println();
		System.out.println();
		
		//Account
		Account a1 = new CreditCardAccount();
		a1.setBalance(500);
		System.out.println(a1);
		
		Account a2 = new SavingsAccount();
		a2.setBalance(1500);
		System.out.println(a2);
		
		Account a3 = new CurrentAccount();
		a3.setBalance(200);
		System.out.println(a3);
		
		System.out.println();
		
		
		//used Factory Design Pattern
		Account a = AccountFactory.getAccount("SavingsAccount");
		a.setBalance(5000);
		System.out.println(a);

	}

}

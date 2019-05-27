
public class SavingsAccount extends BankAccount {
	public SavingsAccount(double balance, double interest) {
		super(balance, interest);
		active(balance);
	}

	private boolean status;
	
	public void deposit(double amount) {
		super.deposit(amount);
		active(balance);
		
		if(status)
			System.out.println("Account restored to active status!");
	}

	public void withdraw(double amount) {
		
		if(status)
			super.withdraw(amount);
		else
			System.out.println("Not enough money in account!");
		active(balance);
	}
	
	public void monthlyProcess() {
		if(deposits>4)
		{
			monthlyCharge=deposits-4;
		}
		super.monthlyProcess();
			
		active(balance);
			
	}
	
	public void active(double balance)
	{
		if(balance<25)
			status=false;
		else
			status=true;
	}
	
	
}


public class BankAccount {
	private double balance;
	
	public BankAccount(double balance)
	{
		this.balance=balance;
	}
	public BankAccount(BankAccount obj)
	{
		balance=obj.balance;
	}
	
	public String toString()
	{
		return "The balance is :: "+balance;
	}
}



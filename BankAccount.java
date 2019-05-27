
public abstract class BankAccount {

	private double interest;
	protected double balance;
	protected int deposits=0, withdrawals=0, monthlyCharge=0;
	public BankAccount(double balance, double interest)
	{
		this.balance=balance;
		this.interest=interest;
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
		deposits++;
	}
	public void withdraw(double amount)
	{
		balance=balance-amount;
		withdrawals++;
	}
	public void calcInterest()
	{
		double monthlyRate=interest/12;
		double monthlyInterest=balance*monthlyRate;
		balance=balance+monthlyInterest;
	}
	public void monthlyProcess()
	{
		balance=balance-monthlyCharge;
		calcInterest();
		monthlyCharge=0;
		withdrawals=0;
		deposits=0;
	}
}

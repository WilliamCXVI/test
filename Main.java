
public class Main {
	public static void main(String[] args)
	{
		BankAccount Object1 = new BankAccount(100);
		BankAccount Object2 = new BankAccount(200);
		
		System.out.println("Object1 - "+Object1);
		System.out.println("Object2 - "+Object2);
		
		Object2 = new BankAccount(Object1);
		
		System.out.println("Object1 - "+Object1);
		System.out.println("Object2 - "+Object2);
	}
}

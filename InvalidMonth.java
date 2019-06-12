
public class InvalidMonth extends Exception {

	public InvalidMonth()
	{
		super("Error: Invalid Month");
	}
	
	public InvalidMonth(int number)
	{
		super("Error: Invalid Month number: "+number);
	}
	
	public InvalidMonth(String s)
	{
		super("Error: Invalid Month name: "+s);
	}
}

import java.util.Scanner;
public class MonthMain {

	public static void main(String[] args)
	{
	Month m1=new Month(), m2=new Month();
	Scanner keyboard = new Scanner(System.in);
	String input;
	boolean success=false;
	char repeat='n';
	char enter;
	int tempInput;
	do {
		success=false;
		System.out.println("FIRST MONTH:: ");
		do {
			System.out.println("Enter by month number?");
			input=keyboard.nextLine();
			if(isYesNo(input)==false)
			System.out.println("Invalid input!");
			}while(isYesNo(input)==false);
			
		enter=input.charAt(0);
		
		if(enter=='y')
		{
			System.out.println("Enter the month number:: ");
			input=keyboard.nextLine();
			tempInput=Integer.valueOf(input);
			try 
			{
			m1.setMonthNumber(tempInput);
			}
			catch(InvalidMonth e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("Enter the month name:: ");
			input=keyboard.nextLine();
			try
			{
				m1.Month(input);
			}
			catch(InvalidMonth e)
			{
				System.out.println(e.getMessage());
			}
		}
			
		
		
		System.out.println("SECOND MONTH:: ");
		do {
			System.out.println("Enter by month number?");
			input=keyboard.nextLine();
			if(isYesNo(input)==false)
			System.out.println("Invalid input!");
			}while(isYesNo(input)==false);
			
		enter=input.charAt(0);
		
		if(enter=='y')
		{
			System.out.println("Enter the month number:: ");
			input=keyboard.nextLine();
			tempInput=Integer.valueOf(input);
			try
			{
				m2.setMonthNumber(tempInput);
			}
			catch(InvalidMonth e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("Enter the month name:: ");
			input=keyboard.nextLine();
			try
			{
				m2.Month(input);
			}
			catch(InvalidMonth e)
			{
				System.out.println(e.getMessage());
			}
		}
			

		// OUTPUT
		if(success)
		{
			System.out.println("FIRST MONTH:: "+m1);
			System.out.println("SECOND MONTH:: "+m2);
			System.out.println("The first month is "+getRelation(m1,m2)+" the second month.");
		}
		else
		{
			System.out.println("The program has been provided invalid inputs.");
		}
		do {
			System.out.println("Repeat the program?");
			input=keyboard.nextLine();
			if(isYesNo(input)==false)
			System.out.println("Invalid input!");
			}while(isYesNo(input)==false);
			
		repeat=input.charAt(0);
		
	}while(repeat=='y');
	keyboard.close();
}
	
	
	
	// Error checking
	public static boolean isYesNo(String input)
	{
		if(input.length()==1)
		{
			// debug System.out.println("checkpoint");
			if(input.equals("y")||input.equals("n"))
			{
				//debug System.out.println("checkpoint");
				return true;
			}
		}
		return false;
	}

	public static String getRelation(Month object1, Month object2)
	{
		String output="";
		if(object1.equals(object2))
			output="equals= to";
		if(object1.lessThan(object2))
			output="less than";
		if(object1.greaterThan(object2))
			output="greater than";
		return output;
	}
}
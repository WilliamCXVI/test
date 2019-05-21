import java.util.Scanner;
public class MonthMain {

	public static void main(String[] args)
	{
	Month m1=new Month(), m2=new Month();
	Scanner keyboard = new Scanner(System.in);
	String input;
	char repeat='n';
	char enter;
	int tempInput;
	do {
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
			do {
				System.out.println("Enter the month number:: ");
				input=keyboard.nextLine();
				if(isInteger(input)==false)
				System.out.println("Invalid input!");
			}while(isInteger(input)==false);
			
			tempInput=Integer.valueOf(input);
			m1.setMonthNumber(tempInput);
		}
		else
		{
			do {
				System.out.println("Enter the month name:: ");
				input=keyboard.nextLine();
				if(isMonth(input)==false)
				System.out.println("Invalid input!");
			}while(isMonth(input)==false);
			m1.Month(input);
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
			do {
				System.out.println("Enter the month number:: ");
				input=keyboard.nextLine();
				if(isInteger(input)==false)
				System.out.println("Invalid input!");
			}while(isInteger(input)==false);
			
			tempInput=Integer.valueOf(input);
			m2.setMonthNumber(tempInput);
		}
		else
		{
			do {
				System.out.println("Enter the month name:: ");
				input=keyboard.nextLine();
				if(isMonth(input)==false)
				System.out.println("Invalid input!");
			}while(isMonth(input)==false);
			m2.Month(input);
		}
			

		// OUTPUT
		
		System.out.println("FIRST MONTH:: "+m1);
		System.out.println("SECOND MONTH:: "+m2);
		System.out.println("The first month is "+getRelation(m1,m2)+" the second month.");
		
		do {
			System.out.println("Repeat the program?");
			input=keyboard.nextLine();
			if(isYesNo(input)==false)
			System.out.println("Invalid input!");
			}while(isYesNo(input)==false);
			
		repeat=input.charAt(0);
		
	}while(repeat=='y');
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
	
	public static boolean isInteger(String input)
	{	
		if(input.length()==0)
			return false;
		for(int index = 0; index<input.length(); index++)
		{
			switch(input.charAt(index)) 
			{
				case '0':
				break;
				case '1':
				break;
				case '2':
				break;
				case '3':
				break;
				case '4':
				break;
				case '5':
				break;
				case '6':
				break;
				case '7':
				break;
				case '8':
				break;
				case '9':
				break;
				default:
					//debug:: System.out.println("checkpoint");
				return false;
				
			}
		}
		return true;
	}
	
	public static boolean isMonth(String MonthName)
	{
		boolean bool=true;
		switch(MonthName)
		{
		case "January":
		break;
		case "February":
		break;
		case "March":
		break;
		case "April":
		break;
		case "May":
		break;
		case "June":
		break;
		case "July":
		break;
		case "August":
		break;
		case "September":
		break;
		case "October":
		break;
		case "November":
		break;
		case "December":
		break;
		default:
		bool = false;
		}
		return bool;
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


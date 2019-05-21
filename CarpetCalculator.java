import java.util.Scanner;
public class CarpetCalculator {
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		char repeat;
		String input;
		double tempInput1, tempInput2;
		RoomDimension rd;
		RoomCarpet rc;
		do {
			System.out.println("Enter the dimensions of the room:: ");
			System.out.println("Length:: ");
			do {
				input=keyboard.nextLine();
				if(isDouble(input)==false)
				System.out.println("Invalid input!");
			}while(isDouble(input)==false);
			
			tempInput1=(Double.valueOf(input));
			
			System.out.println("Width:: ");
			do {
				input=keyboard.nextLine();
				if(isDouble(input)==false)
				System.out.println("Invalid input!");
			}while(isDouble(input)==false);
			tempInput2=(Double.valueOf(input));
			rd = new RoomDimension(tempInput1,tempInput2);
			
			System.out.println("Enter the cost in dollars per square foot:: ");
			System.out.println("Cost:: ");
			do {
				input=keyboard.nextLine();
				if(isDouble(input)==false)
				System.out.println("Invalid input!");
			}while(isDouble(input)==false);
			
			tempInput1=(Double.valueOf(input));
			
			rc = new RoomCarpet(rd,tempInput1);
			
			System.out.println(rd);
			System.out.println(rc);
			
			do {
			System.out.println("Repeat the program?");
			input=keyboard.nextLine();
			if(isYesNo(input)==false)
			System.out.println("Invalid input!");
			}while(isYesNo(input)==false);
			
			repeat=input.charAt(0);
		}while(repeat=='y');
	}
	
	
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
	

	public static boolean isDouble(String input)
	{	
		if(input.length()==0)
			return false;
		for(int index = 0; index<input.length(); index++)
		{
			switch(input.charAt(index)) 
			{
				case '.':
				break;
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
}

import java.util.Scanner;
public class LandTractMain {

	public static void main(String[] args)
	{
	LandTract lt1=new LandTract(), lt2=new LandTract();
	Scanner keyboard = new Scanner(System.in);
	String input;
	char repeat='n';
	double tempInput;
	do {
		
		System.out.println("Enter the dimensions of the first land track:: ");
		System.out.println("Length:: ");
		do {
			input=keyboard.nextLine();
			if(isDouble(input)==false)
			System.out.println("Invalid input!");
		}while(isDouble(input)==false);
		
		tempInput=Double.valueOf(input);
		lt1.setLength(tempInput);
		
		System.out.println("Width:: ");
		do {
			input=keyboard.nextLine();
			if(isDouble(input)==false)
			System.out.println("Invalid input!");
		}while(isDouble(input)==false);

		tempInput=Double.valueOf(input);
		lt1.setWidth(tempInput);
		
		System.out.println("Enter the dimensions of the second land track:: ");
		System.out.println("Length:: ");
		do {
			input=keyboard.nextLine();
			if(isDouble(input)==false)
			System.out.println("Invalid input!");
		}while(isDouble(input)==false);
		
		tempInput=Double.valueOf(input);
		lt2.setLength(tempInput);
		
		System.out.println("Width:: ");
		do {
			input=keyboard.nextLine();
			if(isDouble(input)==false)
			System.out.println("Invalid input!");
		}while(isDouble(input)==false);

		tempInput=Double.valueOf(input);
		lt2.setWidth(tempInput);
		
		// OUTPUT
		
		System.out.println("LAND TRACT 1::"+"\n"+lt1+"\n");
		System.out.println("LAND TRACT 2::"+"\n"+lt2+"\n");
		
		if(lt1.equals(lt2))
			System.out.println("The two land tracts are identical!");
		else
			System.out.println("The two land tracts are different.");
		
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
}


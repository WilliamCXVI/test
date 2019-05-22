import java.util.Scanner;
public class VCMain {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		VowelsAndConsonants VC;
		String input, inputString;
		int selection = 0;
		
		
		
		System.out.println("VOWEL AND CONSONANT CALCULATOR");
		System.out.println("______________________________");
		System.out.println("Enter a string:: ");
		inputString=keyboard.nextLine();
		do {
			do {
				System.out.println("");
				System.out.println("Enter a menu option:: ");
				System.out.println("1) Count the number of vowels in the string");
				System.out.println("2) Count the number of consonants in the string");
				System.out.println("3) Count both the vowels and consonants in the string");
				System.out.println("4) Enter another string");
				System.out.println("5) Exit the program");
				input=keyboard.nextLine();
				if(!isInteger(input))
					System.out.println("Invalid input:: not an integer!");
				else if(Integer.parseInt(input)>5||Integer.parseInt(input)<1)
					System.out.println("Invalid input:: integer out of range!");
			}while(!isInteger(input)||Integer.parseInt(input)>5||Integer.parseInt(input)<1);
			
			selection = Integer.parseInt(input);
			
			switch(selection) {
			case 1:
			VC = new VowelsAndConsonants(inputString);
			System.out.println("The number of vowels in string "+inputString+" is "+VC.vowels());
			break;
			case 2:
			VC = new VowelsAndConsonants(inputString);
			System.out.println("The number of consonants in the string "+inputString+" is "+VC.consonants());
			break;
			case 3:
			VC = new VowelsAndConsonants(inputString);
			System.out.println("The number of letters in the string "+inputString+" is "+( VC.vowels()+VC.consonants() ));
			break;
			case 4:
			System.out.println("Enter a new string:: ");
			inputString=keyboard.nextLine();
			VC = new VowelsAndConsonants(inputString);
			System.out.println("Your string:: "+inputString);
			break;
			case 5:
			System.out.println("Program terminated...");
			System.exit(0);
			}
		}while(selection!=5);
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

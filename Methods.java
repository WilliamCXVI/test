import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Methods 
{
	public static void main(String[] args) throws IOException
	{	///////////////////////////////////////
		Scanner keyboard = new Scanner(System.in);
		String input,input1,input2,output;
		double futureValue,interestRate,years;
		PrintWriter outputFile;
		int choiceInteger = 0,inputInteger;
		char repeat = 'n';
		do
		{
			/** Flush memory */
			input="";
			input1="";
			input2="";
			choiceInteger=0;
			inputInteger=0;
			repeat = 'n';
			/////////////////////
			
			
			/** Introductory output */
			System.out.println("\n"+"\n"+"\n"+"Methods Program! ");
			System.out.println("________________");
			System.out.println("");
			System.out.println("Choose a program:: ");
			System.out.println("1)   showChar "+"\n"+"         given an index of a string, prints out index of that string."+"\n"+"2)   primeNumberList "+"\n"+"         print out all prime numbers from 1-chosen number in an output file."+"\n"+"3)   presentValue"+"\n"+"         get present value of bank account.");
			//////////////////////////
			/** error checking */
			input=keyboard.nextLine();
			// debug:: System.out.println(input);
			while(isInteger(input)==false)
			{
				System.out.println("Invalid Input!");
				input=keyboard.nextLine();
			}
			choiceInteger=Integer.valueOf(input);
			
			/** switch for all methods */
			switch(choiceInteger)
			{
				case 1:
					System.out.println("Using showChar method:: "+"\n"+"\n");
					System.out.println("Enter a string:: ");
					input1=keyboard.nextLine();
					System.out.println("Enter an integer:: ");
					input2=keyboard.nextLine();
					while(isInteger(input2)==false)
					{
						System.out.println("Invalid input!");
						input2=keyboard.nextLine();
					}
					inputInteger=Integer.valueOf(input2);
					showChar(input1,inputInteger);
				break;
				case 2:
					System.out.println("Using primeNumberList method:: "+"\n"+"\n");
					System.out.println("Enter an integer:: ");
					input2=keyboard.nextLine();
					while(isInteger(input2)==false)
					{
						System.out.println("Invalid input!");
						input2=keyboard.nextLine();
					}
					inputInteger=Integer.valueOf(input2);
					output=PrimeList(inputInteger);
					outputFile=new PrintWriter("src/PrimeNumberListOutput.txt");
					outputFile.print(output);
					outputFile.close();
				break;
				case 3:
					System.out.println("Using presentValue method:: "+"\n"+"\n");
					
					System.out.println("Enter F, the future value (in $/dollars):: ");
					input=keyboard.nextLine();
					while(isDouble(input)==false)
					{
						System.out.println("Invalid input!");
						input=keyboard.nextLine();
					}
					futureValue=Double.valueOf(input);
					
					System.out.println("Enter r, the annual interest rate (how much percent):: ");
					input=keyboard.nextLine();
					while(isDouble(input)==false)
					{
						System.out.println("Invalid input!");
						input=keyboard.nextLine();
					};
					interestRate=Double.valueOf(input)/100.0;
					
					System.out.println("Enter n, the number of years of interest accumulation:: ");
					input=keyboard.nextLine();
					while(isDouble(input)==false)
					{
						System.out.println("Invalid input!");
						input=keyboard.nextLine();
					}
					years=Double.valueOf(input);
					System.out.println("The necessary value to deposit in the present moment is :: $"+presentValue(futureValue,interestRate,years)+".");
				break;
				default: 
				System.out.println("That isn't a listed program...");
			}
			
			
			System.out.println("Would you like to continue?");
			input=keyboard.nextLine();
			while(isYesNo(input)==false)
			{
				System.out.println("Invalid input!");
				input=keyboard.nextLine();
			}
			repeat=input.charAt(0);
		}while(repeat=='y');
		keyboard.close();
		System.out.println("Program terminated.");
	}
	
	
	
	public static void showChar(String name, int index) throws IOException
	{
		System.out.println("The character of "+name+" at index "+index+" is "+name.charAt(index));
	}
	
	public static String PrimeList(int end)
	{
		String output="";
		for (int number=1;number<=end;number++)
		{
			if(isPrime(number)==true)
			{
				output=output+"\n"+number;
			}
		}
		return output;
	}
	
	public static boolean isPrime(int number)
	{
		for (int divisor=2; divisor<number;divisor++)
		{
			if(number%divisor==0)
				return false;
		}
		return true;
	}
	
	public static String presentValue(double F, double r, double n)
	{
		double result;
		String output;
		result=F/Math.pow(1+r, n);
		DecimalFormat df = new DecimalFormat("#.00");
		output=df.format(result);
		return output;
	}
	
	
	
	
	
	
	
	
	
	
	
	/** Error checking methods */
	public static boolean isInteger(String input) throws IOException
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
	
	public static boolean isDouble(String input) throws IOException
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
	
	public static boolean inIndex(String input, int index) throws IOException
	{
		if(index<input.length())
			return true;
		return false;
	}
	
	public static boolean isYesNo(String input) throws IOException
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
	
}

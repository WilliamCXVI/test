import java.util.ArrayList;
import java.util.Scanner;
public class PhoneNumbers {
public static void main(String args[])
	{
		ArrayList <String> names = new ArrayList<String>();
		ArrayList <String> phoneNumbers = new ArrayList<String>();
		ArrayList <String> result = new ArrayList<String>();
		Scanner keyboard = new Scanner(System.in);
		String input = "",temp;
		int i = 1;
		boolean isName=true;
		
		System.out.println("Enter the names and corresponding phone numbers");
		System.out.println("Enter nothing at the end of the list");
		
		do
		{
			System.out.println("Name "+i+":: ");
			input=keyboard.nextLine();
			if(!input.isBlank())
			names.add(input);
			System.out.println("Phone number "+i+":: ");
			input=keyboard.nextLine();
			if(!input.isBlank())
			phoneNumbers.add(input);
			i++;
		}while(!input.isBlank());
		
		System.out.println("Arrays initialized!");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Enter a name (or first few characters of a name) to search:: ");
		input=keyboard.nextLine();
		for(i=0; i<names.size(); i++)
			{
				temp=names.get(i);
				if(temp.startsWith(input))
				{
					result.add(temp);
					result.add(phoneNumbers.get(i));
				}
			}
		System.out.println("");
		System.out.println("Results ("+(result.size()/2)+"):: ");
		System.out.println("______________");
		System.out.println("");
		for(String output: result)
		{
			if(isName)
				System.out.print(output+": ");
			else
				System.out.println(output);
			
			if(isName)
				isName=false;
			else
				isName=true;
		}
		
		
		
		keyboard.close();
	}
}

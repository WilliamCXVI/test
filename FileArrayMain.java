import java.util.ArrayList;
import java.util.Scanner;

public class FileArrayMain {

	public static void main(String[] args) 	
	{
		Scanner keyboard = new Scanner(System.in);
		String input;
		String filename;
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		int[] dataArray;
		int[] readArray;
		
		boolean end=false;
		
		System.out.println("Enter the file name.");
		filename=keyboard.nextLine();
		System.out.println("Enter the elemenets of the array (enter \"s\" to stop.");
		do
		{
			input=keyboard.nextLine();
			// DEBUG System.out.println("Saved.");
			try
			{
			data.add(Integer.valueOf(input));
			}
			catch(NumberFormatException e)
			{
				System.out.println("Success! Writing to file!");
				end = true;
			}
		}while(end==false);
		//get array from arraylist
		System.out.println("Progressing...");
		dataArray = new int[data.size()];
		for(int index = 0; index<data.size(); index++)
		{
		dataArray[index]=data.get(index);
		}	
		
		FileArray.writeArray(filename, dataArray);
		readArray = new int[dataArray.length];
		System.out.println("");
		FileArray.readArray(filename, readArray);
		System.out.println("These are the elements::");
		System.out.println("________________________");
		for(int i: readArray)
		{
			System.out.println(i);
		}
		
		
		keyboard.close();
	}	
}

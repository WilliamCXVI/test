import java.util.Scanner;
import java.io.*;
public class fileEditorRunner 
{
	private String theString,theRead;
	private int longest;
	Scanner input = new Scanner(System.in);
	public fileEditorRunner(String outputFile, String readableFile,int longest) 
	{
	theString=outputFile;
	theRead=readableFile;
	this.longest=longest;
	}
	
	public String editFile(String theString, String theRead, int longest)
	{
		String output="";
		String temp="";
		System.out.println("FILE:: ");
		for(int i=0; i<longest; i++)
			System.out.print("_");
		System.out.println("");
		System.out.println(theRead);
		System.out.println("");
		/* CODE WIP
		System.out.println("Enter the line number you wish to edit");
		temp=input.nextLine();	
			while(!fileEditorRunner.isInteger(temp))
			{
			System.out.println("Invalid input!");
			temp=input.nextLine();
			}
		output=temp+'|';
		System.out.println("Now, type (or copy and paste) the portion right before the position you would like to edit.");
		temp=input.nextLine();
		while(!fileEditorRunner.isInteger(temp))
		{
			System.out.println("Invalid input!");
			temp=input.nextLine();
		}
		output=output+temp;
		*/
		System.out.println("Enter the replacing text (press enter upon newline to terminate editing.");
		temp=input.nextLine();
		while(temp!="\n")
		{
			output=output+temp;
			temp=input.nextLine();
		}
		System.out.println("Editing terminated.");
		output=temp.substring(0,(temp.length()-1));
		input.close();
		return output;
	}
	
	
	
    public static boolean isInteger(Object object) 
    {
    	if(object instanceof Integer) {
    		return true;
    	} else {
    		String string = object.toString();
    		
    		try {
    			Integer.parseInt(string);
    		} catch(Exception e) {
    			return false;
    		}	
    	}
      
        return true;
    }
    
    public static boolean isYesNo(String input)
    {
    	if(input=="y"||input=="n")
    	{return true;}
    	return false;
    }
}

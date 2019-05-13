import java.util.Scanner;
import java.io.*;
public class fileEditor
{
	public static void main(String[] args) throws IOException
	{	///////////////////////////////////////
		Scanner input = new Scanner(System.in), inputFile;
		File file;
		fileEditorRunner save;
		String filename, temp3,temp4="", tempNext="", tempPrevious="",outputFile="",readableFile="";
		boolean existence=false, ender=false;
		char choice = '0',choice1 = '1';
		int longest=0, line=1;
		///////////////////////////////////////
	
		
		
		//check for file existence		
do{
	ender = false;
		do
		{
		System.out.println("Enter the filename:: ");
		filename=input.nextLine();
		System.out.println(filename);
		file = new File(filename);
		if(file.exists())
			{
			existence=true;
			break;
			}
		System.out.println("That file doesn't exist!");
		}
		while(existence==false);
		//System.out.println("checkpoint1!");
		inputFile = new Scanner(file);
				
		
		/*
		CODE WIP
		check for longest line
		while(inputFile.hasNextLine())
		{
			tempPrevious=tempNext;
			tempNext=inputFile.nextLine();
			if(tempNext.length()>tempPrevious.length())
				longest=tempNext.length();
		}
		
		
		//print header
		System.out.println("Output of "+filename);
		for(int i = 0; i<longest; i++)
		{
			System.out.print('/');
		}
		System.out.println();
		*/
		
		
		//save and print file
		System.out.println("Output of "+filename);
		System.out.println("----------------------");
		while(inputFile.hasNextLine())
		{
			temp4=inputFile.nextLine();
			outputFile=outputFile+temp4+"\n";
			System.out.println(temp4);
			line++;
			//regular file content
			/*CODE WIP
			readableFile=outputFile+"%5f"+line+"| "+inputFile.nextLine()+"\n";
			*/
		}
		System.out.println("----------------------");
		
		//continue editing?
		System.out.println("File has been read."+"\n"+"Would you like to continue editing?");
		do
		{
			temp3=input.nextLine();
				if(fileEditorRunner.isYesNo(temp3)==false)
				{
					System.out.println("Invalid input!");
				}
				if(fileEditorRunner.isYesNo(temp3)==true)
				{
						// check for writing another file
						System.out.println("Would you like to read/write a new file?");
						do {
							temp4=input.nextLine();
							choice1=temp4.charAt(0);
							if(choice1=='y'&&temp4.length()==1)
								ender=true;
							if(fileEditorRunner.isYesNo(temp4)==false)
								System.out.println("Invalid input!!");
						}while(fileEditorRunner.isYesNo(temp4)==false);
				
				}
		}while(fileEditorRunner.isYesNo(temp3)==false);
		inputFile.close();
		//write to file
		if(choice1=='y')
		{
			save = new fileEditorRunner(outputFile,readableFile,longest);
			save.editFile(outputFile,readableFile,longest);
		}
}while(ender==true);
	}
}

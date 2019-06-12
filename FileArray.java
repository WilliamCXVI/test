import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileArray {
	
	private static DataOutputStream outputFile;
	private static DataInputStream inputFile;
	
	public static void writeArray(String filename, int[] array)
	{
		try
		{
			outputFile = new DataOutputStream( new FileOutputStream("src/"+filename) );
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
		for(int element : array)
		{
			try {
				outputFile.writeInt(element);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void readArray(String filename, int[] array)
	{
		int number;
		try
		{
			inputFile = new DataInputStream( new FileInputStream("src/"+filename) );
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
		for(int index=0; index<array.length; index++)
		{
					try {
						number=inputFile.readInt();
						array[index]=number;
					} catch (IOException e) {
						e.printStackTrace();
					}
		
		}
	}
}
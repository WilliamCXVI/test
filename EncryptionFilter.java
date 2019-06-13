import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class EncryptionFilter {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		String input, filename;
		int[] arrOut;
		
		System.out.println("File Encryption Filter");
		System.out.println("______________________");
		System.out.println("");
		System.out.println("Enter the filename");
		filename = keyboard.nextLine();
		System.out.println("Enter the String");
		input = keyboard.nextLine();
		
		arrOut = new int[input.length()];
		arrOut = (Encryption(input,arrOut));
		
		DataOutputStream outputFile = new DataOutputStream(new FileOutputStream("src/"+filename));
		for(int element: arrOut)
			try {
				outputFile.writeInt(element);
			} catch (IOException e) {
				System.out.println("An error has occured.");
			}
		System.out.println("File Decrypted:: ");
		System.out.println(Decryption(filename));
		
	}
	
	public static int[] Encryption(String s, int[] arrOut) {  
		for (int i = 0; i < s.length(); i++) {
	    	arrOut[i]=s.charAt(i) + 10;
	    	if(arrOut[i]>1114112)
	    		arrOut[i]=(arrOut[i]-1114112);
	    }
		String total;
		for(int element: arrOut) {
			total=element+"\n";
			System.out.println("Encrypted:: "+total);
		}
		return arrOut;
	}
	
	public static String Decryption(String filename) throws FileNotFoundException {
		boolean EOF = false;
		String str = "";
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		DataInputStream inputFile = new DataInputStream(new FileInputStream("src/"+filename));
		while(!EOF)
			try {
				arr.add( inputFile.readInt() -10);
			}
			catch(EOFException e)
			{
				EOF=true;
			} catch (IOException e) {
				System.out.println("That file doesn't exist!");
			}
		
		for(Integer element : arr)
			str=str+(char)element.intValue();
		return str;
	}

}

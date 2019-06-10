
public class InvalidTestScore extends Exception {

	public InvalidTestScore(int[] arr)
	{
		super("Error: Invalid Test Score!"+"\n"+getMessage(arr));
	}
	public static String getMessage(int[] arr)
	{
		String output = "";
		for(int element:arr)
		{
			if(element<0)
			output = "The test score must have a value of at least 0.";
		
			if(element>100)
			output = "The test score must have a value of no more than 100.";
		}
		return output;
	}
}

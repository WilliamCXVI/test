
public class TestScores {
	
	private int[] arr;
	private double average;
	
	public TestScores(int[] arr ) throws IllegalArgumentException
	{
		for(int element: arr)
		{
			if(element<0)
			throw new IllegalArgumentException("The test score must have a value of at least 0.");
			
			if(element>100)
			throw new IllegalArgumentException("The test score must have a value of no more than 100.");
		}
		this.arr=arr;
	}
	
	public double getAverage()
	{
		int sum = 0;
		for(int element: arr)
			sum=sum+element;
		
		average=((double)sum)/arr.length;
		return average;
	}
}

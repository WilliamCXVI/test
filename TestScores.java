import java.io.Serializable;

public class TestScores implements Serializable{
	
	private int[] arr;
	private double average;
	
	public TestScores(int[] arr ) throws InvalidTestScore
	{
		for(int element: arr)
		{
			if(element<0||element>100)
			throw new InvalidTestScore(arr);
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
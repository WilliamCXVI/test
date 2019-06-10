
public class TestScoresMain {

	public static void main(String[] args) {
		
		int[] scores = {101,92,87,78};
		try
		{
			TestScores object = new TestScores(scores);
			System.out.println("The average:: "+object.getAverage());
		}
		catch(InvalidTestScore e)
		{
			System.out.println(e.getMessage());
		}
	}

}

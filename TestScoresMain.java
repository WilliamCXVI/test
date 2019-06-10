
public class TestScoresMain {

	public static void main(String[] args) {
		
		int[] scores = {100,92,87,78};
		TestScores object = new TestScores(scores);
		System.out.println("The average:: "+object.getAverage());
	}

}

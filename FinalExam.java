
public class FinalExam extends GradedActivity{
	private final int questions=50;
	private final int pointsEach=2;
	private double score;
	
	public void setScore(int numMist)
	{
		int totalPoints=questions*pointsEach;
		int pointsMist=numMist*pointsEach;
		score=totalPoints-pointsMist;
	}
	
	public double getScore()
	{
		return score;
	}
	
	public char getGrade()
	{
		super.setScore(score);
		return super.getGrade();
	}
}

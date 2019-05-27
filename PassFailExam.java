
public class PassFailExam extends GradedActivity{
	private int numMist;
	private int score;
	
	public void setNumMist(int numMist)
	{
		this.numMist=numMist;
	}
	
	public char getGrade()
	{
		if(numMist>3)
			return 'F';
					
		return 'P';
	}
	
	public void setScore()
	{
		score=100-numMist*10;
	}
	
	public double getScore()
	{
		return score;
	}
}

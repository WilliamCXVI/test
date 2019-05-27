
public class Essay extends GradedActivity{
	private double Grammar, Spelling, CorrectLength, Content, total;

	public void setGrammar(double Grammar)
	{
		this.Grammar=Grammar;
	}
	
	public void setSpelling(double Spelling)
	{
		this.Spelling=Spelling;
	}
	
	public void setCorrectLength(double CorrectLength)
	{
		this.CorrectLength=CorrectLength;
	}
	
	public void setContent(double Content)
	{
		this.Content=Content;
	}
	
	public void setScore()
	{
		total=Grammar+Spelling+CorrectLength+Content;
	}
	
	public double getScore()
	{
		return total;
	}
	
	public char getGrade()
	{
		super.setScore(total);
		return super.getGrade();
	}
}


public class Computer {
	private int difficulty;
	public Computer(int difficulty)
	{
		this.difficulty=difficulty;
	}
	public boolean Decision(int score, int highest)
	{
		boolean decision = false;
		if(difficulty==1)
		{
			decision=(Math.random() < 0.5);
			return decision;
		}
		if(difficulty==2)
		{
			if(score<10)
			{
				decision = true;
			}
			else if(score>=10&&score<=18)
			{
				decision=(Math.random() < 0.5);
			}
			else if(score>18)
			{
				decision = false;
			}
		}
		if(difficulty==3)
		{
			if(score<14)
			{
				decision = true;
			}
			else if(score==14)
			{
				decision=(Math.random() < 0.5);
			}
			else if(score>14)
			{
				decision = false;
			}
		}
		return decision;
	}
}

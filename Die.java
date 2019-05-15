import java.util.concurrent.ThreadLocalRandom;


public class Die 
{
	private int dice1Number, dice2Number;
	public void rollDie()
	{
		dice1Number=rollDice1();
		dice2Number=rollDice2();
	}
	public int rollDice1()
	{
		int min = 1;
		int max = 6;
		int value=ThreadLocalRandom.current().nextInt(min, max + 1);
		return value;
	}
	public int rollDice2()
	{
		int min = 1;
		int max = 6;
		int value=ThreadLocalRandom.current().nextInt(min, max + 1);
		return value;
	}
	public int getDice1Number()
	{
		return dice1Number;
	}
	public int getDice2Number()
	{
		return dice2Number;
	}
	public int getTotal()
	{
		int total=dice1Number+dice2Number;
		return total;
	}
}

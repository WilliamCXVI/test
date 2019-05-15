import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
/**
 * 
 * @author Matthew Herrada
 *
 *
 * This game of 21 has a multi-player aspect. 
 * 		eliminations occur upon the acquisition of the lowest score.
 * 		a tie is when all players have passed 3 consecutive turns refusing to roll. 
 * 		a tie is broken randomly, regardless of score.
 * 		levels of difficulty cause computers to assume more probable paths to victory.
 */

public class GameOf21 
{
	public static void main(String [ ] args)
	{
		/////   Variable Box  /////
		int Copponents, players, min,max,value, loopIndex, highest=0, difficulty=1;
		char repeat='n',choose='n';
		boolean cselection;
		String input;
		Scanner keyboard = new Scanner(System.in);
		Die die = new Die();
		Computer computer;
		Score score;
		///////////////////////////
		System.out.println("Game of 21!!");
		System.out.println("____________");
		System.out.println();
		System.out.println();
		System.out.println();
		do {
			value=0;
			cselection=true;
			highest=0;
			do 
			{/** Get number of opponents */
				System.out.println();
				System.out.println("Enter the number of computerized opponents:: ");
				input=keyboard.nextLine();
				if(isInteger(input)==false)
					System.out.println("Invalid input!");
			}while(isInteger(input)==false);
			Copponents=Integer.valueOf(input);
			
			/** Get number of players */
			do 
			{/** Get number of opponents */
				System.out.println();
				System.out.println("Enter the number of human players:: ");
				input=keyboard.nextLine();
				if(isInteger(input)==false)
					System.out.println("Invalid input!");
			}while(isInteger(input)==false);
			players=Integer.valueOf(input);
			/**
			 * Assign the difficulty level
			 */
			System.out.println("Difficulty levels");
			System.out.println("_________________");
			System.out.println("");
			System.out.println("1) Easy");
			System.out.println("2) Medium");
			System.out.println("3) Hard");
			System.out.println("");
			System.out.println("");
			do {
				input=keyboard.nextLine();
				if(!isInteger(input))
					System.out.println("Invalid input!");
				else if(Integer.valueOf(input)>3)
					System.out.println("That is not a valid difficulty!");
			}while(!isInteger(input));
			difficulty=Integer.valueOf(input);
			/**
			 * Initialize the gamestate.
			 */
			computer = new Computer(difficulty);
			score = new Score(players,Copponents);
			loopIndex=0;
			while(loopIndex<Copponents)
			{
				die.rollDie();
				score.Assign(loopIndex+1, die.getTotal(), true);
				loopIndex++;
			}
			loopIndex=0;
			while(loopIndex<players)
			{
				die.rollDie();
				score.Assign(loopIndex+1, die.getTotal(), false);
				loopIndex++;
			}
			/**
			 * Print out scores
			 */
			while(score.Winner()==false)
			{
				System.out.println("Scores:: ");
				System.out.println("________");
				System.out.println("");
				System.out.println("Computers: ");
				for(loopIndex=0;loopIndex<Copponents;loopIndex++)
				{
					System.out.print("Computer Player ");
					System.out.printf("%2d", (loopIndex+1));
					System.out.println(": "+score.getScore(loopIndex+1, true));
				}
				System.out.println("");
				System.out.println("Human Players: ");
				for(loopIndex=0;loopIndex<players;loopIndex++)
				{
					System.out.print("Human Player ");
					System.out.printf("%2d", (loopIndex+1));
					System.out.println(": "+score.getScore(loopIndex+1, false));
				}
				
				/** Let the games begin!
				 * 
				 */
				for(loopIndex=0;loopIndex<Copponents;loopIndex++)
				{
					System.out.print("Computer Player ");
					System.out.printf("%2d", loopIndex+1);
					if(score.getScore(loopIndex+1, true)==-1)
					System.out.println(" is OUT of the game!!");
					else
					{
						System.out.print(" has decided ");
						if(computer.Decision( score.getScore(loopIndex+1, true), highest)||score.getScore(loopIndex+1, true)<highest)
						{
							System.out.print("to roll");
							die.rollDie();
							score.Assign(loopIndex+1, die.getTotal(), true);
							System.out.println(" recieving numbers "+die.getDice1Number()+" and "+die.getDice2Number()+" recieving a total of "+die.getTotal()+" and arrive at a score of "+score.getScore(loopIndex+1, true));
							if(score.getScore(loopIndex+1, true)==-1)
							{
								System.out.println("-1 means it passed the 21 limit. It is out of the game!");
								score.endTrack(loopIndex, true);
							}
							if(score.getScore(loopIndex+1, true)>highest)
								highest=score.getScore(loopIndex+1, true);
						}
						else
						{
							System.out.println("not to roll (staying at a score of "+score.getScore(loopIndex+1, true));
							score.putTrack(loopIndex, true);
						}
					}
				}
				
				for(loopIndex=0;loopIndex<players;loopIndex++)
				{
					System.out.print("Human Player ");
					System.out.printf("%2d", loopIndex+1);
					System.out.println("'s turn:: ");
					if(score.getScore(loopIndex+1, false)==-1)
					System.out.println(" is OUT of the game!!");
					else
					{
						System.out.println("Would this player like to roll (y or n) ?");
						System.out.println("This player's score resides at "+score.getScore(loopIndex+1, false));
						do
						{
							input=keyboard.nextLine();
							if(!isYesNo(input))
								System.out.println("Invalid input!");
						}while(!isYesNo(input));
						choose=input.charAt(0);
						if(choose=='y')
						{
							die.rollDie();
							score.Assign(loopIndex+1, die.getTotal(), false);
							System.out.println("Your dice numbers were "+die.getDice1Number()+" and "+die.getDice2Number()+", an addition of "+die.getTotal()+" to your score");
							if(score.getScore(loopIndex+1, false)==-1)
							{
								System.out.println("-1 means you passed the 21 limit. You are out of the game!");
								score.endTrack(loopIndex, false);
							}
							else
								System.out.println("You recieved a score of "+score.getScore(loopIndex+1, false));
							if(score.getScore(loopIndex+1, false)>highest)
								highest=score.getScore(loopIndex+1, false);
						}
						else
						{
							System.out.println("Your score is at "+score.getScore(loopIndex+1, false));
							score.putTrack(loopIndex, false);
						}
					}
				}
				
				if(score.tieBreakerNeed())
				{
					System.out.println("TIE BREAKER");
					System.out.println("RANDOM NUMBER DETERMINES...");
					score.tieBreaker();
					min = 1;
					max = score.ofCremaining().length+score.ofPremaining().length;
					value=ThreadLocalRandom.current().nextInt(min, max + 1);
					if(value>score.ofCremaining().length)
					{
						value=value-score.ofPremaining().length;
						cselection=false;
					}
					// conditions to emulate 1 winner.
					for(int x=1; x<=Copponents; x++)
					score.Assign(x, -1, true);
					for(int x=1; x<=players; x++)
					score.Assign(x, -1, false);
					/*
					 *  debug System.out.println(score.ofCremaining()[value]);
					 	System.out.println(score.ofCremaining());
					 */
					if(cselection)
						score.Assign(score.ofCremaining()[value-1]+1, 101, true);
					else
						score.Assign(score.ofPremaining()[value-1]+1, 101, false);
					
					break;
				}
			}
			//debug System.out.println(Arrays.toString(score.ofCremaining()));
			System.out.println("GAME END");
			System.out.print("THE WINNER:: "+score.getWinner());
			System.out.println("");
			System.out.println("");
			System.out.println("Would you like to play again?");
			do
			{
				input=keyboard.nextLine();
				if(!isYesNo(input))
				System.out.println("Invalid input!");
			}while(!isYesNo(input));
			
			repeat=input.charAt(0);
		}while(repeat=='y');
		
		
		/* Debug code to test die rolls 
		Die die = new Die();
		for(int i=0; i<10; i++)
		{
			die.rollDie();
			System.out.println("The first die is "+die.getDice1Number());
			System.out.println("The second die is "+die.getDice2Number());
			System.out.println("The total of the dice is "+die.getTotal());
		}
		*/
		keyboard.close();
	}

	/** Error checking methods */
	public static boolean isInteger(String input)
	{	
		if(input.length()==0)
			return false;
		for(int index = 0; index<input.length(); index++)
		{
			switch(input.charAt(index)) 
			{
				case '0':
				break;
				case '1':
				break;
				case '2':
				break;
				case '3':
				break;
				case '4':
				break;
				case '5':
				break;
				case '6':
				break;
				case '7':
				break;
				case '8':
				break;
				case '9':
				break;
				default:
					//debug:: System.out.println("checkpoint");
				return false;
				
			}
		}
		return true;
}
	
	public static boolean isYesNo(String input)
	{
		if(input.length()==1)
		{
			// debug System.out.println("checkpoint");
			if(input.equals("y")||input.equals("n"))
			{
				//debug System.out.println("checkpoint");
				return true;
			}
		}
		return false;
	}
}

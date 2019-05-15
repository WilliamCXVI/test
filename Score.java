
public class Score {
	private int[] pscore, cscore,pCounter,cCounter,cremaining,premaining;
	private boolean[] ptrack, ctrack;
	private int players,Copponents;
	public Score(int players, int Copponents)
	{
		this.players=players;
		this.Copponents=Copponents;
		pscore = new int[players];
		cscore = new int[Copponents];
		pCounter = new int[players];
		cCounter = new int[Copponents];
		ptrack = new boolean[players];
		ctrack = new boolean[Copponents];
	}
	
	public void Assign(int thePlayer, int theScore, boolean computer)
	{
		if(computer)
		{
			cscore[thePlayer-1]=cscore[thePlayer-1]+theScore;
			if(cscore[thePlayer-1]>21)
			cscore[thePlayer-1]=-1;
		}
		else
		{
			pscore[thePlayer-1]=pscore[thePlayer-1]+theScore;
			if(pscore[thePlayer-1]>21)
			pscore[thePlayer-1]=-1;
		}
	}
	
	public boolean Winner()
	{
		int count = 0;
		for (int i=0; i<pscore.length; i++)
		{
			if(pscore[i]==100)
			count++;
		}
		for (int i=0; i<cscore.length; i++)
		{
			if(cscore[i]==100)
			count++;
		}
		if(count==1)
		return true;
		
		return false;
	}
	
	public int getScore(int thePlayer, boolean computer)
	{
		if(computer)
			return cscore[thePlayer-1];
		else
			return pscore[thePlayer-1];
	}
	public String getWinner()
	{
		String output="";
		for(int i=0; i<cscore.length; i++)
		{
			if(cscore[i]!=-1)
			{
				output = "COMPUTER PLAYER "+(i+1);
				break;
			}
		}
		for(int i=0; i<pscore.length; i++)
		{
			if(cscore[i]!=-1)
			{
				output = "HUMAN PLAYER "+(i+1);
				break;
			}
		}
		return output;
	}
	public void putTrack(int index, boolean computer)
	{
		if(computer)
			cCounter[index]++;
		else
			pCounter[index]++;
		
		if(cCounter.length!=0 && cCounter[index]>=3)
			ctrack[index]=true;
		
		if(pCounter.length!=0 && pCounter[index]>=3)
			ptrack[index]=true;
	}
	public void endTrack(int index, boolean computer)
	{
		if(computer)
			cCounter[index]=3;
		else
			pCounter[index]=3;
		
		if(cCounter.length!=0 && cCounter[index]>=3)
			ctrack[index]=true;
		
		if(pCounter.length!=0 && pCounter[index]>=3)
			ptrack[index]=true;
	}
	public boolean tieBreakerNeed()
	{
		for(int i = 0; i < Copponents; i++)
		{
			if(ctrack[i]==false)
				return false;
		}
		for(int i = 0; i < players; i++)
		{
			if(ptrack[i]==false)
				return false;
		}
		return true;
	}
	public void tieBreaker()
	{
		int ccounter = 0,pcounter=0, otherIndex=0;
		//get numbers necessary to store memory
		for(int b = 0; b < Copponents; b++)
		{
			if(ctrack[b]==true&&cscore[b]!=-1)
			ccounter++;
		}
		for(int a = 0; a < players; a++)
		{
			if(ptrack[a]==true&&pscore[a]!=-1)
			pcounter++;
		}
		//allocates memory (goal is to store alive players list)
		cremaining = new int[ccounter];
		premaining = new int[pcounter];
		/*
		 *  debug 	System.out.println(ccounter);
		 			System.out.println("cremaining length:"+cremaining.length);
		 */
		
		
		//store the proper indexes in memory
		for(int i = 0; i < Copponents; i++)
		{
			if(ctrack[i]==true&&cscore[i]!=-1)
			{
			cremaining[otherIndex]=i;
			/*
			 * debug 	System.out.println("adding "+i+" to array");
			 			System.out.println(cremaining[otherIndex]);
			 */
			otherIndex++;
			}
		}
		otherIndex=0;
		for(int y = 0; y < players; y++)
		{
			if(ptrack[y]==true&&pscore[y]!=-1)
			{
			premaining[otherIndex]=y;
			otherIndex++;
			}
		}
	}
	// array of contestant numbers (not scores, but 
	// literal numeric assignment) eligible for tie-breaker
	public int[] ofCremaining()
	{
		return cremaining;
	}

	public int[] ofPremaining()
	{
		return premaining;
	}
}

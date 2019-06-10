
public class Ship {

	private String yearBuilt;
	protected String name;
	
	public Ship()
	{
		name="N/A";
		yearBuilt="N/A";
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setYearBuilt(String yearBuilt)
	{
		this.yearBuilt=yearBuilt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getYearBuilt()
	{
		return yearBuilt;
	}
	
	public String toString()
	{
		String output;
		output =          "Name::       " +name+"\n";
		output = output + "Year Built:: " +yearBuilt;
		return output;
	}
}

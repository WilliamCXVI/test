public class Month {

	private int MonthNumber;
	
	public Month()
	{
		MonthNumber=0;
	}
	
	public void Month(int MonthNumber) throws InvalidMonth
	{
		
		if(MonthNumber<1||MonthNumber>12)
		{
			throw new InvalidMonth(MonthNumber);
		}
		else
		{
			this.MonthNumber=MonthNumber;
		}
	}
	
	public void Month(String MonthName) throws InvalidMonth
	{
		switch(MonthName)
		{
		case "January":
		MonthNumber=1;
		break;
		case "February":
		MonthNumber=2;
		break;
		case "March":
		MonthNumber=3;
		break;
		case "April":
		MonthNumber=4;
		break;
		case "May":
		MonthNumber=5;
		break;
		case "June":
		MonthNumber=6;
		break;
		case "July":
		MonthNumber=7;
		break;
		case "August":
		MonthNumber=8;
		break;
		case "September":
		MonthNumber=9;
		break;
		case "October":
		MonthNumber=10;
		break;
		case "November":
		MonthNumber=11;
		break;
		case "December":
		MonthNumber=12;
		break;
		default:
		throw new InvalidMonth(MonthName);
		}
	}
	
	public void setMonthNumber(int MonthNumber) throws InvalidMonth
	{
		if(MonthNumber<1||MonthNumber>12)
		{
			throw new InvalidMonth(MonthNumber);
		}
		else
		{
			this.MonthNumber=MonthNumber;
		}
	}
	
	public int getMonthNumber()
	{
		return MonthNumber;
	}
	
	public String getMonthName()
	{
		String output="";
		switch(MonthNumber)
		{
		case 1:
		output = "January";
		break;
		case 2:
		output = "February";
		break;
		case 3:
		output = "March";
		break;
		case 4:
		output = "April";
		break;
		case 5:
		output = "May";
		break;
		case 6:
		output = "June";
		break;
		case 7:
		output = "July";
		break;
		case 8:
		output = "August";
		break;
		case 9:
		output= "September";
		break;
		case 10:
		output = "October";
		break;
		case 11:
		output = "November";
		break;
		case 12:
		output = "December";
		break;
		}
		return output;
	}
	
	public boolean equals(Month object)
	{
		if (MonthNumber==object.MonthNumber)
			return true;
		return false;
	}
	
	public boolean greaterThan(Month object)
	{
		if (MonthNumber>object.MonthNumber)
			return true;
		return false;
	}
	
	public boolean lessThan(Month object)
	{
		if (MonthNumber<object.MonthNumber)
			return true;
		return false;
	}
	
	public String toString()
	{
		return getMonthName();
	}
}
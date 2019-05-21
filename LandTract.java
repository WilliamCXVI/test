
public class LandTract {
	private double length, width;
	
	public LandTract()
	{
		length=0;
		width=0;
	}
	
	public void setLength(double length)
	{
		this.length=length;
	}
	
	public void setWidth(double width)
	{
		this.width=width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return width*length;
	}
	
	//Equals method
	
	public boolean equals(LandTract object)
	{
		if (length==object.getLength()&&width==object.getWidth())
			return true;
		
		return false;
	}
	
	public String toString()
	{
		return "The area of this land tract is "+getArea()+" square ft";
	}
}

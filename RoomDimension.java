
public class RoomDimension {
	private double length, width;
	
	public RoomDimension(double len, double w)
	{
		length=len;
		width=w;
	}
	
	public double getArea()
	{
		double area;
		area=length*width;
		return area;
	}
	
	public String toString()
	{
		return "The area of the room ("+length+" ft by "+width+" ft) is "+getArea()+" square ft";
	}
}

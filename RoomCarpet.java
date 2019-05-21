
public class RoomCarpet {
	private RoomDimension size;
	private double carpetCost;
	
	public RoomCarpet(RoomDimension dim, double cost)
	{
		carpetCost=cost;
		size=dim;
	}
	
	public double getTotalCost()
	{
		return size.getArea()*carpetCost;
	}
	
	public String toString()
	{
		return "The total cost of the carpet is $"+getTotalCost();
	}
	
}

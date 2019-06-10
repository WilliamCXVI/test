
public class CargoShip extends Ship{
	private int capacity;
	
	public CargoShip()
	{
		capacity=0;
	}
	
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public String toString()
	{
		String output;
		output =          "Name::     "+name+"\n";
		output = output + "Capacity:: "+capacity+" tons";
		return output;
	}
}

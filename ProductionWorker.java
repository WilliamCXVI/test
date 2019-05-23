
public class ProductionWorker extends Employee {
private int shift;
private double rate;
	public ProductionWorker()
	{
		shift=0;
		rate=0;
	}
	
	public ProductionWorker(int shift, double rate)
	{
		this.shift=shift;
		this.rate=rate;
	}
	
	public void setShift(int shift)
	{
		this.shift=shift;
	}
	
	public void setRate(double rate)
	{
		this.rate=rate;
	}
	
	public int getShift()
	{
		return shift;
	}
	
	public double getRate()
	{
		return rate;
	}
}

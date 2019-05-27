import java.util.ArrayList;

public interface Analyzable
	{
		double getAverage();
		ArrayList<GradedActivity> getHighest();
		ArrayList<GradedActivity> getLowest();
	}
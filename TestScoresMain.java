import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestScoresMain {

	public static void main(String[] args) {
		
		int[] scores = {100,92,87,78,86};
		ObjectOutputStream objectOutputFile = null;
		ObjectInputStream objectInputFile = null;
		TestScores object = null;
		TestScores newObject = null;
		try {
			objectOutputFile = new ObjectOutputStream(new FileOutputStream("src/TestScoreFile.dat") );
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			objectInputFile = new ObjectInputStream(new FileInputStream("src/TestScoreFile.dat") );
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try
		{
			object = new TestScores(scores);
		}
		catch(InvalidTestScore e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Writing object to file...");
		try {
			objectOutputFile.writeObject(object);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("End of writing.");
		System.out.println("Writing file to object...");
		try {
			newObject=(TestScores) objectInputFile.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("The average:: "+newObject.getAverage());
	}

}
import java.util.Scanner;
public class WorkMain {
	public static void main (String args[])
	{
		String input;
		int inputInt;
		double inputDouble;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This is an inheritance demo:: ");
		
		ProductionWorker sam = new ProductionWorker();
		System.out.println("Set the name:: (Sam)");
		input=keyboard.nextLine();
		sam.setName(input);
		System.out.println("Set the hire Date:: ");
		input=keyboard.nextLine();
		sam.setDate(input);
		System.out.println("Set the number:: ");
		input=keyboard.nextLine();
		sam.setNumber(input);
		System.out.println("Set the shift:: (1-day or 2-night)");
		inputInt=keyboard.nextInt();
		sam.setShift(inputInt);
		System.out.println("Set the hourly pay rate:: ");
		inputDouble=keyboard.nextDouble();
		sam.setRate(inputDouble);
		System.out.println("name: "+sam.getName()+
						   "hire date: "+sam.getDate()+
						   "number: "+sam.getNumber()+
						   "shift: "+sam.getShift()+
						   "hourly pay rate: "+sam.getRate());
		
	}
}

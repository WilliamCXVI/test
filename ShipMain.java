import java.util.Scanner;
import java.util.ArrayList;
public class ShipMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input;
		int choiceInteger, index=0,cruiseIndex=0,cargoIndex=0, integerInput,deleteInput, counter;
		boolean end = false;
		ArrayList<Ship> ships = new ArrayList<Ship>();
		ArrayList<CruiseShip> cruiseShips = new ArrayList<CruiseShip>();
		ArrayList<CargoShip> cargoShips = new ArrayList<CargoShip>();
		System.out.println("Sea Management Program");
		System.out.println("______________________");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		do {
			
			do {
				System.out.println("Options:: ");
				System.out.println("1) Enter new ship.");
				System.out.println("2) Enter new cruise ship.");
				System.out.println("3) Enter new cargo ship. ");
				System.out.println("4) Remove a ship.");
				System.out.println("5) Display current ships of all types.");
				System.out.println("6) Terminate program.");
				input=keyboard.nextLine();
				if(isInteger(input)==false)
					System.out.println("Invalid input! That's not an integer.");
				else if(Integer.parseInt(input)<1||Integer.parseInt(input)>6)
					System.out.println("Invalid input! That number is out of range.");
			}while(isInteger(input)==false||Integer.parseInt(input)<1||Integer.parseInt(input)>6);

				choiceInteger=Integer.parseInt(input);
				
				switch (choiceInteger)
				{
					case 1:
					{
						ships.add(new Ship());
						
						System.out.println("Enter the ship's name: ");
						input=keyboard.nextLine();
						ships.get(index).setName(input);
						
						System.out.println("Enter the year the ship was built: ");
						input=keyboard.nextLine();
						ships.get(index).setYearBuilt(input);
						
						index++;
						break;
					}
					case 2:
					{
						cruiseShips.add(new CruiseShip());
						
						System.out.println("Enter the cruise ship's name: ");
						input=keyboard.nextLine();
						cruiseShips.get(cruiseIndex).setName(input);
						

						do {
							System.out.println("Enter the cruise ship's person capacity: ");
							input=keyboard.nextLine();
							if(isInteger(input)==false)
								System.out.println("Invalid input! That's not a positive integer.");
						}while(isInteger(input)==false);
						integerInput=Integer.parseInt(input);
						cruiseShips.get(cruiseIndex).setCapacity(integerInput);
						
						cruiseIndex++;
						break;
					}
					case 3:
					{
						cargoShips.add(new CargoShip());
						
						System.out.println("Enter the cargo ship's name: ");
						input=keyboard.nextLine();
						cargoShips.get(cargoIndex).setName(input);
						

						do {
							System.out.println("Enter the cargo ship's cargo capacity in tons: ");
							input=keyboard.nextLine();
							if(isInteger(input)==false)
								System.out.println("Invalid input! That's not an integer.");
						}while(isInteger(input)==false);
						integerInput=Integer.parseInt(input);
						cargoShips.get(cargoIndex).setCapacity(integerInput);
						
						cargoIndex++;
						break;
					}
					case 4:
					{
						do {
						System.out.println("Options:: ");
						System.out.println("1) Delete a ship.");
						System.out.println("2) Delete a cruise ship");
						System.out.println("3) Delete a cargo ship");
						input=keyboard.nextLine();
						if(isInteger(input)==false)
							System.out.println("Invalid input! That's not an integer.");
						else if(Integer.parseInt(input)>3||Integer.parseInt(input)<1)
							System.out.println("Invalid input! That number is out of range.");
						}while(isInteger(input)==false||Integer.parseInt(input)<1||Integer.parseInt(input)>3);
						integerInput=Integer.parseInt(input);
						
						counter=0;
						switch(integerInput)
						{
						case 1:
						{
							for(Ship a: ships)
							{	
								System.out.println("Ship #"+counter+"\n");
								System.out.println(a.toString()+"\n\n");
								counter++;
							}
							do {
								System.out.println("Enter a ship to delete: ");
								input=keyboard.nextLine();
								if(isInteger(input)==false)
									System.out.println("Invalid input! That's not an integer.");
								else if(Integer.parseInt(input)>=ships.size()||Integer.parseInt(input)<1)
									System.out.println("Invalid input! That number is out of range.");
							}while(isInteger(input)==false||Integer.parseInt(input)<1||Integer.parseInt(input)>=ships.size());
							
							deleteInput=Integer.parseInt(input);
							ships.remove(deleteInput);
							index--;
							break;
						}
						case 2:
						{
							for(CruiseShip b: cruiseShips)
							{
								System.out.println("Cruise Ship #"+counter+"\n");
								System.out.println(b.toString()+"\n\n");
								counter++;
							}
							do {
								System.out.println("Enter a cruise ship to delete: ");
								input=keyboard.nextLine();
								if(isInteger(input)==false)
									System.out.println("Invalid input! That's not an integer.");
								else if(Integer.parseInt(input)>=cruiseShips.size()||Integer.parseInt(input)<1)
									System.out.println("Invalid input! That number is out of range.");
							}while(isInteger(input)==false||Integer.parseInt(input)<1||Integer.parseInt(input)>=cruiseShips.size());
							
							deleteInput=Integer.parseInt(input);
							cruiseShips.remove(deleteInput);
							cruiseIndex--;
							break;
						}
						case 3:
						{
							for(CargoShip c: cargoShips)
							{
								System.out.println("Cargo Ship #"+counter+"\n");
								System.out.println(c.toString()+"\n\n");
								counter++;
							}
							do {
								System.out.println("Enter a cargo ship to delete: ");
								input=keyboard.nextLine();
								if(isInteger(input)==false)
									System.out.println("Invalid input! That's not an integer.");
								else if(Integer.parseInt(input)>=cargoShips.size()||Integer.parseInt(input)<1)
									System.out.println("Invalid input! That number is out of range.");
							}while(isInteger(input)==false||Integer.parseInt(input)<1||Integer.parseInt(input)>=cargoShips.size());
							
							deleteInput=Integer.parseInt(input);
							cargoShips.remove(deleteInput);
							cargoIndex--;
							break;
						}
						}
					break;
					}
				case 5:
					{
						counter=0;
						for(Ship d: ships)
						{	
							System.out.println("Ship #"+counter+"\n");
							System.out.println(d.toString()+"\n\n");
							counter++;
						}
						counter=0;
						for(CruiseShip e: cruiseShips)
						{
							System.out.println("Cruise Ship #"+counter+"\n");
							System.out.println(e.toString()+"\n\n");
							counter++;
						}
						for(CargoShip f: cargoShips)
						{
							System.out.println("Cargo Ship #"+counter+"\n");
							System.out.println(f.toString()+"\n\n");
							counter++;
						}
					break;
					}
				default:
					{
						end = true;
						/*
						 * DEBUG
						 * System.out.println("Debug ");
						 */
					}
				}
			}while(!end);
		keyboard.close();
	}
		
	public static boolean isInteger(String input)
	{	
		if(input.length()==0)
			return false;
		for(int index = 0; index<input.length(); index++)
		{
			switch(input.charAt(index)) 
			{
				case '0':
				break;
				case '1':
				break;
				case '2':
				break;
				case '3':
				break;
				case '4':
				break;
				case '5':
				break;
				case '6':
				break;
				case '7':
				break;
				case '8':
				break;
				case '9':
				break;
				default:
					//debug:: System.out.println("checkpoint");
				return false;
				
			}
		}
		return true;
	}
}

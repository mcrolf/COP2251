// ShipTest Executable Class for M1 Programming Assignment
// COP 2251
// By: Michael Napoli
// (collaboration with video notes chapter 11 and Oracle Java Documentation)




package napoli11;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		
		/* Here I am creating a total of 5 ships.
		 * I am also defining their attributes.*/
		
		// make two objects with declared type Ship but actual type CruiseShip
		Ship Alexander = new CruiseShip("Alexander", 1997, true, 3600, "Carribian");
		Ship Lively = new CruiseShip("Lively", 1986, false, 2100, "Pacific");
		
		// make one object of declared type Ship but actual type CargoShip
		Ship Boris = new CargoShip("Boris", 1973, false, "Agricultural Goods", 400);
		
		// make one object of declared type CargoShip and actual type CargoShip
		CargoShip Mabel = new CargoShip("Mabel", 1985, true, "Textiles", 200);
		
		// make a ship of declared type WarShip and actual type WarShip
		WarShip Mabel2 = new WarShip("Mabel2", 1985, true, "Transporter", "United States");
		
		
		// using the array initializer syntax, code all of these ships into an array of type Ship named fleet.
		/* Here I initialized the array 
		 * and specified the array size based on the number of Ship instances I created.*/
		Ship[] fleet;
		fleet = new Ship[5];
		fleet[0] = Alexander;
		fleet[1] = Lively;
		fleet[2] = Boris;
		fleet[3] = Mabel;
		fleet[4] = Mabel2;
		
		
		// code a for loop that processes the fleet array to show display all ships and their data.
		// print title "ARRAY OF SHIPS IN MAIN"
		System.out.println("--- ARRAY OF SHIPS IN MAIN ---");
		
		// for loop to show all ships and their data
		for (int i = 0; i < fleet.length; i++) {
			System.out.println();
			System.out.println(fleet[i]);
		}
		
		
		// prints blank line to make the output easier to read
		System.out.println();
		
		
		// use a method of class Arrays to create an ArrayList of type Ship from the fleet array
		ArrayList<Ship> ship_List = new ArrayList<Ship>();
		ship_List.add(Alexander);
		ship_List.add(Lively);
		ship_List.add(Boris);
		ship_List.add(Mabel);
		ship_List.add(Mabel2);
		
		
		// calls the method known as shipShow
		shipShow(ship_List);
		
		
		// report the value of the integer returned by shipShow.
		System.out.println(afloatCount + " of these ships sank!");
		
	}
	
	
	// Had to create a static variable for count of the number of ships that are afloat.
	static int afloatCount = 0;
	
	// pass this ArrayList to a method named shipShow that also displays all ships and returns an integer.
	public static int shipShow(ArrayList<Ship> ship_List) {
		
		// from the ArrayList, remove the CargoShip that was declared as type Ship.
		ship_List.remove(2);
		
		
		// add another WarShip instance to the ArrayList.
		Ship Thomas = new WarShip("Thomas", 1993, true, "Transporter", "United Kingdom");
		ship_List.add(Thomas);
		
		
		// use a foreach loop to process the ArrayList and print the data for each ship.
		
		// prints title for "ARRAY OF SHIPS FROM A METHOD"
		System.out.println("--- ARRAY OF SHIPS FROM A METHOD ---");
		
		
		/* foreach loop to iterate through the array list 
		 * and print the toString methods from each parent/child class.*/
		for (Ship ship: ship_List) {
			System.out.println();
			System.out.println(ship);	
		}
		
		
		// prints blank line to make the output easier to read
		System.out.println();
		
		
		// count the number of ships that are not afloat. Return this count to main for printing.	
		for (Ship ship: ship_List) {
			if (ship.isAfloat() != true) {
				afloatCount ++;	
			}
		}
		// returns totaled value of afloatCount
		return afloatCount;
		
	}
	
}

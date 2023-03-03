//***************************************************************************
// TestAutos for Automobile class M2 Programming assignment                 *
// COP 2251                                                                 *
// By: Michael Napoli                                                       *
// January 23, 2023                                                         *
// Collaboration with: video notes chapter 13 and Oracle Java Documentation *
//***************************************************************************

/* Write a program named TestAutos that creates an ArrayList of five or 
   six Automobiles. 
 * Use a for loop to display the elements in the ArrayList. 
 * Sort the Arraylist of autos by year with Collections.sort(). 
 * Finally, use a foreach loop to display the ArrayList sorted by year.
 */


package napoli13;

import java.util.ArrayList;
import java.util.Collections;


public class TestAutos {
	
	public static void main(String[] args) {
		
		// initialize array list and populate	
		ArrayList<Automobile> autos = new ArrayList<Automobile>();
		autos.add(new Automobile("Honda", "Accord", 2007, 11300.00));
		autos.add(new Automobile("Nissan", "Pathfinder", 2015, 16500.00));
		autos.add(new Automobile("BMW", "528i", 2006, 13200.00));
		autos.add(new Automobile("Volvo", "V60", 2016, 21500.00));
		autos.add(new Automobile("Toyota", "4Runner", 2005, 15800.00));
		
		// use for loop to display elements in array list before sorting
		System.out.println("____Unsorted List____\n");
		for (int i = 0; i < autos.size(); i++) {
			System.out.println(autos.get(i));
		}
		// this is just dividing the terminal output visually
		System.out.println("---------------------------------------------\n");
		
		// sorting array list autos by year
		Collections.sort(autos);
			
		// for each loop to print sorted array list
		System.out.println("____Sorted List By Year____\n");
		for(Automobile au: autos) {
				System.out.println(au.toString());
			}
	}
}
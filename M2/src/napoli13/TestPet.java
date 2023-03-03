//***************************************************************************
// TestPet for M2 Programming assignment                                    *
// COP 2251                                                                 *
// By: Michael Napoli                                                       *
// January 23, 2023                                                         *
// Collaboration with: video notes chapter 13 and Oracle Java Documentation *
//***************************************************************************

/* Create at least one Reptile pet and display it.
 * Create an array of at least four Dog pets.
 * Sort the array of Dogs by weight.
 * Use a for each loop to fully display all data for all dogs sorted by weight.
 * */
 

package napoli13;

import java.util.Arrays;
import java.util.Date;

public class TestPet {
	
	// main method for TestPet
	public static void main(String[] args) {
		
		// create one instance of reptile
		Reptile Clarance = new Reptile("Clarance", 'M', new Date(), "Leopard Gecko");
		
		System.out.println("____Reptile____");
		System.out.println(Clarance.toString());
		System.out.println(Clarance.move());
		System.out.println(Clarance.sound());
		System.out.println(" ");
		
		
		// create 4 instances of dog
		Dog Momo = new Dog("Momo", 'M', new Date(), "Chihuaua", 6);
		Dog Bond = new Dog("Bond", 'M', new Date(), "Husky", 83);
		Dog Daisy = new Dog("Daisy", 'F', new Date(), "English Bulldog", 23);
		Dog Martha = new Dog("Martha", 'F', new Date(), "Dachshund", 13);
		
		// Initialize array of dogs and populate
		Dog[] doggies = new Dog[4];
		doggies[0] = Momo;
		doggies[1] = Bond;
		doggies[2] = Daisy;
		doggies[3] = Martha;
		
		// sort dogs by weight using compareTo method
		Arrays.sort(doggies);
		
		// for each loop to display dogs sorted by weight
		System.out.println("____Dogs Sorted By Weight____");
		for(Dog dog: doggies) {
			System.out.println(dog.toString());
			System.out.println(((Mobility)dog).move());
			System.out.println(dog.sound());
			System.out.println(" ");
		}		
	}
}

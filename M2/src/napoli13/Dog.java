//***************************************************************************
// Dog Class Extends Pet for M2 Programming assignment                      *
// COP 2251                                                                 *
// By: Michael Napoli                                                       *
// January 23, 2023                                                         *
// Collaboration with: video notes chapter 13 and Oracle Java Documentation *
//***************************************************************************

/* Extends Pet.
 * Implements comparable<Dog> and Mobility.
 * Attributes include breed, weight.
 * Super is Pet.
 * Methods for getBreed, getWeight, move, sound, toString.
 * compareTo method sorts digs by weight.
 * */




package napoli13;

import java.util.Date;

// the Dog class extends pet, and also implements comparable and Mobility.
public class Dog extends Pet implements Comparable<Dog>, Mobility{
	
	// attributes for Dog class
	public String breed;
	public int weight;
	
	// constructor for Dog, super is Pet
	public Dog(String name, char gender, Date acquired, String breed, int weight) {
		super(name, gender, acquired);
		this.breed = breed;
		this.weight = weight;
	}
	
	// getters for breed and weight
	public String getBreed() {
		return breed;
	}

	public int getWeight() {
		return weight;
	}

	// move returns string with movement and weight
	public String move() {
		return "Walks on a leash, " + "Weight: " + getWeight() ;
	}
	
	// sound returns sounds and date acquired
	public String sound() {
		return"Barks or howls, " + "Acquired: " + super.getAcquired();
	}
	
	// toString method for Dog
	public String toString() {
		return "Dog Name: " + super.getName() + ", " + getBreed() + ", " + super.getGender();
	}
	
	// comparable interface for Dog
	public int compareTo(Dog dog) {
		// using if statement to sort dogs by weight
		if(weight == dog.weight)
			return 0;
		else if(weight > dog.weight)
			return 1;
		else
			return -1;
	}
	
}

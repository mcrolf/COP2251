//***************************************************************************
// Pet Class for M2 Programming assignment                                  *
// COP 2251                                                                 *
// By: Michael Napoli                                                       *
// January 23, 2023                                                         *
// Collaboration with: video notes chapter 13 and Oracle Java Documentation *
//***************************************************************************

/* Pet class has attributes; name, gender, Date.
 * Constructor for pet.
 * getters for name, gender, Acquired(Date).
 * sound() method.
 * */



package napoli13;

import java.util.Date;

public class Pet {

	// Attributes for Pet class
	public String name;
	public char gender;
	public Date acquired;
	
	// constructor for Pet
	public Pet(String name, char gender, Date acquired) {
		
		this.name = name;
		this.gender = gender;
		this.acquired = acquired;
	}

	// getters for Pet attributes
	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public Date getAcquired() {
		return acquired;
	}
	
	// sound method
	public String sound() {
		return "";
	}
	
	
	
}

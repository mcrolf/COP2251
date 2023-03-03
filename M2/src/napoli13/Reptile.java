//***************************************************************************
// Reptile Class Extends Pet for M2 Programming assignment                  *
// COP 2251                                                                 *
// By: Michael Napoli                                                       *
// January 23, 2023                                                         *
// Collaboration with: video notes chapter 13 and Oracle Java Documentation *
//***************************************************************************

/* Reptile class extends Pet.
 * Implements Mobility.
 * Attributes include type.
 * Methods for getType, move, sound, toString.
 * Super is Pet.
 * */



package napoli13;

import java.util.Date;

public class Reptile extends Pet implements Mobility {

	// attribute for reptile
	public String type;
	
	// constructor for Reptile. super is Pet
	public Reptile(String name, char gender, Date acquired, String type) {
		super(name, gender, acquired);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public String move() {
		return "Must be caged, crawls or slithers";
	}
	
	// sound returns sounds and date acquired
	public String sound() {
		return"Not much sound, maybe a hiss, " + "Acquired: " + super.getAcquired();
	}
	
	// toString method for Reptile
	public String toString() {
		return "Reptile Name: " + super.getName() + ", " + getType() + ", " + super.getGender();
	}
}

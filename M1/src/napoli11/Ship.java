// Ship class for M1 Programming Assignment
// COP 2251
// By: Michael Napoli
// (collaboration with video notes chapter 11 and Oracle Java Documentation)






package napoli11;

// create the class known as "Ship"
public class Ship {

	// create attributes for Ship class
	private String name;
	private int year;
	private boolean isAfloat;
	
	// constructor for Ship class.
	public Ship (String name, int year, boolean isAfloat) {
		this.name = name;
		this.year = year;
		this.isAfloat = isAfloat;
	}

	// gets name for Ship and returns 'name' attribute
	public String getName() {
		return name;
	}

	// gets year for Ship and returns 'year' attribute
	public int getYear() {
		return year;
	}

	// determines if parameter 'isAfloat' is set to be true.
	public boolean isAfloat() {
		return isAfloat;
	}

	// sets value of 'isAfloat'. can be true or false
	public void setAfloat(boolean isAfloat) {
		this.isAfloat = isAfloat;
	}
	
	// toString method for formatted output of Ship with known attributes
	public String toString() {
		return "Ship Name: " + name + ", Year launched: " + year + ", Is Afloat: " + isAfloat + "\n";
	} 
	
}

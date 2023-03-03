// CruiseShip sub-class for M1 Programming Assignment
// COP 2251
// By: Michael Napoli
// (collaboration with video notes chapter 11 and Oracle Java Documentation)




package napoli11;

// create class 'CruiseShip' that extends the parent class 'Ship'
public class CruiseShip extends Ship{

	// attributes for CruiseShip
	private int passengers;
	private String zone;
	
	// constructor for cruise ship. contains super for Ship
	public CruiseShip(String name, int year, boolean isAfloat, int passengers, String zone) {
		super(name, year, isAfloat);	
		this.passengers = passengers;
		this.zone = zone;
	}

	// getter for passengers
	public int getPassengers() {
		return passengers;
	}
	
	// getter for zone
	public String getZone() {
		return zone;
	}
	
	// toString method for formatted output of CruiseShip attributes
	public String toString() {
		return super.toString() + passengers + " passenger capacity, operating in the " + zone + ".";
	} 
	
}

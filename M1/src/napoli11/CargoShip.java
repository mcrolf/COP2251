// CargoShip sub-class for M1 Programming Assignment
// COP 2251
// By: Michael Napoli
// (collaboration with video notes chapter 11 and Oracle Java Documentation)




package napoli11;

// create class 'CargoShip' that extends the parent class 'Ship'
public class CargoShip extends Ship{

	// attributes for CargoShip
	private String cargo;
	private int capacity;
	

	// constructor for CargoShip.Contains super for "Ship"
	public CargoShip(String name, int year, boolean isAfloat, String cargo, int capacity) {
		super(name, year, isAfloat);
		this.cargo = cargo;
		this.capacity = capacity;
	}

	// gets the capacity of CargoShip
	public int getCapacity() {
		return capacity;
	}
	
	// toString method for formatted output of CargoShip attributes
	public String toString() {
		return super.toString() + "Capacity of " + cargo + " is: " + capacity + ".";
	}
}

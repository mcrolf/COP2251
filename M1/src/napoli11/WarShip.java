// WarShip sub-class for M1 Programming Assignment
// COP 2251
// By: Michael Napoli
// (collaboration with video notes chapter 11 and Oracle Java Documentation)





package napoli11;

// create class 'WarShip' that extends the parent class 'Ship'
public class WarShip extends Ship{

	// attributes for WarShip
	private String type;
	private String nation;
	
	// constructor for WarShip. Contains super for "Ship"
	public WarShip(String name, int year, boolean isAfloat, String type, String nation) {
		super(name, year, isAfloat);
		this.type = type;
		this.nation = nation;
	}
	
	// toString method for formatted output of WarShip attributes
	public String toString() {
		return super.toString() + "Type: " + type + ", operated by: " + nation + ".";
	}
}

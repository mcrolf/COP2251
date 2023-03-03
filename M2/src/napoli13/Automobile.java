//***************************************************************************
// Automobile Class for M2 Programming assignment                           *
// COP 2251                                                                 *
// By: Michael Napoli                                                       *
// January 23, 2023                                                         *
// Collaboration with: video notes chapter 13 and Oracle Java Documentation *
//***************************************************************************

/* Create a data class named Automobile that implements the Comparable interface. 
 * Give the class data fields for make, model, year, and price. 
 * Then add a constructor, all getters, a toString method that shows all 
   attribute values, and implement Comparable by using the year as the criterion 
   for comparing instances.
 */



package napoli13;

// Class for Automobile
class Automobile implements Comparable<Automobile> {

	// Initialize attributes for Automobile class
	String make;
	String model;
	int year;
	double price;
	
	// Constructor for Automobile
	Automobile(String make, String model, int year, double price) {
		
		// using this.attribute
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	// getters and setters for Automobile
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	// Comparable interface for Automobile class
	public int compareTo(Automobile au) {
		
		// using if else statements for comparing year
		if(year == au.year)
			return 0;
		else if(year > au.year)
			return 1;
		else {
			return -1;
		}
		
	}
	
	// toString method for Automobile
	public String toString() {
		return "Year= " + year +  ", make= " + make + ", model= " + model + ", price= $" + price;
	}

}



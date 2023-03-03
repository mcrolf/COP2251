//***********************************************************************************
// Employee Class for Chapter 20
// COP2251 with Professor Cutler
// By: Michael Napoli 2275778
// Collaboration: Intro to Java Programming and Data Structures 12th Edition
//                Chapter 20 Powerpoint
//                Online documentation from Oracle
//                Javatpoint.com Online Documentation
//***********************************************************************************

//***********************************************************************************
/* Class: Employee
 * id: string
 * lastName: string
 * firstName: string
 * salary: int
 * 
 * Methods:
 * Parameterized constructor for initializing a new Employee instance
 * Getters for all attributes
 * toString method to display an Employee's attributes
 * */
//***********************************************************************************

package napoli20;

public class Employee {
	
	// Init parameters for employee
	String iD;
	String lastName;
	String firstName;
	int salary;
	
	// Parameterized constructor for Employee
	public Employee (String iD, String lastName, String firstName, int salary) {
		this.iD = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	// get iD
	public String getiD() {
		return iD;
	}
	
	// get last name
	public String getLastName() {
		return lastName;
	}
	
	// get first name
	public String getFirstName() {
		return firstName;
	}
	
	// get salary
	public int getSalary() {
		return salary;
	}
	
	// to string method
	public String toString() {
		return ("ID: " + iD + ": " + lastName + ", " + firstName + ", Salary: $" + salary);
	}
		
}
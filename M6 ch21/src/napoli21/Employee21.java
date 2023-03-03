//***********************************************************************************
// Employee Class for Chapter 21
// COP2251 with Professor Cutler
// By: Michael Napoli 2275778
// Collaboration: Intro to Java Programming and Data Structures 12th Edition
//                Chapter 21 Powerpoint
//                Online documentation from Oracle
//                Javatpoint.com Online Documentation
//***********************************************************************************


package napoli21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Employee21 {
	
	// Init parameters for employee
	String iD;
	String lastName;
	String firstName;
	int salary;
	
	// Parameterized constructor for Employee
	public Employee21 (String iD, String lastName, String firstName, int salary) {
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


class ExecuteEmployee21 {
	
	public static void main(String[] args) {
		
		// create an array of employees
		Employee21 employees[] = new Employee21[8];
				
		// add employees to array
		employees[0] = new Employee21("22789", "Smith" , "Samuel", 73000);
		employees[1] = new Employee21("22790", "Smith", "Matthew", 68000);
		employees[2] = new Employee21("22791", "Neumann", "David", 88000);
		employees[3] = new Employee21("22763", "Chu", "Jon", 93000);
		employees[4] = new Employee21("22654", "Crink", "Roger", 84000);
		employees[5] = new Employee21("22745", "Smith", "Carl", 96000);
		employees[6] = new Employee21("22376", "Forger", "LLoyd", 103000);
		employees[7] = new Employee21("23249", "Smith", "Anya", 94000);
		
		// make an array list from the array
		List<Employee21> unsortEmployeeList = new ArrayList<Employee21>();
		Collections.addAll(unsortEmployeeList, employees);
		
		// enhanced for loop to print all employees
		System.out.println("All Employees");
		System.out.println();
		for (Employee21 e: unsortEmployeeList)
			System.out.println(e.toString() + "");
		
		// create treemap for employees list
		TreeMap<String, Employee21> employeeTree = new TreeMap<String, Employee21>();
		
		// populate employee tree map with employees
		employeeTree.put(employees[0].getiD(), employees[0]);
		employeeTree.put(employees[1].getiD(), employees[1]);
		employeeTree.put(employees[2].getiD(), employees[2]);
		employeeTree.put(employees[3].getiD(), employees[3]);
		employeeTree.put(employees[4].getiD(), employees[4]);
		employeeTree.put(employees[5].getiD(), employees[5]);
		employeeTree.put(employees[6].getiD(), employees[6]);
		employeeTree.put(employees[7].getiD(), employees[7]);
		
		// using lambda expression and foreach method to print treemap
		System.out.println();
		System.out.println("Employees By ID #");
		System.out.println();
		
		Set<String> keys = employeeTree.keySet();
		
		keys.forEach( key -> {System.out.println(employeeTree.get(key));});
		
		
	}
}
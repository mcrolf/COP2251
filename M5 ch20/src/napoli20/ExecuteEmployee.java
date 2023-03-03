//***********************************************************************************
// Executable Program for Chapter 20
// COP2251 with Professor Cutler
// By: Michael Napoli 2275778
// Collaboration: Intro to Java Programming and Data Structures 12th Edition
//                Chapter 20 Powerpoint
//                Online documentation from Oracle
//                Javatpoint.com Online Documentation
//***********************************************************************************

//***********************************************************************************
/* Create an array of at least eight Employee objects.
 * Be sure to use many with identical last names, but don't order them by name 
   in the array.
 * Create an ArrayList from the array
 * Sort the ArrayList first by last name and then by first name.
 * Using the forEach method and a lambda expression, print all employees alphabetically 
   sorted by name.
 * Create a LinkedList from the ArrayList
 * Create an iterator capable of cycling both forward and backward through 
   the LinkedList.
 * Iterate forward through the LinkedList without generating any output.
 * Then iterate backwards through the LinkedList to print the employees in reverse 
   alphabetical order. 
 * */

//***********************************************************************************

package napoli20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

class ExecuteEmployee {
	
	public static void main(String[] args) {
		
		// create an array of employees
		Employee employees[] = new Employee[8];
		
		// add employees to array
		employees[0] = new Employee("22789", "Smith" , "Samuel", 73000);
		employees[1] = new Employee("22790", "Smith", "Matthew", 68000);
		employees[2] = new Employee("22791", "Neumann", "David", 88000);
		employees[3] = new Employee("22763", "Chu", "Jon", 93000);
		employees[4] = new Employee("22654", "Crink", "Roger", 84000);
		employees[5] = new Employee("22745", "Smith", "Carl", 96000);
		employees[6] = new Employee("22376", "Forger", "LLoyd", 103000);
		employees[7] = new Employee("23249", "Smith", "Anya", 94000);
		
		// make an array list from the array
		List<Employee> unsortEmployeeList = new ArrayList<Employee>();
		Collections.addAll(unsortEmployeeList, employees);
		
		// sort by last name and first name using comparator lambda expressions
		Comparator<Employee> lastNameComparator = (e1, e2) -> e1.getLastName().compareTo(e2.getLastName());
		Comparator<Employee> firstNameComparator = (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName());
		
		// sorting on multiple fields using lambda expressions
		List<Employee> sortedEmployeeList = unsortEmployeeList
				.stream()
				.sorted(
				lastNameComparator
				.thenComparing(firstNameComparator)).collect(Collectors.toList());
		
		// output for sorted list of employees
		System.out.println(" ");
		System.out.println("Employees Sorted by Names:");
		System.out.println(" ");
		for (Employee e: sortedEmployeeList) {
			System.out.println(e.toString());
		}
		
		// create linked list from sorted list
		LinkedList<Employee> linkedEmployeeList = new LinkedList<Employee>(sortedEmployeeList);
		
		// create iterator for array list. capable of going forward and backward.
		ListIterator<Employee> iterate = linkedEmployeeList.listIterator(linkedEmployeeList.size());
		
		// output for reverse sorted list of employees
		// iterates forward without output
		// then iterates backwards and outputs list in reverse order
		System.out.println(" ");
		System.out.println("Employees sorted in reverse order:");
		System.out.println(" ");
		while (iterate.hasNext()) {
			iterate.next();
		}
		while (iterate.hasPrevious()) {
			System.out.println(iterate.previous());
		}
		
		
	}
	
}
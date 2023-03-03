//***********************************************************************************
// Program for Chapter 19
// COP2251 with Professor Cutler
// By: Michael Napoli 2275778
// Collaboration: Intro to Java Programming and Data Structures 12th Edition
//                Online documentation from Oracle
//                Javatpoint.com Online Documentation
//***********************************************************************************


package napoli19;

import java.util.ArrayList;


class ch19program <E>{

	// create array list of generic type
	private ArrayList<E> list = new ArrayList<>();
	
	public static void main (String[] args) {
		
		// create some arrays
		Integer[] intArr = {12, 21, 7, 16, 8, 13};
		String[] strArr = {"one", "two", "three", "four"};
		Double[] dubArr = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		// call method getSize with array as argument
		ch19program.<Integer>getSize(intArr);
		ch19program.<String>getSize(strArr);
		ch19program.<Double>getSize(dubArr);
		
		// create another array. add to array list of type Integer
		Integer[] intArr2 = {12, 21, 7, 16, 8, 13};
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (Integer element : intArr2)
			intList.add(element);
		
		// create another array. add to array list of type Double
		Double[] dubArr2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
		ArrayList<Double> dubList = new ArrayList<Double>();
		for (Double element : dubArr2)
			dubList.add(element);
		
		// create another array. add to array list of type Byte
		Byte[] bytArr = {12, 20, 4, 7};
		ArrayList<Byte> bytList = new ArrayList<Byte>();
		for (Byte element : bytArr)
			bytList.add(element);
		
		// call method for getting total from list
		ch19program.<Integer>listAdder(intList);
		ch19program.<Double>listAdder(dubList);
		ch19program.<Double>listAdder(bytList);
		
		// print elements in Integer list and display total
		for (Integer element : intArr2)
			System.out.print(element + " ");
		System.out.println();
		System.out.println("Integer list total is " + listAdder(intList));
		System.out.println();
		
		// print elements in Double list and display total
		for (Double element : dubArr2)
			System.out.print(element + " ");
		System.out.println();
		System.out.println("Double list total is " + listAdder(dubList));
		System.out.println();
		
		// print elements in Byte list and display total
		for (Byte element : bytArr)
			System.out.print(element + " ");
		System.out.println();
		System.out.println("Byte list total is " + listAdder(bytList));
		System.out.println();
		
	}
	
	// method to get size of list. pass generic type as argument
	public static <E> void getSize(E[] list) {
		
		// get class of array and make it a string
		String typ = list[0].getClass().toString();
		
		// conditions for class type
		if (typ.contains("Integer"))
			System.out.println("Here is an Integer array:");
		
		if (typ.contains("String"))
			System.out.println("Here is a String array");
		
		if (typ.contains("Double"))
			System.out.println("Here is a Double array");
		
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		
		// print number of elements in array
		System.out.println();
		System.out.println("That array held " + list.length + " elements.");
		System.out.println();
	}
	
	
	// method for finding total of list. 
	public static double listAdder (ArrayList<? extends Number> list) {
		
		// init total and set to 0
		double total = 0;
		
		// accumulate total
		for (Number element: list)
			total += element.doubleValue();
		
		return total;
		
	}
	
	
}
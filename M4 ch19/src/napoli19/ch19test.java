//***********************************************************************************
// Test Program for Chapter 19
// COP2251 with Professor Cutler
// By: Michael Napoli 2275778
// Collaboration: Intro to Java Programming and Data Structures 12th Edition
//                Online documentation from Oracle
//                Javatpoint.com Online Documentation
//***********************************************************************************


/* Method: public static <E extends Comparable<E>> E max(E[] list)
 * 
 * Write a test program that generates 10 random integers, invokes this method to 
   find the max, and then displays the random integers sorted smallest to largest 
   and then prints the value returned from the method.
   
 * Make sure the the last sorted and returned value as the same!
 * */
 

package napoli19;

import java.lang.Math;
import java.util.Arrays;


public class ch19test {
	
	public static void main (String[] args) {
		
		// create array of 10 random ints. between 1 and 100
		Integer [] list = new Integer[10];
		for (int i = 0; i < list.length; i++)
			list[i] = (int)(Math.random() * (100 - 1 + 1) + 1);
		
		// sort array from small to large
		Arrays.sort(list);
		
		// print list in ascending order
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
		
		// print max element in list
		System.out.println("Max = " + max(list));
		
	}
	
	// method for finding max element in list
	public static <E extends Comparable<E>> E max(E[] list) {
		
		// init max as generic type
		E max = list[0];
		
		// iterate through list and compare to find max
		for (int i = 0; i < list.length; i++) {
			E element = list[i];
			
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		
		return max;
	}
	
	
}
package day09.practice;

/**
 * Using the ArrayList<Integer> sort a list of integers read from the user.
 * Sample Input: Enter numbers: 8 9 45 12 1 5
 * Sample Output: Sorted list: 1 5 8 9 12 45
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortWithInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> integer = new ArrayList<Integer>();
		integer.add(8);
		integer.add(9);
		integer.add(45);
		integer.add(12);
		integer.add(1);
		integer.add(5);
		
		System.out.println("Before Sort = " + integer);
		
		Collections.sort(integer);
		
		System.out.println("After Sort = "+ integer);
	}
}
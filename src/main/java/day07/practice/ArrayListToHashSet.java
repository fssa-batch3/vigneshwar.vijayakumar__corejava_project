package day07.practice;

//Create an ArrayList<Integer> of numbers with duplicate entries. Use an HashSet<Integer> to remove the duplicates and display the Unique values

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListToHashSet {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(4);
		list.add(2);
		list.add(4);
		
		Set<Integer> set = new HashSet(list);
		
		System.out.println(set);
		
	}

}
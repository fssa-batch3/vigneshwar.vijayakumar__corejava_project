package day06.practice;

//Add logic to remove duplicate tasks from the ArrayList

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateElementInArrayList {

		public static void main(String[] args) {
			
			List<String> cityList = new ArrayList<String>();
			cityList.add("Chennai");
			cityList.add("Bangalore");
			cityList.add("Mumbai");
			cityList.add("Mumbai");
			
            //Before deleting the duplicates
			System.out.println("Before deleting the duplicates: \n" + cityList);
			
	        //Add logic to remove the duplicate Array and 
			List<String> anotherArr = removeDuplicate(cityList);
			
	        //store the unique city name is an another ArrayList
			System.out.println("After deleting duplicates: \n" + anotherArr); // after deleting duplicates
			
		}

		public static ArrayList<String> removeDuplicate(List<String> arr) {
			HashSet<String> set = new HashSet<>(arr);
			ArrayList<String> UniqueValues = new ArrayList<>(set);

			return UniqueValues;

		}
	}

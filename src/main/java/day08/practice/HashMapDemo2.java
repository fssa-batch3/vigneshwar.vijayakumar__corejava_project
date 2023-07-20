package day08.practice;

/**
 * Read comma separated list of names from the user and print count 
 * HINT: Use a `HashMap<String, Integer>`
 * Sample Input
 * Enter the string: Ram, Ram, Superman, Spider, hey, hello, hey, Spider
 * Output: Ram: 2, Superman: 1, Spider: 2, hey: 2, hello: 1
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo2 {
	
	public static void main(String[] args) {

	String[] names = {
	        "Ram",
	        "Ram",
	        "Superman",
	        "Spider",
	        "hey",
	        "hello",
	        "hey",
	        "Spider"
	    };

	    Map<String, Integer> nameCount = new HashMap<>(); // { "Ram": 2, "Superman": 1, "Spider": 2, "hey": 2 , "hello": 1 }

	    for (String name : names) {
	      int count = nameCount.getOrDefault(name, 0);
	      nameCount.put(name, count + 1);
	    }

	    // keySet() => [ "Ram", "Superman", "Spider", "hey", "hello" ]
	    for (String key : nameCount.keySet()) {
	      System.out.println(key);
	    }

	    // values() => [ 2, 1, 2, 2, 1 ]
	    for (Integer value : nameCount.values()) {
	      System.out.println(value);
	    }

	    // entrySet() => [ {"Ram", 2}, {"Superman": 1} , {"Spider": 2} , {"hey": 2 } ,
	    // {"hello": 1 } ]value
	    for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
	      System.out.println(entry.getKey() + ": " + entry.getValue());
	    }
	  }

}		
	
 /** Using the Scanner Method:
	
    public static void main(String[] args) {
        HashMap<String, Integer> nameCountMap = new HashMap<>();

       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        String[] names = input.split(", ");

        // Count the occurrences of each name
         
        for (String name : names) {
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        // Print the count of each name 
         
        for (String name : nameCountMap.keySet()) {
            int count = nameCountMap.get(name);
            System.out.println(name + ": " + count);
        }
    }
}

*/
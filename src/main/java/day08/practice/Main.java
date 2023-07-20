package day08.practice;

/**
 * Write code to read a comma separated DeptName, EmployeeName and output DeptName, List of Employees HINT: Use `HashMap<String, List<String>>`
 * Sample Input: HR,Ram HR, Suresh IT, Basker IT, Joseph Admin, Sundar
 * Output: HR: Ram, Suresh IT: Basker, Joseph Admin: Sundar
 */

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] inputs = { // => { "HR ": ["Ram", "Suresh"] , "IT": [ "Basker", "Josepg"] }
		        "HR,Ram",
		        "HR,Suresh",
		        "IT,Basker",
		        "IT,Joseph",
		        "Admin,Sundar"
		    };

		    Map<String, List<String>> departmentEmployees = new HashMap<>();

		    for (String input : inputs) {
		      String[] pair = input.split(",");
		      String department = pair[0].trim();
		      String employee = pair[1].trim();

		      // departmentEmployees.put(department, new ArrayList<>());
		      // { "HR": [ "Ram", "Suresh" ] }

		      departmentEmployees.putIfAbsent(department, new ArrayList<>());
		      departmentEmployees.get(department).add(employee);
		    }

		    // Get the entry set from the map
		    Set<Map.Entry<String, List<String>>> entries = departmentEmployees.entrySet();
		    // [ { "HR": [ "Ram", "Suresh" ] }, {}, {}, {} ]

		    // Get an iterator for the entry set
		    Iterator<Map.Entry<String, List<String>>> iterator = entries.iterator();

		    // Iterate over the entries
		    while (iterator.hasNext()) {
		      Map.Entry<String, List<String>> entry = iterator.next();
		      System.out.println(entry.getKey() + ": " + entry.getValue());
		    }
	}
}
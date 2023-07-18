package day06.practice;

//Write a method called `findTaskByName(String name, ArrayList<Task> tasks)`  from the `tasks` list and return `boolean`

import java.util.*;

public class findTaskByName {

	public static boolean find(String name , ArrayList<Task> tasks) {
		   for(Task task : tasks) {
		        if(task.taskName.equals(name)) {
		            return true;
		        }
		    }
		    return false;
		}
	
	public static void main(String[] args) {
	ArrayList<Task> tasks = new ArrayList<>();
	tasks.add(new Task("Wake up" , 1));  
	tasks.add(new Task("Brushing and Bathing" , 2));  
	tasks.add(new Task("Walking to the office" , 1));  
	tasks.add(new Task("Eat Breakfast" , 2));

	
	if(find("Wake up",tasks)) {
		System.out.print("Found");       //Found
	}else {
		System.out.print("Not Found");   //If we make small mistake, it will show Not Found.
	}
	
	
	}
}

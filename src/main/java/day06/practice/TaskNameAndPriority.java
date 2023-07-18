package day06.practice;

//Create an ArrayList<Task> store the  task details

import java.util.*;

public class TaskNameAndPriority {

	public static void main(String[] args) {
	ArrayList<Task> tasks = new ArrayList<>();
	tasks.add(new Task("Wake up" , 1));  
	tasks.add(new Task("Brushing and Bathing" , 2));  
	tasks.add(new Task("Walking to the office" , 1));  
	tasks.add(new Task("Eat Breakfast" , 2));
	
	for(Task task : tasks) {
		System.out.println("Task : " + task.taskName + " , Priority :" + task.priority);
	}
	
	
	}
}
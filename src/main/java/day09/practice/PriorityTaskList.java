package day09.practice;

/**
 * Learn about Comparator and try implementing a logic where we take additional attribute for the Task called “priority” and 
 * if two tasks are pending on the same day, the sorting should be able to sort using both deadline and priority.
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Task2 {
	
    private int id;
    private String name;
    private LocalDate deadline;
    private int priority; // New attribute for priority

    public Task2(int id, String name, LocalDate deadline, int priority) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }
}

public class PriorityTaskList {

	public static void main(String[] args) {
		
		List<Task2> taskList = new ArrayList<>();
		taskList.add(new Task2(3, "Coding", LocalDate.of(2022, 10, 22), 1));
		taskList.add(new Task2(5, "Product Design", LocalDate.of(2022, 10, 1), 3));
		taskList.add(new Task2(1, "Software Design", LocalDate.of(2022, 10, 7), 2));
		taskList.add(new Task2(3, "Coding", LocalDate.of(2022, 10, 22), 1));
		
		Collections.sort(taskList, Comparator.comparing(Task2::getDeadline).thenComparing(Task2::getPriority));
		
		 for (Task2 task : taskList) {
	            System.out.println(task.getId() + ", " + task.getName() + ", " + task.getDeadline() + ", " + task.getPriority());
	        }	
	}
}
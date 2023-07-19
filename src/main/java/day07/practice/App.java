package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Task task1 = new Task(123, "Read", LocalDate.of(2023, 12, 25));
		Task task2 = new Task(124, "Read", LocalDate.of(2023, 12, 25));

		List<Task> tasks = new ArrayList<>();
		
		tasks.add(task1);
		tasks.add(task2);
		
		Set<Task> taskSet = new HashSet<>(tasks);
		
		System.out.println(taskSet);
	}

}
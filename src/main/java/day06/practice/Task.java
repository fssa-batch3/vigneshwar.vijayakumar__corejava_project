package day06.practice;

//Create an ArrayList<Task> store the  task details

public class Task {

	    public String taskName;
	    public int priority;
	    
	    public Task(String taskName , int priority) {
	    	 this.taskName = taskName;
	    	 this.priority = priority;
	     }
	    
	    public String getTaskName() {
			return taskName;
		}
		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}
		public int getPriority() {
			return priority;
		}
		public void setPriority(int priority) {
			this.priority = priority;
		}
		
	

}

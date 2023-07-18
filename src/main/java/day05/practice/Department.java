package day05.practice;

/**
 * Create a constructor and assign department and respective attributes
 * Add toString method to get the Student details. 
 * Create a main class to create a Student and Department objects and print the details
 * @author VigneshwarVijayakuma
 */

class Department {
	String deptName;
	int deptId;

	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "[deptName = " + deptName + ", deptId = " + deptId + "]";
	}

}

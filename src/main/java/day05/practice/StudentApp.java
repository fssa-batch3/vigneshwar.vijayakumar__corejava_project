package day05.practice;

public class StudentApp {
public static void main(String[] args) {
	Department myDep = new Department("Computer Science Engineering", 24);
	Student student = new Student("Vignesh", 45345, myDep);
	System.out.println(student.toString());
	//Student [Name = Vignesh, ID = 45345, Department = [deptName = Computer Science Engineering, deptId = 24]]
	
}
}
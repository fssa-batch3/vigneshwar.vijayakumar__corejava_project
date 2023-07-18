package day05.practice;

class Student {
	String name;
	int id;
	Department department;
	
	public Student(String name, int id, Department department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Student [Name = " + name + ", ID = " + id + ", Department = " + department.toString() + "]";
	}

}

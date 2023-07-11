package day02.misc;

public class Student {

	String name;
	String email;
	int id;
	public static String academy;
	static int count = 0;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public int getId() {
		return id;
	}

	public void setId(int newId) {
		id = newId;
	}

	static {
		academy = "fssa";
	}

	public Student() {
		Student.count++;
	}
}

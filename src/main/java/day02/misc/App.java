package day02.misc;

public class App {

	public static void main(String[] args) {
		Academy academy = new Academy();
		academy.setName("Freshworks Software Academy");
		academy.setId(24);
		academy.setCode("fssa");

		Student student1 = new Student();
		student1.setName("VV");
		student1.setEmail("vv@gmail.com");
		student1.setId(0001);
		System.out.println(Student.count);

		Student student2 = new Student();
		student2.setName("Thilagan");
		student2.setEmail("thilagan@gmail.com");
		student2.setId(0002);
		System.out.println(Student.count);

	}
}

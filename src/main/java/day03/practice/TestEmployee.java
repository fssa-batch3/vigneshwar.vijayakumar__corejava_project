package day03.practice;

public class TestEmployee {

	public static void main(String[] args) {

        Employee e1 = new Employee(1, "naresh");
        
        System.out.println("id="+ e1.getId() + ", " + "name=" + e1.getName() );  //Output: id=1, name=naresh        
        Employee e2 = new Employee(2, "suresh");

        System.out.println("id="+ e2.getId() + ", " + "name=" + e2.getName() );  //Output: id=2, name=suresh
	}

}
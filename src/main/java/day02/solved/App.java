package day02.solved;

//App file for all the files in Day02.Solved

public class App {

	public static void main(String[] args) {
		
	//Task: Adding Getters/Setters for Encapsulations	
		
	Person1 person1 = new Person1();
	person1.setName("John");             // Setting the name using the setter method
	String name1 = person1.getName();   // Accessing the name using the getter method
	System.out.println(name1);         // Output: John
	
	//Task: Using this keyword
	
	Person2 person2 = new Person2();
	person2.setName("John");            // Setting the name using the setter method
	String name2 = person2.getName();  // Accessing the name using the getter method
	System.out.println(name2);        // Output: John
	
	//Task: Add Getters/Setters BankAccount
	
    BankAccount acct1 = new BankAccount();
    acct1.setAccNo("A101");
    acct1.setName( "Krishna" );
    acct1.setBalance(1000);

    System.out.println(acct1.getAccNo());      //A101
    System.out.println(acct1.getName());      //Krishna
    System.out.println(acct1.getBalance());  //1000.0
    
    //Task: Use the same function to calculate the area of a circle and a rectangle
    
    ShapeCalculator calculator = new ShapeCalculator();
    double circleArea = calculator.calculateArea(3.5);                     
    double rectangleArea = calculator.calculateArea(4.2, 6.8);            
    System.out.println(circleArea);              // Output: 38.48451000647496
    System.out.println(rectangleArea);          // Output: 28.559999999999995
    
    //Task: Function overloading for different datatypes
    
    Calculator calc = new Calculator();
    System.out.println(calc.add(2, 3));                // Output: 5
    System.out.println(calc.add(2.5, 3.7));           // Output: 6.2
    System.out.println(calc.add("Hello", "World"));  // Output: HelloWorld
	
}
}


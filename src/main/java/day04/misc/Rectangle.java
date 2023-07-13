package day04.misc;

/**
 * Create a Rectangle class. Attributes should be `length` and `breadth`. Make them `protected`. Create a child class called Square. 
     a. Create constructors for both the classes. Generate getters and setters.
     b. Access the getLength method using the Square object. Access the `calculateArea` method using the Square object.
    
 * @author VigneshwarVijayakuma
 *
 */

public class Rectangle {

	protected double length;
	protected double breadth;

	public Rectangle(double length, double breadth) throws Exception {
		if (length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	public double calculateArea() {
		return this.length * this.breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
}

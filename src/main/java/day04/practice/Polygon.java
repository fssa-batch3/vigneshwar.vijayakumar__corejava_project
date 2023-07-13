package day04.practice;

/**
 * Create a Circumference method to Polygon abstract class and implement it in the 
   1. Rectangle Class from solved example
   2. Create a new RightAngledTriangle class using Rectangle class example.
 * @author VigneshwarVijayakuma
 *
 */

public abstract class Polygon {
	
	protected int numberOfSides;
	
	public Polygon (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}
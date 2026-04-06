/**
 * 
 */

/**
 * 
 */
public class TestSimpleCircle
{
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Create a circle with radius 1
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

		// Create a circle with radius 25
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

		// Create a circle with radius 125
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

		// Modify circle radius
		circle2.radius = 100; // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

		// Rectangle
		Rectangle rectangle1 = new Rectangle();
		System.out.println("The area of the rectangle " + rectangle1.area + " is" + rectangle1.getRectangleArea());
	}
}

// Define the circle class with two constructors
class SimpleCircle
{
	double radius;

	/** Construct a circle with radius 1 */
	SimpleCircle()
	{
		radius = 1;
	}

	/** Construct a circle with a specified radius */
	SimpleCircle(double newRadius)
	{
		radius = newRadius;
	}

	/** Return the area of this circle */
	double getArea()
	{
		return radius * radius * Math.PI;
	}

	/** Return the perimeter of this circle */
	double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}

	/** Set a new radius for this circle */
	void setRadius(double newRadius)
	{
		radius = newRadius;
	}

}

class Rectangle
{
	private double length = 0;
	private double width = 0;
	private double area = 0;

	double getRectangleArea()
	{

		return length * width;
	}

}

/**
 * 
 */
public class CarDealershipProblem
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Car car1 = new Car("Lexus", "GX550", 90000);
		Car car2 = new Car("Porsche", "911 GT3", 225000);
		Car car3 = new Car("Cadillac", "CTV-5 Blackwing", 115000);

		car1.displayCarDetails();
		System.out.println();

		car2.displayCarDetails();
		System.out.println();

		car3.displayCarDetails();
		System.out.println();

	}

}// End of main

class Car
{
	private String make;
	private String model;
	private double cost;

	public Car(String make, String model, double cost)
	{
		this.make = make;
		this.model = model;
		this.cost = cost;

	}

	public String getMake()
	{
		return make;
	}// End of getMake method

	public String getModel()
	{
		return model;
	}// End of getModel method

	public double getCost()
	{
		return cost;
	}// End of getCost method

	public void displayCarDetails()
	{
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Cost: " + cost);
	}

} // End of Class Car

class Dealership
{
	private String name;
	private Car[] cars;
	int currentNumberCars;

	public Dealership(String name, int maxNumberCars)
	{
		this.name = name;
		cars = new Car[maxNumberCars];
		currentNumberCars = 0;
	}

	public String getDealershipName()
	{
		return name;
	}

	public void addCar(Car newCar)
	{

	}

	public Car findMostExpensiveCar()
	{

		Car findMostExpensiveCar = cars[0];

		for (int index = 1; index < currentNumberCars; index++)
		{
			if (cars[index].getCost() > findMostExpensiveCar.getCost())
			{
				findMostExpensiveCar = cars[index];
			}
		}
		return findMostExpensiveCar;
	}

	public void displayCars()
	{

	}

	public void writeCarsToFile()
	{

	}

}


/**
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CarDealershipProblem
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// [] carList = new Car[3];

		Car car1 = new Car("Lexus", "GX550", 90000);
		Car car2 = new Car("Porsche", "911 GT3", 225000);
		Car car3 = new Car("Cadillac", "CTV-5 Blackwing", 115000);

		Dealership dealer = new Dealership("Pete's Autos", 3);

		dealer.addCar(car1);
		dealer.addCar(car2);
		dealer.addCar(car3);
		dealer.displayCars();
		System.out.println();

		dealer.findMostExpensiveCar().displayCarDetails();
		System.out.println();

		try
		{
			Dealership dealership = new Dealership("Pete's Autos", 3);
			dealership.writeCarsToFile("Pete's_Autos.txt");
		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find this file: ");
		}
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
		if (currentNumberCars < cars.length)
		{
			cars[currentNumberCars] = newCar;
			currentNumberCars++;
		}

		else
		{
			System.out.println("Dealership is full.");
		}
	}

	public Car findMostExpensiveCar()
	{

		Car findMostExpensiveCar = cars[0];

		for (int index = 1; index < currentNumberCars; index++)
		{
			if (cars[index].getCost() > findMostExpensiveCar.getCost())
			{
				findMostExpensiveCar = cars[index];
				System.out.println("Most Expensive Car: ");
			}
		}
		return findMostExpensiveCar;
	}

	public void displayCars()
	{
		for (int index = 0; index < currentNumberCars; index++)
		{
			cars[index].displayCarDetails();
			System.out.println();
		}
	}

	public void writeCarsToFile(String fileName) throws FileNotFoundException
	{
		File outputFile = new File(fileName);
		PrintWriter fileWriter = new PrintWriter(outputFile);
		fileWriter.println("Write Information");
		fileWriter.close();
		System.out.println("Data Written to File: " + outputFile.getAbsolutePath());
	}

}
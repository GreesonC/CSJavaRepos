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

		// int[] cars = new int[3];
		Car car1 = new Car("Lexus");
		Car car2 = new Car("Toyota");
		Car car3 = new Car("Porche");
	}

}// End of main

class Car
{
	private String make;
	private String model;
	private double cost;

	public String getMake()
	{
		return make;
	}// End of getMake method

	public void setMake(String make)
	{
		this.make = make;
	}

	public String getModel()
	{
		return model;
	}// End of getModel method

	public double getCost()
	{
		return cost;
	}// End of getCost method

	public void displayCarDetails(String make, String model, double cost)
	{

	}

} // End of Class Car
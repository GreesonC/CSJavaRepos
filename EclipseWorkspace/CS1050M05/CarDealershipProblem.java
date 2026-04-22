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
		Car car1 = new Car();
		car1.setMake("Lexus");
		car1.setModel("GX550");
		car1.setCost(90000);

		Car car2 = new Car();
		Car car3 = new Car();

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

	public void setModel(String model)
	{
		this.model = model;
	}

	public double getCost()
	{
		return cost;
	}// End of getCost method

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public void displayCarDetails(String make, String model, double cost)
	{
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Cost: " + cost);
	}

} // End of Class Car
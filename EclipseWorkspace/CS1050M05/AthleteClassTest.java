
/**
 * 
 */
public class AthleteClassTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Athlete athlete1 = new Athlete();
	}

}

class Athlete
{
	private String name;
	private double weight;
	private double height;
	private int age;

	public Athlete(String name, double weight, double height, int age)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public double getHeight()
	{
		return height;
	}

	public static void displayProgramOverview()
	{
		// Display overview of program
		System.out.println("\n");
		System.out.println("**************************************");
		System.out.println("Program Overview");
		System.out.println("**************************************");
		System.out.println("The trainer enters how many athletes are on the team. "
				+ "\n Then the trainer enters each athletes weight, height, and age"
				+ "\n For each athlete the program calculates BMI and Max Heart Rate." + "\n BMI categories"
				+ "\n under 18.5: Underweight" + "" + "\n 18.5 to under 30: Normal" + "\n 30 or greater; High"
				+ "\n Calculates pertentage of Max Heart Rate for athlete training goal if needed.");
	}

	public double calculateBMI()
	{

		double currentBmi = 0;
		final int FORM_BMI = 703;

		currentBmi = FORM_BMI * (currentWeight / Math.pow(currentHeight, 2));

		return currentBmi;
	}

	// Calculate and store Max Heart Rate
	public static int calculateMhr(int passingAge)
	{
		int calcMhr = 0;
		final int MHR_FORM = 220;

		calcMhr = (MHR_FORM - passingAge);

		return calcMhr;
	}

	public String determineBMICategory()
	{

	}

	public int calculateMaxHeartRate()
	{

	}

	public void displayAthleteAnalysis()
	{
		System.out.println(name + weight + height + age);

	}
}
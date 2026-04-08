import java.util.Scanner;

/**
 * 
 */

public class BMIDesignTrainerTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		// TODO Auto-generated method stub
		int athletes = 0;
		double weight = 0;
		double height = 0;

		Scanner keyboardInput = new Scanner(System.in);
		// Display overview of program
		System.out.println("**************************************");
		System.out.println("Program Overview");
		System.out.println("**************************************");
		System.out.println("The trainer enters how many athletes are on the team. "
				+ "\n Then the trainer enters each athletes weight, height, and age"
				+ "\n For each athlete the program calculates BMI and Max Heart Rate." + "/n BMI categories"
				+ "\n under 18.5: Underweight" + "" + "\n 18.5 to under 30: Normal" + "\n 30 or greater; High"
				+ "\n Calculates pertentage of Max Heart Rate for athlete training goal if needed.");
		System.out.println("" + "\n");

		System.out.println("**************************************");
		System.out.println("Athlete Entry");
		System.out.println("**************************************");

		// Enter amount of athletes
		System.out.println("Enter the number of athletes on the team: ");
		athletes = keyboardInput.nextInt();
		while (athletes <= 0)
		{
			System.out.println("Error: Enter a value greater than 0.");
			System.out.println(athletes + "Enter the number of athletes on the team: ");
			athletes = keyboardInput.nextInt();
			if (athletes > 0)
			{
				System.out.print(athletes + "Number of athletes on the team: ");

			}

		}

	}// End of Main

	// Validating height and weight is a double
	public static double getPositiveDouble(Scanner methodInput, String prompt)
	{
		double validDouble = 0.0;
		System.out.println(prompt);

		validDouble = methodInput.nextDouble();
		while (validDouble <= 0)
		{
			System.out.println("Error, invalid entry. Enter positive double. ");
			System.out.println(prompt);
			validDouble = methodInput.nextDouble();

		}
		return validDouble;
	}

	// Athlete information (Age, BMI, MHR, Names, Weight, Height, )
	public static void enterAthleteData(double[] currentBmi, double[] currentMhr, String[] currentNames,
			Scanner inputMethod, String validPrompt)
	{

		for (int i = 0; i < currentNames.length; i++)
			currentNames[i] = inputMethod.next();
		double weight = getPositiveDouble(inputMethod, validPrompt); // Finish Method for positive double
		double height = getPositiveDouble(inputMethod, validPrompt); // Finish Method for positive double

		// currentBmi[i] = calculateBmi(); // Finish Method for BMI calc

		int age = inputMethod.nextInt();

		// currentMhr = getMhr(); // Finish method for Max Heart Rate

	}

	// Calculate and store user BMI
	public static double calculateBmi(double currentHeight, double currentWeight)
	{

		double currentBmi = 0;
		final int FORM_BMI = 703;

		currentBmi = FORM_BMI * (currentWeight / Math.pow(currentHeight, 2));

		return currentBmi;
	}

	// Calculate and store Max Heart Rate

	// Display athlete BMI Value, Category and Max Heart Rate

	// List all athletes outside normal BMI range

	// Calculate and Display Average of the Max Heart Rates

	// Identify Athlete with Highest Max Heart Rate

	// List all athletes above or equal to Max Heart Rate average

	// Calculate and Display Training Heart Rate

}// End of Class
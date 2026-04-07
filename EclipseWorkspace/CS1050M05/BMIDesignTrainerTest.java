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
		double[] weightUsed;
		double[] heightUsed;
		String[] firstNames;
		int athletes = 0;

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
			System.out.println("Enter the number of athletes on the team: ");
			athletes = keyboardInput.nextInt();
			if (athletes > 0)
			{
				System.out.print("Number of athletes on the team: " + athletes);

			}
			// String[] updatedInfo = validateAthleteInfo(weight, height, athletes, names,
			// keyboardInput);
			weightUsed = new double[athletes];
			heightUsed = new double[athletes];
			firstNames = new String[athletes];

			for (int i = 0; i < athletes; i++)
			{
				System.out.println("Enter data for athlete ");
				String name = "name";
				double weight = 0;
				double height = 0;

				System.out.println("athletes first name: ");
				name = keyboardInput.next();
				firstNames[i] = name;
				System.out.println("Enter athletes weight in pounds: ");
				weight = keyboardInput.nextDouble();
				weightUsed[i] = weight;
				System.out.println("Enter athletes height in inches: ");
				height = keyboardInput.nextDouble();
				heightUsed[i] = height;
			}
		}

	}// End of Main

	// Athlete information and validation (age, height, weight,)
	public static String[] validateAthleteInfo(double[] currentWeight, double[] currentHeight, int[] currentAthletes, String[] currentNames, Scanner inputMethod)
	{
		
		for (int i = 0; i < currentAthletes.length; i++)
	}

	// Calculate and store user BMI

	// Calculate and store Max Heart Rate

	// Display athlete BMI Value, Category and Max Heart Rate

	// List all athletes outside normal BMI range

	// Calculate and Display Average of the Max Heart Rates

	// Identify Athlete with Highest Max Heart Rate

	// List all athletes above or equal to Max Heart Rate average

	// Calculate and Display Training Heart Rate

}// End of Class

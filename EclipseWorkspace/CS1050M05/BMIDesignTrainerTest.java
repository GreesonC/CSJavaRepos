
/**
 * 
 */
import java.util.Scanner;

public class BMIDesignTrainerTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		// TODO Auto-generated method stub
		int athletes = 0;

		Scanner keyboardInput = new Scanner(System.in);
		// Display overview of program
		System.out.println("**************************************");
		System.out.println("Program Overview");
		System.out.println("**************************************");
		System.out.println("The trainer enters how many athletes are on the team. "
				+ "\n Then the trainer enters each athletes weight, height, and age"
				+ "\n For each athlete the program calculates BMI and Max Heart Rate." + "\n BMI categories"
				+ "\n under 18.5: Underweight" + "" + "\n 18.5 to under 30: Normal" + "\n 30 or greater; High"
				+ "\n Calculates pertentage of Max Heart Rate for athlete training goal if needed.");
		System.out.println("" + "\n");

		System.out.println("**************************************");
		System.out.println("Athlete Entry");
		System.out.println("**************************************");

		// Enter amount of athletes
		System.out.println("Enter the number of athletes on the team: ");
		athletes = keyboardInput.nextInt();
		String[] names = new String[athletes];
		double[] bmi = new double[athletes];
		double[] mhr = new double[athletes];
		int[] age = new int[athletes];
		while (athletes <= 0)
		{
			System.out.println("Error: Enter a value greater than 0.");
			System.out.println("\n");
			System.out.println("Enter the number of athletes on the team: ");
			athletes = keyboardInput.nextInt();
			if (athletes > 0)
			{
				System.out.print("Number of athletes on the team: " + athletes);

			}

		}
		// enterAthleteData method pass
		enterAthleteData(bmi, mhr, names, keyboardInput, age);

		// calculateMhr method pass

		// int[] passedMhr = calculateMhr(age, heartRate, names);

		// displayathletesBmiMhrCategory method
		// displayAthleteBmiMhrCategory(bmi, mhr);

	}// End of Main

	// Validating height and weight is a double
	public static double getPositiveDouble(Scanner methodInput, String positivePromptDouble)
	{
		double validDouble = 0.0;
		System.out.println(positivePromptDouble);
		validDouble = methodInput.nextDouble();
		while (validDouble <= 0)
		{
			System.out.println("Error, invalid entry. Enter positive double. ");

			validDouble = methodInput.nextDouble();

		}
		return validDouble;

	}// End of getPositiveDouble Method

	public static int getPositiveInt(Scanner methodInput, String positivePromptInt)
	{
		int validInt = 0;
		System.out.println(positivePromptInt);
		validInt = methodInput.nextInt();
		while (validInt <= 0)
		{
			System.out.println("Error, invalid entry. Enter positive int. ");

			validInt = methodInput.nextInt();

		}
		return validInt;
	}

	// Athlete information (Age, BMI, MHR, Names, Weight, Height, )
	public static void enterAthleteData(double[] currentBmi, double[] currentMhr, String[] currentNames,
			Scanner inputMethod, int[] currentAge)
	{

		for (int i = 0; i < currentNames.length; i++)
		{
			System.out.println("Enter data for " + currentNames[i]);// Fix; should display the index of athletes
			System.out.println("Enter athletes first name: ");
			currentNames[i] = inputMethod.next();

			String prompt = "Enter your weight in pounds: ";
			double weight = getPositiveDouble(inputMethod, prompt);
			System.out.println(prompt + weight);
			String prompt2 = "Enter your height in inches: ";
			double height = getPositiveDouble(inputMethod, prompt2);
			System.out.println(prompt2 + height);

			double bmiValue = calculateBmi(height, weight);// This might be disrupting the single responsibility
			bmiValue = Math.round(bmiValue);
			System.out.println("BMI: " + bmiValue);

			String promptAgeInt = "Enter athlete age in years: ";
			int ageNow = getPositiveInt(inputMethod, promptAgeInt);
			System.out.println(promptAgeInt + ageNow);
			// currentAge[i] = inputMethod.nextInt();

		}
	}// End of enterAthletesData Method

	// Calculate and store user BMI
	public static double calculateBmi(double currentHeight, double currentWeight)
	{

		double currentBmi = 0;
		final int FORM_BMI = 703;

		currentBmi = FORM_BMI * (currentWeight / Math.pow(currentHeight, 2));

		return currentBmi;
	}

	// Calculate and store Max Heart Rate
	public static int calculateMhr(int passingAge, String mhrPrompt, String storeMhrNames)
	{
		final int MHR_FORM = 220;
		int currentMhr = new int[passingAge.length];
		for (int i = 0; i < passingAge.length; i++)
		{
			currentMhr[i] = MHR_FORM - passingAge[i];
			System.out.println(mhrPrompt + storeMhrNames[i] + ": " + currentMhr[i]);
		}

		return currentMhr;
	}

	// Display athlete BMI Value, Category and Max Heart Rate
	//
	public static void displayAthleteBmiMhrCategory(double[] bmiResults, double[] mhrResults)
	{
		for (int index = 0; index < bmiResults.length; index++)
		{
			System.out.println(bmiResults[index] + "\n" + mhrResults[index]);
			if (bmiResults[index] >= 30.0)
			{
				System.out.println("Overweight");
			} else if (bmiResults[index] > 18.5)
			{
				System.out.println("Normal");
			}

			else
			{
				System.out.println("Underweight");
			}

		}

	}

	// List all athletes outside normal BMI range
	public static void athletesOutsideNorm(double[] outsideBmi)
	{

	}

	// Calculate and Display Average of the Max Heart Rates
	public static void averageHeartRate(double[] averageMhr)
	{

	}

	// Identify Athlete with Highest Max Heart Rate
	public static void displayHighestHeartRate(double[] highestMhr)
	{

	}

	// List all athletes above or equal to Max Heart Rate average
	public static void displayAboveEqualMhr(double[] aboveEqualMhr, String[] mhrNames)
	{

	}

	// Calculate and Display Training Heart Rate asking trainer to set a percentage
	public static void calcMhrYesOrNo(double[] trainerMhr, String[] namesTotal)
	{

	}
}// End of Class
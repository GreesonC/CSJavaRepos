
/**
 *  Cameron Greeson
 * CS1050 M W
 * Description: Trainer App Program that lets a trainer enter various data for each individual athlete
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
		int[] mhr = new int[athletes];
		int[] mhrAverage = new int[athletes];
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
		enterAthleteData(bmi, mhr, names, keyboardInput);

		displayAthleteBmiMhrCategory(bmi, mhr, names);

		athletesOutsideNorm(bmi, names);

		int averageMethod = averageHeartRate(mhr, athletes);

		displayHighestHeartRate(mhr, names);

		displayAboveEqualMhr(mhr, names, averageMethod);

		calcMhrYesOrNo(mhr, names, keyboardInput);
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
	public static void enterAthleteData(double[] currentBmi, int[] currentMhr, String[] currentNames,
			Scanner inputMethod)
	{

		for (int i = 0; i < currentNames.length; i++)
		{
			System.out.println("Enter data for " + currentNames[i]);// Fix; should display the index of athletes
			System.out.println("Enter athletes first name: ");
			currentNames[i] = inputMethod.next();

			String prompt = "Enter your weight in pounds: ";
			double weight = getPositiveDouble(inputMethod, prompt);
			System.out.println(weight);
			String prompt2 = "Enter your height in inches: ";
			double height = getPositiveDouble(inputMethod, prompt2);
			System.out.println(height);

			double bmiValue = calculateBmi(height, weight);
			bmiValue = Math.round(bmiValue);
			// System.out.println("BMI: " + bmiValue);

			currentBmi[i] = bmiValue;

			String promptAgeInt = "Enter athlete age in years: ";
			int ageNow = getPositiveInt(inputMethod, promptAgeInt);
			System.out.println(promptAgeInt + ageNow);

			int mhrDisplay = calculateMhr(ageNow);
			currentMhr[i] = mhrDisplay;

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
	public static int calculateMhr(int passingAge)
	{
		int calcMhr = 0;
		final int MHR_FORM = 220;

		calcMhr = (MHR_FORM - passingAge);

		return calcMhr;
	}

	// Display athlete BMI Value, Category and Max Heart Rate
	//
	public static void displayAthleteBmiMhrCategory(double[] bmiResults, int[] mhrResults, String[] categoryNames)
	{
		for (int i = 0; i < bmiResults.length; i++)
		{

			if (bmiResults[i] >= 30.0)
			{
				System.out.println("Overweight");
				System.out.println(categoryNames[i]);
			}

			else if (bmiResults[i] > 18.5)
			{
				System.out.println("Normal");
				System.out.println(categoryNames[i]);
			}

			else
			{
				System.out.println("Underweight");
				System.out.println(categoryNames[i]);
			}

		}

	}

	// List all athletes outside normal BMI range
	public static void athletesOutsideNorm(double[] outsideBmi, String[] outsideNames)
	{
		System.out.println("**************************************");
		System.out.println("Outside Normal BMI");
		System.out.println("**************************************");

		boolean outside = false;

		for (int i = 0; i < outsideBmi.length; i++)
		{

			if (outsideBmi[i] < 18.5)
			{
				System.out.println("below the normal BMI");
				System.out.println(outsideNames[i] + " " + outsideBmi[i]);
				outside = true;

			} else if (outsideBmi[i] >= 30)
			{
				System.out.println("above the normal BMI");
				System.out.println(outsideNames[i] + " " + outsideBmi[i]);
				outside = true;

			} else if (!outside)
			{
				System.out.println("There are no athletes outside normal BMI.");
			}
		}

	}

	// Calculate and Display Average of the Max Heart Rates
	public static int averageHeartRate(int[] averageMhr, int currentAthletes)
	{
		int sum = 0;
		for (int i = 0; i < averageMhr.length; i++)
		{
			sum = sum + averageMhr[i];
		}
		int average = sum / currentAthletes;

		System.out.println("The average Max Heart Rate is: " + average);

		return average;
	}

	// Identify Athlete with Highest Max Heart Rate
	public static void displayHighestHeartRate(int[] highestMhr, String[] highestAthleteName)
	{
		int highest = 0;
		for (int i = 0; i < highestMhr.length; i++)
		{
			highest = highestMhr[i];
		}

	}

	// List all athletes above or equal to Max Heart Rate average
	public static void displayAboveEqualMhr(int[] aboveEqualMhr, String[] mhrNames, int allAboveAverage)
	{

		System.out.println("**************************************");
		System.out.println(" Are above or equal to average MHR: ");
		System.out.println("**************************************");

		int placeValue = 0;
		for (int i = 0; i < aboveEqualMhr.length; i++)
		{
			if (aboveEqualMhr[i] >= allAboveAverage)
			{

				placeValue = aboveEqualMhr[i];
				System.out.println(mhrNames[i]);
			}
		}
	}

	// Calculate and Display Training Heart Rate asking trainer to set a percentage
	public static void calcMhrYesOrNo(int[] trainerMhr, String[] namesTotal, Scanner userInput)
	{
		int athletesAtPercentage = 0;
		int trainingPercentage = 0;
		boolean askContinue = false;
		System.out.println("Do you want to calculate the training heart rates? yes or no ");
		char answer = userInput.next().charAt(0);
		answer = Character.toUpperCase(answer);

		if (answer == 'Y' || answer == 'y')
		{
			askContinue = true;
			System.out.println("Enter training percentage: ");
			trainingPercentage = userInput.nextInt();
			System.out.println(trainingPercentage);

			for (int i = 0; i < trainerMhr.length; i++)
			{

				if (trainerMhr[i] >= trainingPercentage)
				{

					trainerMhr[i] = namesTotal;
					System.out.println(mhrNames[i]);
				}
			}

		} else if (answer == 'N' || answer == 'n')
		{
			askContinue = false;
		} else
		{
			System.out.println("Invalid entry. Enter yes or no ");
			answer = userInput.next().charAt(0);
			answer = Character.toUpperCase(answer);
		}

		System.out.println("**************************************");
		System.out.println(" Training Program Complete ");
		System.out.println("**************************************");

	}
}// End of Class
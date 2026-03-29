
/**
 * 
 */

import java.util.Scanner;

public class UserStoriesBMI
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		// TODO Auto-generated method stub
		// Summary
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Entering your athletes height and weight to return their BMI on these BMI ranges.\r\n"
				+ "Under 18.5: Underweight\r\n" + "18.5 to under 25: Normal\r\n" + "25 to under 30: Overweight\r\n"
				+ "30 or greater: Obese");

		boolean askContinue = askToContinue(keyboardInput);
		int athletes = 0;
		while (askContinue = true)
		{
			athletes = athletes + 1;
			String prompt = "Enter your height in inches";
			double height = getPositiveDouble(keyboardInput, prompt);

			prompt = "Enter your weight in pounds";
			double weight = getPositiveDouble(keyboardInput, prompt);

			double bmi = calculateBmi(height, weight);

			String bmiCategory = getBMICategory(bmi);
			System.out.println("Your BMI is " + bmi + "\n" + bmiCategory);

			if (askContinue = false)
			{

				// String summary = finalSummary(athletes, height, weight, bmi, askContinue);
				System.out.println("summary");
			}
		}

	}

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

	}// End of Validate double Method

	// BMI calculation
	public static double calculateBmi(double currentHeight, double currentWeight)
	{
		double currentBmi = 0;
		final int FORM_BMI = 703;

		// currentBmi = currentWeight * FORM_BMI / (currentWeight * currentHeight);
		currentBmi = FORM_BMI * (currentWeight / Math.pow(currentHeight, 2));

		return currentBmi;
	}// End of CalculateBMI method

	// Display BMI category
	public static String getBMICategory(double currentBMI)
	{

		String bmiCategory = "";

		if (currentBMI >= 30)
		{
			bmiCategory = "You're obese";
		} else if (currentBMI >= 25)
		{
			bmiCategory = "You're overweight";
		} else if (currentBMI >= 18.5)
		{
			bmiCategory = "You're a healthy weight";
		} else
		{
			bmiCategory = "You're underweight";
		}
		return bmiCategory;
	}// End of GetBMICategory

	public static boolean askToContinue(Scanner userInput)
	{
		boolean askContinue = true;
		boolean invalid = true;
		System.out.println("Do you want to add an athlete? y or n");
		char answer = userInput.next().charAt(0);
		answer = Character.toUpperCase(answer);

		if (answer == 'Y' || answer == 'y')
		{
			askContinue = true;

		} else if (answer == 'N' || answer == 'n')
		{
			askContinue = false;
		} else
		{
			System.out.println("Invalid entry. Enter y or n");
			answer = userInput.next().charAt(0);
			answer = Character.toUpperCase(answer);
		}

		return askContinue;

	}// End of Ask to continue

	// public static String finalSummary(int currentAthlete, double athleteHeight,
	// double athleteWeight, double athleteBMI, boolean question) {

	// String summary = "";
	// boolean question = false;
	// System.out.println("Athlete " + currentAthlete + "has Height and Weight of "
	// + athleteHeight + athleteWeight + "total BMI is " + athleteBMI);

	// return summary;
	// }

}// End of Main

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
		String prompt = "Enter your height in inches";
		double height = getPositiveDouble(keyboardInput, prompt);

		prompt = "Enter your weight in pounds";
		double weight = getPositiveDouble(keyboardInput, prompt);

		double bmi = calculateBmi(height, weight);
		System.out.println("Your BMI is " + bmi);

		String bmiCategory = getBMICategory(bmi);
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

		String bmiCategory;

		if (currentBMI >= 30)
		{
			System.out.println("You're Obese");
		} else if (currentBMI >= 25)
		{
			System.out.println("You're Overweight");
		} else if (currentBMI >= 18.5)
		{
			System.out.println("You're Normal Weight");
		} else
		{
			System.out.println("You're Underweight");
		}
		return bmiCategory;
	}

	public static void printSummary()
	{

	}
	// loop back to add more athletes
}


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
		System.out.println("Entering your athletes height and weight to return their BMI on these BMI ranges.\r\n"
				+ "Under 18.5: Underweight\r\n" + "18.5 to under 25: Normal\r\n" + "25 to under 30: Overweight\r\n"
				+ "30 or greater: Obese");

		// final double FORM_BMI = 703;

	}

	public static double validate(double currentHeight, double currentWeight)
	{
		double currentWeight = 0.0;

		double currentHeight = 0.0;

		double bmi = 0.0;

		Scanner keyboardInput = new Scanner(System.in);
		currentWeight = keyboardInput.nextDouble();
		currentHeight = keyboardInput.nextDouble();

		if (currentWeight <= 0.0 && currentHeight <= 0.0)
			;
		System.out.println("Invalid entry. Enter a postive double.");

	}

	// BMI calculation
	public static double calculateBmi(double currentBmi)
	{

		currentBmi = weight * FORM_BMI / (height * height);

	}

	// Display athletes BMI value and category
	public static void printSummary()
	{

	}
	// loop back to add more athletes
}

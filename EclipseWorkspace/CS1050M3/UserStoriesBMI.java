
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
		String prompt = "Enter your height";
		double height = validate(keyboardInput, prompt);
		// final double FORM_BMI = 703;

	}

	public static double validate(Scanner methodInput, String prompt)
	{
		double validDouble = 0.0;
		System.out.println(prompt);

		validDouble = methodInput.nextDouble();

		return validDouble;
	}

	// BMI calculation
	public static double calculateBmi(double currentHeight, double currentWeight)
	{
		double currentBmi = 0;
		final int FORM_BMI = 703;

		currentBmi = currentWeight * FORM_BMI / (currentWeight * currentHeight);

		return currentBmi;
	}

	// Display athletes BMI value and category
	public static void printSummary()
	{

	}
	// loop back to add more athletes
}

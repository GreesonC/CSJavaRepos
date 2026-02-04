/**
 * Name: Cameron Greeson Class: 1050 (M/W) Description: Calculating finals
 * Calculate the BMI using formula in US units. User will enter weight in pounds
 * and height in inches
 */

// ADD CODE to import Scanner class

public class BodyMassIndexActivity
{

	public static void main(String[] args)
	{

		// Create constant an variables
		// constants
		final int FORM_BMI = 703;
		
		// factor formula in pounds
		// Variables
		int weight = (0.0)
		int height = (0.0)
		
		
		// The user's weight
		// The user's height
		// The user's BMI

		// Create a Scanner object for scanning input from keyboard
		Scanner keyboardInput = new Scanner(System.in);
		// Tell the user what the program will do.
		System.out.println("This program will calculate your " + "body mass index, or BMI.");

		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		// ADD CODE to input next double for weight

		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// ADD CODE input next double for height

		// Calculate the user's body mass index.
		bmi = weight * BMI_US_FACTOR / (height * height);

		// Display the user's BMI.
		System.out.printf("Your body mass index (BMI) is %f", bmi);

	}
}
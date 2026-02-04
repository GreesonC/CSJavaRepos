
/**
 * This program takes user input to see if they can guess the 
 * random number generated. Add comments to explain the code.
 */

import java.util.Scanner;

public class GuessNumber
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// the command final is a constant(not changing)& int is telling us there's an
		// int being place using All CAPS and setting it to 100
		final int RANDOM_MULTIPLIER = 100;
		// int number = random number under >100
		int number = (int) (Math.random() * RANDOM_MULTIPLIER) + 1;

		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("Guess a magic number between 0 and 100");

		int guess = -1;
		while (guess != number)
		{

			System.out.print("\nEnter your guess: ");
			guess = keyboardInput.nextInt();

			if (guess == number)
			{
				System.out.println("Yes, the number is " + number);
			} else if (guess > number)
			{
				System.out.println("Your guess is too high");
			} else
			{
				System.out.println("Your guess is too low");
			}
		}
		keyboardInput.close();
	}// end of main
}// end of class

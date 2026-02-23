
/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class L06MathCharsStrings
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		// char charTest = 'a';

		// int charAsciiValue = (int) charTest;

		// 7.
		// a) String tells the system that a list of characters are going to be listed.
		// A Char is just one single character 'A'
		// b) Reading in a String will using next() reads whatever String was placed and
		// stops at a white space.
		// you read a char by using next().charAt(0) and its reading the character at
		// the first position of the String
		// c) charAt(0) its reading the character in the first position. if it was "Cam"
		// the Char would be "C"
		// d)
		// e) Combining all the strings you listed

		String firstName = "Cameron";
		String lastName = "Greeson";
		String noun = "Box";
		String verb = "running";
		String adj = "loud";
		String place = "prison";
		String characterType = "character";
		int stringlength = firstName.length();
		char firstInitial = firstName.charAt(0);
		char lastInitial = lastName.charAt(0);

		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("Enter a first name:");
		firstName = keyboardInput.next();

		System.out.println("Enter a last name:");
		lastName = keyboardInput.next();

		System.out.println("Enter a noun");
		noun = keyboardInput.next();

		System.out.println("Enter a verb ending in -ing");
		verb = keyboardInput.next();

		System.out.println("Enter an adjective");
		adj = keyboardInput.next();

		System.out.println("Enter a place");
		place = keyboardInput.next();

		System.out.println("Enter your favorite letter");
		char favoriteLetter = keyboardInput.next().charAt(0);

		// Issue: If a place entered is two words "New York" it will only give you the
		// first one "New"
		String story = firstName + " " + lastName + " was " + verb + " with a " + adj + " " + noun + "."
				+ " they traveled to " + place + "." + " and their favorite letter is " + favoriteLetter + "'.";

		System.out.println("Your Mad Lib Story");
		System.out.println(story);
		// System.out.println("First name " + firstName);

		// System.out.println("Enter the initial of your last name");

		// char lastInitial = input.next().charAt(0);

		// System.out.println(summary);

		keyboardInput.close();

	}
// End of Main
}// End of Class

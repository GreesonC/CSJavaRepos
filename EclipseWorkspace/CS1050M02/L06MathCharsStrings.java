
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

		char charTest = 'a';

		int charAsciiValue = (int) charTest;

		String firstName = "Cameron";

		int stringlength = firstName.length();

		char firstInitial = firstName.charAt(0);

		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("Enter first name");

		firstName = keyboardInput.next();
		
		System.out.println("First name" + firstName);

		System.out.println("Enter your the initial of your last name");

		System.out.printf("char: %c ascii value: %d \n", charTest, charAsciiValue);

		System.out.println("Hello" + firstName);

		char lastInitial = input.next().charAt(0);
		
		String summary = ("Hello" + firstName + " " lastInitial + ".");
		
	}

}

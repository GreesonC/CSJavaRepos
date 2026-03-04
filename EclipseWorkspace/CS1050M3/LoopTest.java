
/**
 * 
 */
import java.util.Scanner;

public class LoopTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// PART 1
		Scanner userInput = new Scanner(System.in);
		// Add int
		int exponent = 0;
		do
		{
			System.out.println("Enter a positive number for exponent. ");
			exponent = userInput.nextInt();
			if (exponent <= 0)
			{
				System.out.println("Invalid answer. ");
			}
		} while (exponent <= 0);
		if (exponent > 0)
			;
		{
			System.out.println("The exponent is: " + exponent);
		}

	}
}

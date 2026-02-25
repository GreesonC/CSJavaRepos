
/**
 * 
 */
import java.util.Scanner;

public class LoopTestPart2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		double base = (0);
		int exponent = (0);
		do
		{
			System.out.println("Enter a base (can be double)");
			base = userInput.nextDouble();
			System.out.println("Enter a positive number for exponent. ");
			exponent = userInput.nextInt();
			if (exponent <= 0)
			{
				System.out.println("Invalid answer. Enter a postive exponent.");
			}
		} while (exponent <= 0);
		if (exponent > 0)
			;
		{
			System.out.println(base + " raised to the exponent " + exponent + " is ");
			for (; exponent > 0;)
				;
			{

			}
		}
	}
}
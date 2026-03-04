
/**
 * 
 */
import java.util.Scanner;

public class CalculateSum
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int max = 0;
		int sum = 0;

		Scanner userInput = new Scanner(System.in);
		max = userInput.nextInt();
		sum = calculateSum(max);
	}// End of Main

	public static int calculateSum(int currentMax)
	{

		int currentSum = 0;

		for (int counter = currentMax; counter > 0; counter--)
		{
			System.out.println(currentSum = currentSum + counter);

		}
		System.out.println("sum is " + currentSum);

		System.out.println("max is " + currentMax);

		return currentSum;
	}// End of calculateSum
}// End of Class


/** Cameron Greeson
 * CS1050 (M-W)
 * Description: Create a select seating program
 */
import java.util.Scanner;

public class ConcertTickets
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Create constants for seating
		char front = 'F';
		char center = 'C';
		char side = 'S';
		char upper = 'U';
		int section = '0';
		int rownumber = (0);

		Scanner keyboardInput = new Scanner(System.in);

		// Ask to enter seating section
		System.out.println("F: Front");
		System.out.println("C: Center");
		System.out.println("S: Side");
		System.out.println("U: Upper");

		System.out.println("Enter your preffered section: ");
		// Enter your option
		section = keyboardInput.next().charAt(0);
		if (section = 'F')

	}

}

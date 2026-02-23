
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
		char front = 'f';
		char center = 'c';
		char side = 's';
		char upper = 'u';
		char section = '0';
		int rownumber = (0);

		Scanner keyboardInput = new Scanner(System.in);

		// Ask to enter seating section
		System.out.println("F: Front");
		System.out.println("C: Center");
		System.out.println("S: Side");
		System.out.println("U: Upper");

		System.out.println("Enter your preffered section: ");
		// Enter your option
		// section = Character.toUpperCase(section);
		section = keyboardInput.next().charAt(0);
		section = Character.toUpperCase(section);
		switch (section)
		{
		case 'F':
		{
			System.out.println("Front Section Selected");
			break;
		}
		case 'C':
		{
			System.out.println("Center Section Selected");
			break;
		}
		case 'S':
		{
			System.out.println("Side Section Selected");
			break;
		}
		case 'U':
		{
			System.out.println("Upper Section Selected");
			break;
		}
		default:
		{
			System.out.println("Invalid Section Selected");
		}
		}// end switch

		// Row number input
		System.out.println("Choose your row number (1-60)");
		rownumber = keyboardInput.nextInt();

		if (rownumber <= 60)
		{
			System.out.println("section:" + section + " Row " + rownumber + " selected: $200");
		} else if (rownumber <= 30)
		{
			System.out.println("section:" + section + "Row " + rownumber + " selected: $300");
		} else if (rownumber <= 15)
		{
			System.out.println("section:" + section + ",Row " + rownumber + " selected: $200");
		} else
			System.out.println("Invalid Selection, program ending.");
		// Row number result
		{
			// String ticket = section + rownumber +
		}
	}

}

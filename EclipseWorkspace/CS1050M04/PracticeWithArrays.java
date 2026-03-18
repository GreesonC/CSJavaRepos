
/**
 * 
 * LabL15ArraysIntro
 */
import java.util.Scanner;

public class PracticeWithArrays
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);

		double[] finalGrades;
		String[] firstNames;
		int students = 0;

		System.out.println("How many students are in the class? ");
		students = keyboardInput.nextInt();
		System.out.println("There are " + students + " students in the class.");
		finalGrades = new double[students];
		firstNames = new String[students];
		for (int i = 0; i < students; i++)
		{
			String name = "name";
			double grades = 0.0;
			System.out.println("Enter students name ");
			name = keyboardInput.next();
			firstNames[i] = name;
			System.out.println("Enter students grade as a double ");
			grades = keyboardInput.nextDouble();
			finalGrades[i] = grades;
		}

		double currentSum = 0;
		for (int index = 0; index < finalGrades.length; index++)
		{
			currentSum = currentSum + finalGrades[index];
			System.out.println(currentSum);
		}
	}// End of Main
} // End of Class
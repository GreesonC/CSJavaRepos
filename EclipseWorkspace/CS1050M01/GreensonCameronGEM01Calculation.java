/*
 * Name: Cameron Greeson
 * Class: 1050 (M/W)
 * Description: Calculating finals grades based on the category weights
 */

public class GreensonCameronGEM01Calculation
{

	{

	}// main

//Class GE01

	/**
	 * @param args finalGrade
	 * @return
	 */
	public static void main(String[] args)
	{
		System.out.println("class participation .15");
		System.out.println(.15 * 95);
		System.out.println("guided exploration 20%");
		System.out.println(.20 * 92);
		System.out.println("quizzes .25");
		System.out.println(.25 * 88);
		System.out.println("projects .20");
		System.out.println(.20 * 87);
		System.out.println("final demonstration .20");
		System.out.println(.20 * 93);
	}

	/**
	 * @param finalGrade
	 * @return
	 */
	public static char getLetterGrade(double finalGrade)
	{
		char letterGrade = ' ';
		if (finalGrade >= 90)
		{
			letterGrade = 'A';
		} else if (finalGrade >= 80)
		{
			letterGrade = 'B';
		} else if (finalGrade >= 70)
		{
			letterGrade = 'C';
		} else if (finalGrade >= 60)
		{
			letterGrade = 'D';
		} else if (finalGrade >= 50)
		{
			letterGrade = 'F';
		}

		return letterGrade;
	}
}
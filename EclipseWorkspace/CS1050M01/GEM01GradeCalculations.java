/*
 * Name: Cameron Greeson 
 * Class: 1050 (M/W) 
 * Description: Calculating finals
 * grades based on the category weights
 */
public class GEM01GradeCalculations
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Percentage Constants
		final double CLASS_PART_WEIGH = .15;
		final double CLASS_EXPLOR_WEIGH = .20;
		final double CLASS_QUIZZES = .25;
		final double PROJECTS = .20;
		final double FINAL_DEMO = .20;
		// Variable Grades
		double classpart = (95.0);
		double classexplor = (92.0);
		double quizzes = (88.0);
		double projects = (87.0);
		double finaldemo = (93.0);

		// grades * weight
		System.out.print("Final Grade Calculations:");

		System.out.println((classpart * CLASS_PART_WEIGH) + (classexplor * CLASS_EXPLOR_WEIGH)
				+ (quizzes * CLASS_QUIZZES) + (projects * PROJECTS) + (finaldemo * FINAL_DEMO));
		//
	}
	// end of main
}// end of class

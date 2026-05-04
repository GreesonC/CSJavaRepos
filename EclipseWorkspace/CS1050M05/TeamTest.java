/**
 * 
 */

/**
 * 
 */
public class TeamTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Athlete athlete1 = new Athlete("Mac", 155, 69, 23);
		Athlete athlete2 = new Athlete("Cameron", 150, 69, 26);
		Athlete athlete3 = new Athlete("Pete", 190, 72, 21);

		TestTeam team = new TestTeam("Nuggets", 3);

		team.addAthlete(athlete1);
		team.addAthlete(athlete2);
		team.addAthlete(athlete3);
		team.displayAthleteResults();
		System.out.println();

		team.displayAthletesOutsideNormalBMI();
		System.out.println();

	}

}

class TestTeam
{
	private String teamName;
	private Athlete[] athletes;
	private int athleteCount;

	public TestTeam(String teamName, int maxAthletes)
	{
		this.teamName = teamName;
		athletes = new Athlete[maxAthletes];
		athleteCount = 0;
	}

	public String getTeamName()
	{
		return teamName;
	}

	public int getAthleteCount()
	{
		return athleteCount;
	}

	public void addAthlete(Athlete athlete)
	{
		if (athleteCount < athletes.length)
		{
			athletes[athleteCount] = athlete;
			athleteCount++;
		}

		else
		{
			System.out.println("No more Athletes");
		}
	}

	public void displayAthleteResults()
	{
		for (int index = 0; index < athleteCount; index++)
		{
			athletes[index].displayAthleteAnalysis();
			System.out.println();
		}
	}

	public void displayAthletesOutsideNormalBMI()
	{
		boolean outside = false;

		// String outsideAthlete = determineBMICategory();

		for (int i = 0; i < athleteCount; i++)
		{
			double outsideAthlete = athletes[i].calculateBMI();

			if (athleteCount < 18.5)
			{
				System.out.println("below the normal BMI " + outsideAthlete);
				outside = true;

			} else if (outsideAthlete >= 30)
			{
				System.out.println("above the normal BMI: " + outsideAthlete);
				outside = true;

			} else if (!outside)
			{
				System.out.println("There are no athletes outside normal BMI.");
			}
		}
	}

	public double calculateAverageMaxHeartRate()
	{
		double sum = 0;
		for (int i = 0; i < athleteCount; i++)
		{
			sum = athletes[i].calculateMaxHeartRate();
		}
		double average = sum / athleteCount;

		System.out.println("The average Max Heart Rate is: " + average);

		return average;
	}

	public void displayAthletesAboveAverageMHR()
	{
		boolean outside = false;

		for (int i = 0; i < athleteCount; i++)
		{
			int aboveMHR = athletes[i].calculateMaxHeartRate();
			double carryAverage = calculateAverageMaxHeartRate();

			if (athleteCount > carryAverage)
			{
				System.out.println("Above average MHR: " + aboveMHR);

			} else if (!outside)
			{
				System.out.println("There are no athletes above Average MHR.");
			}
		}
	}

	public void displayHighestMHR()
	{
		int highestMHR = 0;
		for (int i = 0; i < athleteCount; i++)
		{
			highestMHR = athletes[i].calculateMaxHeartRate();

		}
	}

	public void displaySmallestLargestHeight()
	{

	}

	public void writeAthletesToFile(String fileName)
	{

	}
}
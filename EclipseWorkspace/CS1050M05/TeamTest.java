
/**
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
		Athlete athlete2 = new Athlete("Cameron", 150, 50, 26);
		Athlete athlete3 = new Athlete("Pete", 190, 72, 21);

		TestTeam team = new TestTeam("Nuggets", 3);

		team.addAthlete(athlete1);
		team.addAthlete(athlete2);
		team.addAthlete(athlete3);

		team.displayAthleteResults();
		System.out.println();

		team.displayAthletesOutsideNormalBMI();
		System.out.println();

		team.displayAthletesAboveAverageMHR();
		System.out.println();

		team.displayHighestMHR();
		System.out.println();

		team.displaySmallestLargestHeight();
		System.out.println();

		try
		{
			TestTeam testTeam = new TestTeam("Nuggets", 3);
			testTeam.writeAthletesToFile("Nuggets.txt");
		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find this file: ");

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
			boolean outsideNormalBMI = false;

			// String outsideAthlete = determineBMICategory();

			for (int i = 0; i < athleteCount; i++)
			{
				double outsideAthlete = athletes[i].calculateBMI();

				if (outsideAthlete < 18.5)
				{
					System.out.println("below the normal BMI " + athletes[i].getName());
					outsideNormalBMI = true;

				} else if (outsideAthlete >= 30)
				{
					System.out.println("above the normal BMI: " + athletes[i].getName());
					outsideNormalBMI = true;

				} else if (!outsideNormalBMI)
				{

				}
			}
		}

		public double calculateAverageMaxHeartRate()
		{
			double sum = 0;
			for (int i = 0; i < athleteCount; i++)
			{
				sum = sum + athletes[i].calculateMaxHeartRate();
			}
			double average = sum / athleteCount;
			average = Math.round(average);
			System.out.println("The average Max Heart Rate is: " + average);

			return average;
		}

		public void displayAthletesAboveAverageMHR()
		{
			double carryAverage = calculateAverageMaxHeartRate();
			boolean outsideAverageMHR = false;

			for (int i = 0; i < athleteCount; i++)
			{
				int currentMHR = athletes[i].calculateMaxHeartRate();

				if (currentMHR > carryAverage)
				{
					System.out.println("\n Above average MHR: " + athletes[i].getName() + ", " + currentMHR);
					outsideAverageMHR = true;
				}
			}

			if (!outsideAverageMHR)
			{
				System.out.println("\n There are no athletes above Average MHR.");
			}
		}

		public void displayHighestMHR()
		{
			int highestMHR = athletes[0].calculateMaxHeartRate();
			Athlete highestAthlete = athletes[0];

			for (int i = 1; i < athleteCount; i++)
			{
				int currentMHR = athletes[i].calculateMaxHeartRate();

				if (currentMHR > highestMHR)
				{
					highestMHR = currentMHR;
					highestAthlete = athletes[i];
				}

			}
			System.out.println("Highest Max Heart Rate: " + highestAthlete.getName() + ", " + highestMHR);

		}

		public void displaySmallestLargestHeight()
		{
			Athlete smallestAthlete = athletes[0];
			Athlete largestAthlete = athletes[0];

			for (int index = 1; index < athleteCount; index++)
			{

				if (athletes[index].getHeight() < smallestAthlete.getHeight())
				{
					smallestAthlete = athletes[index];
				} else if (athletes[index].getHeight() > largestAthlete.getHeight())
				{
					largestAthlete = athletes[index];
				}
			}

			System.out.println("Smallest height: " + smallestAthlete.getName() + ", " + smallestAthlete.getHeight());
			System.out.println("Largest height: " + largestAthlete.getName() + ", " + largestAthlete.getHeight());
		}

		public void writeAthletesToFile(String teamFile) throws FileNotFoundException
		{
			File outputFile = new File(teamFile);
			PrintWriter fileWriter = new PrintWriter(outputFile);
			fileWriter.println("Write Information");
			fileWriter.close();
			System.out.println("Data Written to File: " + outputFile.getAbsolutePath());
		}
	}
}

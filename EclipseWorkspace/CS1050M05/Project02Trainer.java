import java.io.FileNotFoundException;

/*
 * 
 */

public class Project02Trainer
{
	public static void main(String[] args)
	{
		displayProgramSummary();

		// ===== TEST 1 =====
		String fileName = "team1.txt";

		try
		{
			System.out.println("\nTesting file: " + fileName);

			Team team = new Team("Nuggets", 6);

			teamSetUp(fileName, team);

			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}

		// ===== TEST 2 =====
		fileName = "team2.txt";

		try
		{
			System.out.println("\nTesting file: " + fileName);

			Team team = new Team("Team CS", 4);

			teamSetUp(fileName, team);

			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}

		System.out.println("\nEnd of program");
	}

	public static void teamSetUp(String fileName, Team team) throws FileNotFoundException
	{
		// fill in reading information from a file
	}

	public static void runAnalysis(Team team) throws FileNotFoundException
	{
		System.out.println("\n========== Team Analysis ==========");
		System.out.println("Team: " + team.getTeamName());
		System.out.println("Total Athletes: " + team.getAthleteCount());
		System.out.println();

		team.displayAthleteResults();
		team.displayAthletesOutsideNormalBMI();

		double avg = team.calculateAverageMaxHeartRate();
		System.out.println("\nAverage Max Heart Rate: " + avg);

		team.displayAthletesAboveAverageMHR(avg);
		team.displayHighestMHR();
		team.displaySmallestLargestHeight();
		String outputFileName = team.getTeamName() + ".txt";
		team.writeAthletesToFile(outputFileName);

	}

	// ================= DISPLAY =================

	public static void displayProgramSummary()
	{
		System.out.println("**************************************");
		System.out.println("Team and Athlete Analysis");
		System.out.println("**************************************");
		System.out.println("Reads athlete data from file");
		System.out.println("Displays athlete results");
		System.out.println("Performs team analysis");
		System.out.println("Writes results to file");
		System.out.println();
	}
}

// ================= ADD ATHLETE CLASS =================
class Athlete
{
	private String name;
	private double weight;
	private double height;
	private int age;

	public Athlete(String name, double weight, double height, int age)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public double getHeight()
	{
		return height;
	}

	public static void displayProgramOverview()
	{
		// Display overview of program
		System.out.println("\n");
		System.out.println("**************************************");
		System.out.println("Program Overview");
		System.out.println("**************************************");
		System.out.println("The trainer enters how many athletes are on the team. "
				+ "\n Then the trainer enters each athletes weight, height, and age"
				+ "\n For each athlete the program calculates BMI and Max Heart Rate." + "\n BMI categories"
				+ "\n under 18.5: Underweight" + "" + "\n 18.5 to under 30: Normal" + "\n 30 or greater; High"
				+ "\n Calculates pertentage of Max Heart Rate for athlete training goal if needed.");
	}

	public double calculateBMI()
	{

		double currentBmi = 0;
		final int FORM_BMI = 703;

		currentBmi = FORM_BMI * (weight / Math.pow(height, 2));
		currentBmi = Math.round(currentBmi);
		return currentBmi;
	}

	// Calculate and store Max Heart Rate
	public static int calculateMhr(int passingAge)
	{
		int calcMhr = 0;
		final int MHR_FORM = 220;

		calcMhr = (MHR_FORM - passingAge);

		return calcMhr;
	}

	public String determineBMICategory()
	{
		double bmi = calculateBMI();
		if (bmi >= 30.0)
		{
			return "Overweight";

		}

		else if (bmi > 18.5)
		{
			return "Normal";
		}

		else
		{
			return "Underweight";
		}

	}

	public int calculateMaxHeartRate()
	{
		int calcMhr = 0;
		final int MHR_FORM = 220;

		calcMhr = (MHR_FORM - age);

		return calcMhr;
	}

	public void displayAthleteAnalysis()
	{
		System.out
				.println(name + ", " + calculateBMI() + ", " + determineBMICategory() + ", " + calculateMaxHeartRate());

	}
}

// ================= ADD TEAM CLASS =================
class Team
{
	private String teamName;
	private Athlete[] athletes;
	private int athleteCount;

	public Team(String teamName, int maxAthletes)
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
			System.out.println(athletes[index]);
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
				System.out.println("below the normal BMI");
				System.out.println(athletes + " " + athletes);
				outside = true;

			} else if (outsideAthlete >= 30)
			{
				System.out.println("above the normal BMI");
				System.out.println(outsideAthlete + " " + outsideAthlete);
				outside = true;

			} else if (!outside)
			{
				System.out.println("There are no athletes outside normal BMI.");
			}
		}
	}

	public double calculateAverageMaxHeartRate()
	{
		int sum = 0;
		for (int i = 0; i < athleteCount; i++)
		{
			sum = athletes[i].calculateMaxHeartRate();
		}
		int average = sum / athleteCount;

		System.out.println("The average Max Heart Rate is: " + average);

		return average;
	}

	public void displayAthletesAboveAverageMHR()
	{

	}

	public void displayHighestMHR()
	{

	}

	public void displaySmallestLargestHeight()
	{

	}

	public void writeAthletesToFile(String fileName)
	{

	}
}
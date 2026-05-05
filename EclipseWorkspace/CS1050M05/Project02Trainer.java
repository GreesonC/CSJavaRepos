
/*
 * Cameron Greeson
 * CS 1050 M W
 * Description: Allows multiple teams to be inputed and athlete information from file
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Project02Trainer
{
	public static void main(String[] args)
	{
		displayProgramSummary();

		// ===== TEST 1 =====
		String teamFile = "team1.txt";

		try
		{
			System.out.println("\nTesting file: " + teamFile);

			Team team = new Team("Nuggets", 6);

			teamSetUp(teamFile, team);

			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + teamFile);
		}

		// ===== TEST 2 =====
		teamFile = "team2.txt";

		try
		{
			System.out.println("\nTesting file: " + teamFile);

			Team team = new Team("Team CS", 4);

			teamSetUp(teamFile, team);

			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + teamFile);
		}

		System.out.println("\nEnd of program");
	}

	public static void teamSetUp(String fileName, Team team) throws FileNotFoundException
	{
		// fill in reading information from a file
		File inputFile = new File(fileName);
		Scanner fileReader = new Scanner(inputFile);

		while (fileReader.hasNext())
		{
			String name = fileReader.next();
			double weight = fileReader.nextDouble();
			double height = fileReader.nextDouble();
			int age = fileReader.nextInt();

			Athlete athlete = new Athlete(name, weight, height, age);
			team.addAthlete(athlete);
		}

		fileReader.close();
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

		team.displayAthletesAboveAverageMHR();
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
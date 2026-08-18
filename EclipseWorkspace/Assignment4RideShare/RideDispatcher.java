
import java.util.Scanner;

public class RideDispatcher
{
	private static LinkedQueue<RideRequest> rideQueue = new LinkedQueue<>();
	private static int totalRides = 0;
	private static long totalWaitSeconds = 0;
	private static long longestWaitSeconds = 0;

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		boolean running = true;

		while (running)
		{
			System.out.println("\nRideshare Dispatch Menu:");
			System.out.println("1. New Ride Request");
			System.out.println("2. Assign Next Driver");
			System.out.println("3. View Queue");
			System.out.println("4. Show Statistics");
			System.out.println("5. Exit");
			System.out.println("\nPlease choose one.");

			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (choice)
			{
			case 1 -> addRequest(scanner);
			case 2 -> assignDriver();
			case 3 -> viewQueue();
			case 4 -> showStats();
			case 5 -> running = false;
			default -> System.out.println("Invalid choice.");
			}
		}
		scanner.close();
	}

	private static void addRequest(Scanner scanner)
	{
		// TO COMPLETE
		System.out.print("Enter passenger name: ");
		String passengerName = scanner.nextLine();

		System.out.print("Enter pickup location: ");
		String pickupLocation = scanner.nextLine();

		System.out.print("Enter destination: ");
		String destination = scanner.nextLine();

		RideRequest newRequest = new RideRequest(passengerName, pickupLocation, destination);

		rideQueue.enqueue(newRequest);

		System.out.println("\nRide request added to the queue.");
		System.out.println(newRequest);

	}

	private static void assignDriver()
	{
		if (rideQueue.isEmpty())
		{
			System.out.println("No rides in queue.");
		} else
		{
			RideRequest next = rideQueue.dequeue();
			next.assignNow(); // record time
			long wait = next.getWaitTimeSeconds();

			totalRides++;
			totalWaitSeconds += wait;
			if (wait > longestWaitSeconds)
				longestWaitSeconds = wait;

			System.out.println("Assigned driver to:\n" + next);
			System.out.println("Wait time: " + wait + " seconds");
		}
	}

	private static void viewQueue()
	{
		if (rideQueue.isEmpty())
		{
			System.out.println("No pending rides.");
		} else
		{
			System.out.println("Pending Rides:");
			rideQueue.printQueue();
		}
	}

	private static void showStats()
	{
		System.out.println("\n--- Dispatch Statistics ---");
		System.out.println("Total rides assigned: " + totalRides);
		if (totalRides > 0)
		{
			System.out.println("Average wait time: " + (totalWaitSeconds / totalRides) + " seconds");
			System.out.println("Longest wait time: " + longestWaitSeconds + " seconds");
		}
	}
}
